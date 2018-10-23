package com.astix.Common;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{


	// Its for Live Path on 194 Server new aaaa



	public static final String DistributorMapXMLFolder="ParasSOSFADistributorMapXML";
	public static final String DistributorStockXMLFolder="ParasSOSFADistributorStockXML";
	public static final String DistributorCheckInXMLFolder="ParasSOSFADistributorCheckInXML";
	public static final String Preference="ParasSOSFAPrefrence";
	public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;
	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";
	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";
	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidParasLive/Service.asmx";
	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="ParasSOSFA.apk";
	public static String DATABASE_NAME = "DbParasSOSFAApp";
	public static int AnyVisit = 0;
	public static int DATABASE_VERSIONID = 18;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.1";   // put this field value based on value in table on the server
	public static int Application_TypeID = 9; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct
	public static String OrderSyncPath="http://103.20.212.194/ReadXML_ParasLive/DefaultSOSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_ParasImagesLive/Default.aspx";
	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForParasSFALive/default.aspx";
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_ParasLive/DefaultSODistributorMapping.aspx";
	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_ParasInvoiceLive/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_ParasSFADistributionLive/Default.aspx";
	public static String WebStockOutUrl="http://103.20.212.194/Parassfa/manageorder/frmStockTransferToVanDetail_PDA.aspx";
	public static String WebStockInUrl="http://103.20.212.194/Parassfa/manageorder/frmstockin.aspx";
	public static String WebDSRAttendanceUrl="http://103.20.212.194/Parassfa_Reports/frmDSRAttendanceReport.aspx";
	public static String OrderSyncPathWarehouseMap="http://103.20.212.194/ReadXML_ParasLive/DefaultSOWarehouseMapping.aspx";
	public static String OrderXMLFolder="ParasSOSFAXml";
	public static String ImagesFolder="ParasSOSFAImages";
	public static String TextFileFolder="ParasSOSFATextFile";
	public static String InvoiceXMLFolder="ParasSOSFAInvoiceXml";
	public static String FinalLatLngJsonFile="ParasSOSFAFinalLatLngJson";
	public static String AppLatLngJsonFile="ParasSOSFALatLngJson";
	public static final String AttandancePreference="ParasSOSFAAttandancePreference";
	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static String ActiveRouteSM="0";
	public static int DayStartClick=0;
	public static String ImagesFolderServer="PARASSOSFAImagesServer";
	  public static int PersonNodeID=0;
	   public static int PersonNodeType=0;
	public static int flgSOOnlineOffLine=0;
	public static String OrderSyncPathSO="http://103.20.212.194/ReadXML_ParasDevelopment/DefaultSO.aspx";
	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/Parassfa_dev/Reports/frmPDAImgsDev.aspx";
	public static int flgNewStoreORStoreValidation=0;
	public static String WebPageUrlDSMWiseReport="http://103.20.212.194/Parassfa_dev/Mobile/frmDSMWiseReportCard.aspx?imei=";
	public static String WebPageUrlDataReport="http://103.20.212.194/Parassfa_dev/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	public static String WebPageUrl="http://103.20.212.194/Parassfa_dev/Mobile/frmRouteTracking.aspx";
	public static String WebPageUrlTeamReport="http://103.20.212.194/parassfa/Mobile/PDARptTopSummary.aspx?";
	public static String WebPageUrlFullTeritory="http://103.20.212.194/parassfa/Mobile/PDADayAndMTDSummary.aspx?";
	public static String WebPageDailyMTDReport="http://103.20.212.194/parassfa/Mobile/PDADayAndMTDDetailRpt.aspx?";

	// Its for Dev Path on 194 Server new aaaa


/*

	public static final String DistributorMapXMLFolder="ParasSOSFADistributorMapXML";
	public static final String DistributorStockXMLFolder="ParasSOSFADistributorStockXML";
	public static final String DistributorCheckInXMLFolder="ParasSOSFADistributorCheckInXML";
	public static final String Preference="ParasSOSFAPrefrence";
	public static int flgAllRoutesData=1;
	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;
	public static String imei="";
	public static String SalesQuoteId="BLANK";
	public static String quatationFlag="";
	public static String fileContent="";
	public static String prcID="NULL";
	public static String newQuottionID="NULL";
	public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";
	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidParasDevelopment/Service.asmx";

	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="ParasSOSFADev.apk";
	public static String DATABASE_NAME = "DbParasSOSFAApp";
	public static int AnyVisit = 0;

	public static int DATABASE_VERSIONID = 28;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.3";   // put this field value based on value in table on the server
	public static int Application_TypeID = 9; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

    // application id will be 9 because its its is copy of Godrej

	public static String OrderSyncPath="http://103.20.212.194/ReadXML_ParasDevelopment/DefaultSOSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_ParasImagesDevelopment/Default.aspx";
	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForParasSFADevelopment/default.aspx";
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_ParasDevelopment/DefaultSODistributorMapping.aspx";
	public static String OrderSyncPathWarehouseMap="http://103.20.212.194/ReadXML_ParasDevelopment/DefaultSOWarehouseMapping.aspx";

	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_ParasInvoiceDevelopment/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_ParasSFADistributionDevelopment/Default.aspx";
	public static String WebStockOutUrl="http://103.20.212.194/Parassfa_dev/manageorder/frmStockTransferToVanDetail_PDA.aspx";
	public static String WebStockInUrl="http://103.20.212.194/Parassfa_dev/manageorder/frmstockin.aspx";
	public static String WebDSRAttendanceUrl="http://103.20.212.194/Parassfa_devReports/frmDSRAttendanceReport.aspx";
	public static String OrderXMLFolder="ParasSOSFAXml";
	public static String ImagesFolder="ParasSOSFAImages";
	public static String TextFileFolder="ParasSOSFATextFile";
	public static String InvoiceXMLFolder="ParasSOSFAInvoiceXml";
	public static String FinalLatLngJsonFile="ParasSOSFAFinalLatLngJson";
	public static String AppLatLngJsonFile="ParasSOSFALatLngJson";
	public static final String AttandancePreference="ParasSOSFAAttandancePreference";
	public static int DistanceRange=3000;
	public static String SalesPersonTodaysTargetMsg="";
	public static int CoverageAreaNodeID=0;
	public static int CoverageAreaNodeType=0;
	public static int SalesmanNodeId=0;
	public static int SalesmanNodeType=0;
	public static int flgDataScope=0;
	public static int FlgDSRSO=0;
	public static String ActiveRouteSM="0";
	public static int DayStartClick=0;
	public static String ImagesFolderServer="PARASSOSFAImagesServer";
	public static int PersonNodeID=0;
	public static int PersonNodeType=0;
	public static int flgSOOnlineOffLine=0;
	public static String OrderSyncPathSO="http://103.20.212.194/ReadXML_ParasDevelopment/DefaultSO.aspx";
	public static String URLImageLinkToViewStoreOverWebProtal="http://103.20.212.194/Parassfa_dev/Reports/frmPDAImgsDev.aspx";
	public static int flgNewStoreORStoreValidation=0;
	public static String WebPageUrlDSMWiseReport="http://103.20.212.194/Parassfa_dev/Mobile/frmDSMWiseReportCard.aspx?imei=";
	public static String WebPageUrlDataReport="http://103.20.212.194/Parassfa_dev/Mobile/fnSalesmanWiseSummaryRpt.aspx";
	public static String WebPageUrl="http://103.20.212.194/Parassfa_dev/Mobile/frmRouteTracking.aspx";

	public static String WebPageUrlTeamReport="http://103.20.212.194/parassfa_dev/Mobile/PDARptTopSummary.aspx?";
	public static String WebPageUrlFullTeritory="http://103.20.212.194/parassfa_dev/Mobile/PDADayAndMTDSummary.aspx?";
	public static String WebPageDailyMTDReport="http://103.20.212.194/parassfa_dev/Mobile/PDADayAndMTDDetailRpt.aspx?";

*/

	//


}
