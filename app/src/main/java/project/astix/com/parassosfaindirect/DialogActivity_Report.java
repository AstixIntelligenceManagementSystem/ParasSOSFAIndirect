package project.astix.com.parassosfaindirect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.astix.Common.CommonInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class DialogActivity_Report extends BaseActivity
{

    PRJDatabase dbengine = new PRJDatabase(this);
    SharedPreferences sharedPref,sharedPrefReport;
    public String	SelectedDSRValue="";
    public String SelectedDistrbtrName="";
    LinkedHashMap<String,String> hmapDistrbtrList=new LinkedHashMap<>();
    String[] Distribtr_list;
    String DbrNodeId,DbrNodeType,DbrName;
    ArrayList<String> DbrArray=new ArrayList<String>();

    LinkedHashMap<String, String> hmapdsrIdAndDescr_details=new LinkedHashMap<String, String>();
    String[] drsNames;
    TextView txt_WholeReport,txt_dsrReport,txt_DlSkuWise,txt_DL_StoreWise,txt_DL_StoreSKUWise,txt_MTSkuWise,txt_MT_StoreWise,txt_MT_StoreSKUWise;
    public String ReasonId;
    public String ReasonText="NA";
    public static int RowId=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_visit_alert);
        try
        {
            getDSRDetail();
            getDistribtrList();
        }
        catch (Exception e)
        {

        }

        initialize();

    }

    void getDistribtrList()
    {
        dbengine.open();

        Distribtr_list=dbengine.getDistributorDataMstr();

        dbengine.close();
        for(int i=0;i<Distribtr_list.length;i++)
        {
            String value=Distribtr_list[i];
            DbrNodeId=value.split(Pattern.quote("^"))[0];
            DbrNodeType=value.split(Pattern.quote("^"))[1];
            DbrName=value.split(Pattern.quote("^"))[2];
            //flgReMap=Integer.parseInt(value.split(Pattern.quote("^"))[3]);

            hmapDistrbtrList.put(DbrName,DbrNodeId+"^"+DbrNodeType);
            DbrArray.add(DbrName);
        }

    }
    private void getDSRDetail() throws IOException
    {

        int check=dbengine.countDataIntblNoVisitReasonMaster();

        hmapdsrIdAndDescr_details=dbengine.fetch_DSRCoverage_List();

        int index=0;
        if(hmapdsrIdAndDescr_details!=null)
        {
            drsNames=new String[hmapdsrIdAndDescr_details.size()];
            LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(hmapdsrIdAndDescr_details);
            Set set2 = map.entrySet();
            Iterator iterator = set2.iterator();
            while(iterator.hasNext()) {
                Map.Entry me2 = (Map.Entry)iterator.next();
                drsNames[index]=me2.getKey().toString();
                index=index+1;
            }
        }


    }

    public void shardPrefForSalesman(int salesmanNodeId,int salesmanNodeType)
    {
         SharedPreferences.Editor editor = sharedPref.edit();
         editor.putInt("SalesmanNodeId", salesmanNodeId);
         editor.putInt("SalesmanNodeType", salesmanNodeType);
         editor.commit();

    }
    public void flgDataScopeSharedPref(int _flgDataScope)
    {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("flgDataScope", _flgDataScope);
        editor.commit();
    }

    void initialize()
    {
        sharedPrefReport = getSharedPreferences("Report", MODE_PRIVATE);
        sharedPref = getSharedPreferences(CommonInfo.Preference, MODE_PRIVATE);

        txt_WholeReport= (TextView) findViewById(R.id.txt_WholeReport);
                txt_dsrReport= (TextView) findViewById(R.id.txt_dsrReport);
        txt_DlSkuWise= (TextView) findViewById(R.id.txt_DlSkuWise);
                txt_DL_StoreWise= (TextView) findViewById(R.id.txt_DL_StoreWise);
        txt_DL_StoreSKUWise= (TextView) findViewById(R.id.txt_DL_StoreSKUWise);
                txt_MTSkuWise= (TextView) findViewById(R.id.txt_MTSkuWise);
        txt_MT_StoreWise= (TextView) findViewById(R.id.txt_MT_StoreWise);
                txt_MT_StoreSKUWise= (TextView) findViewById(R.id.txt_MT_StoreSKUWise);
        Button btn_cancel= (Button) findViewById(R.id.btn_cancel);

        txt_WholeReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","1");
                startActivity(i);
            }
        });
        txt_dsrReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","2");
                startActivity(i);
            }
        });
        txt_DlSkuWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","3");
                startActivity(i);
            }
        });
        txt_DL_StoreWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","4");
                startActivity(i);
            }
        });
        txt_DL_StoreSKUWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","5");
                startActivity(i);
            }
        });
        txt_MTSkuWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","6");
                startActivity(i);
            }
        });
        txt_MT_StoreWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","7");
                startActivity(i);
            }
        });
        txt_MT_StoreSKUWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DialogActivity_Report.this, WebViewTeamReport.class);
                i.putExtra("ReportClick","8");
                startActivity(i);
            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });




    }

}
