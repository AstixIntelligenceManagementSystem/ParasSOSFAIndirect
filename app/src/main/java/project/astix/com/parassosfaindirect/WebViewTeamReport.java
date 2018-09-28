package project.astix.com.parassosfaindirect;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.astix.Common.CommonInfo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

public class WebViewTeamReport extends AppCompatActivity {
    PRJDatabase dbengine=new PRJDatabase(this);
    String imei;
    ProgressDialog progressDialog;
    public	Timer timer;
    public MyTimerTask myTimerTask;
    String ImageUrl;
    public String ReportClick="0";

    public WebView webView;
    private SharedPreferences sharedPref;
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        // TODO Auto-generated method stub
        if(keyCode==KeyEvent.KEYCODE_BACK){
            return true;
        }
        if(keyCode==KeyEvent.KEYCODE_HOME){
            return true;
        }
        if(keyCode==KeyEvent.KEYCODE_MENU){
            return true;
        }
        if(keyCode==KeyEvent.KEYCODE_SEARCH){
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    public void customHeader()
    {
        TextView tv_heading=(TextView) findViewById(R.id.order_detail);
        if(ReportClick.equals("2"))
        {
            tv_heading.setText(getString(R.string.individual_dsr));
        }
        else {
            tv_heading.setText(getString(R.string.full_territory));
        }


        ImageView imgVw_back=(ImageView) findViewById(R.id.btn_bck);


        imgVw_back.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                finish();
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_team_report);

        TelephonyManager tManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        imei = tManager.getDeviceId();


        if(CommonInfo.imei.trim().equals(null) || CommonInfo.imei.trim().equals(""))
        {
            imei = tManager.getDeviceId();
            CommonInfo.imei=imei;
        }
        else
        {
            imei= CommonInfo.imei.trim();
        }

        Intent intentData=getIntent();
        ReportClick=intentData.getStringExtra("ReportClick");

        customHeader();
        if(isOnline())
        {

            if (timer!=null)
            {
                timer.cancel();
                timer = null;
            }

            timer = new Timer();
            myTimerTask = new  MyTimerTask();

            timer.schedule(myTimerTask,30000);

            try
            {
                progressDialog = new ProgressDialog(WebViewTeamReport.this);
                progressDialog.setMessage("Please Wait...");
                progressDialog.setCancelable(false);



                int ApplicationID= CommonInfo.Application_TypeID;

                ImageUrl="";
                if(ReportClick.equals("2"))
                {
                    ImageUrl= CommonInfo.WebPageUrlTeamReport.trim();
                }
                if(ReportClick.equals("1"))
                {
                    ImageUrl= CommonInfo.WebPageUrlFullTeritory.trim();
                }
                long syncTIMESTAMP = System.currentTimeMillis();
                Date datefromat = new Date(syncTIMESTAMP);
                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                String onlyDate=df.format(datefromat);
                //imei=352801088236109&date=24-Sep-2018&scope=2
                if(ReportClick.equals("2")) {
                    ImageUrl = ImageUrl + "imei=" + imei + "&date=" + onlyDate + "&scope=2";
                }
                if(ReportClick.equals("1")) {
                    String txt=dbengine.fngettblSOPersonName();



                    ImageUrl = ImageUrl + "imei=" + imei + "&date=" + onlyDate + "&salesnid="+txt.split(Pattern.quote("^"))[0]+"&salesntype="+txt.split(Pattern.quote("^"))[1]+"&scope=3&txt="+txt.split(Pattern.quote("^"))[2];
                }
                webView=(WebView) findViewById(R.id.webView);
                webView.setWebViewClient(new MyBrowser(progressDialog));
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.loadUrl(ImageUrl);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }


        }
        else
        {
            showNoConnAlert();
        }
    }

    public boolean isOnline()
    {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected())
        {
            return true;
        }
        return false;
    }
    public void showNoConnAlert()
    {
        AlertDialog.Builder alertDialogNoConn = new AlertDialog.Builder(WebViewTeamReport.this);
        alertDialogNoConn.setTitle(R.string.genTermNoDataConnection);
        alertDialogNoConn.setMessage(R.string.genTermNoDataConnectionFullMsg);
        alertDialogNoConn.setCancelable(false);
        alertDialogNoConn.setNeutralButton(R.string.txtOk,
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.dismiss();

                    }
                });
        alertDialogNoConn.setIcon(R.drawable.error_ico);
        AlertDialog alert = alertDialogNoConn.create();
        alert.show();

    }


    class MyTimerTask extends TimerTask
    {

        @Override
        public void run()
        {

            runOnUiThread(new Runnable()
            {

                @Override
                public void run()
                {

                    if(progressDialog.isShowing())
                    {
                        //  progressDialog.cancel();
                        //  webView.setVisibility(View.GONE);
                        AlertDialog.Builder alertDialogNoConn = new AlertDialog.Builder(WebViewTeamReport.this);
                        alertDialogNoConn.setTitle("Internet issue");
                        //alertDialogNoConn.setMessage(getText(R.string.syncAlertErrMsggg));
                        alertDialogNoConn.setMessage(getText(R.string.internetslowMsggg));
                        alertDialogNoConn.setCancelable(false);
                        alertDialogNoConn.setPositiveButton("OK",
                                new DialogInterface.OnClickListener()
                                {
                                    public void onClick(DialogInterface dialog, int which)
                                    {
                                        dialog.dismiss();

                                    }
                                });
                        alertDialogNoConn.setNegativeButton("Abort/Cancle",
                                new DialogInterface.OnClickListener()
                                {
                                    public void onClick(DialogInterface dialog, int which)
                                    {
                                        progressDialog.cancel();
                                        dialog.dismiss();

                                        Bundle bundle=new Bundle();
                                        onCreate(bundle);

                                    }
                                });
                        alertDialogNoConn.setIcon(R.drawable.error_info_ico);
                        AlertDialog alert = alertDialogNoConn.create();
                        alert.show();

                    }



                }});
        }

    }

}
