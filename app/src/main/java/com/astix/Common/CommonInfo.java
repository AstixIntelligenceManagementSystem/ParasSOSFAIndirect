package com.astix.Common;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{


	// Its for Live Path on 194 Server new aa



	public static final String DistributorMapXMLFolder="ParasDistributorMapXML";
	public static final String DistributorStockXMLFolder="ParasDistributorStockXML";
	public static final String DistributorCheckInXMLFolder="ParasDistributorCheckInXML";
	public static final String Preference="ParasPrefrence";
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
	public static String VersionDownloadAPKName="ParasSFA.apk";
	public static String DATABASE_NAME = "DbParasSFAApp";
	public static int AnyVisit = 0;
	public static int DATABASE_VERSIONID = 11;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.8";   // put this field value based on value in table on the server
	public static int Application_TypeID = 8; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct
	public static String OrderSyncPath="http://103.20.212.194/ReadXML_ParasLive/DefaultSFA.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_ParasImagesLive/Default.aspx";
	public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForParasSFALive/default.aspx";
	public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_ParasLive/DefaultSODistributorMapping.aspx";
	public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_ParasInvoiceLive/Default.aspx";
	public static String DistributorSyncPath="http://103.20.212.194/ReadXML_ParasSFADistributionLive/Default.aspx";
	public static String WebStockOutUrl="http://103.20.212.194/Parassfa/manageorder/frmStockTransferToVanDetail_PDA.aspx";
	public static String WebStockInUrl="http://103.20.212.194/Parassfa/manageorder/frmstockin.aspx";
	public static String OrderXMLFolder="ParasSFAXml";
	public static String ImagesFolder="ParasSFAImages";
	public static String TextFileFolder="ParasTextFile";
	public static String InvoiceXMLFolder="ParasInvoiceXml";
	public static String FinalLatLngJsonFile="ParasSFAFinalLatLngJson";
	public static String AppLatLngJsonFile="ParasSFALatLngJson";
	public static final String AttandancePreference="ParasAttandancePreference";
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
	public static String ImagesFolderServer="PARASSFAImagesServer";





}
