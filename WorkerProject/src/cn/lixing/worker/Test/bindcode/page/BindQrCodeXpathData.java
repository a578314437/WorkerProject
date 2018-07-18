package cn.lixing.worker.Test.bindcode.page;

import static cn.lixing.worker.Test.uilts.PropertiesFileUilt.*;
public class BindQrCodeXpathData {
	private String USER_ACCOUNT;
	private String COMPANY_NAME;
	private String CUST;
	private String CUST_NAME;
	private String CUST_PHONE;
	private String SAVEBTN;
	private String STAFF_LEAD;
	private String NEXTSTEP;
	private String SELECTACCOUNTLINK;
	private String SELECTACCOUNT;
	private String RELEVANCEBTN;
	private String IMPORTPQCODE;
	private String YARDSBTN;
	
	public BindQrCodeXpathData() {
		USER_ACCOUNT=getData("USER_ACCOUNT", "\\TestDataFile\\bindCodeXpath");
		COMPANY_NAME=getData("COMPANY_NAME", "\\TestDataFile\\bindCodeXpath");
		CUST=getData("CUST", "\\TestDataFile\\bindCodeXpath");
		CUST_NAME=getData("CUST_NAME", "\\TestDataFile\\bindCodeXpath");
		CUST_PHONE=getData("CUST_PHONE", "\\TestDataFile\\bindCodeXpath");
		SAVEBTN=getData("SAVEBTN", "\\TestDataFile\\bindCodeXpath");
		STAFF_LEAD=getData("STAFF_LEAD", "\\TestDataFile\\bindCodeXpath");
		NEXTSTEP=getData("NEXTSTEP", "\\TestDataFile\\bindCodeXpath");
		SELECTACCOUNTLINK=getData("SELECTACCOUNTLINK", "\\TestDataFile\\bindCodeXpath");
		SELECTACCOUNT=getData("SELECTACCOUNT", "\\TestDataFile\\bindCodeXpath");
		RELEVANCEBTN=getData("RELEVANCEBTN", "\\TestDataFile\\bindCodeXpath");
		IMPORTPQCODE=getData("IMPORTPQCODE", "\\TestDataFile\\bindCodeXpath");
		YARDSBTN=getData("YARDSBTN", "\\TestDataFile\\bindCodeXpath");
	}

	public String getUSER_ACCOUNT() {
		return USER_ACCOUNT;
	}

	public void setUSER_ACCOUNT(String uSER_ACCOUNT) {
		USER_ACCOUNT = uSER_ACCOUNT;
	}

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}

	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}

	public String getCUST() {
		return CUST;
	}

	public void setCUST(String cUST) {
		CUST = cUST;
	}

	public String getCUST_NAME() {
		return CUST_NAME;
	}

	public void setCUST_NAME(String cUST_NAME) {
		CUST_NAME = cUST_NAME;
	}

	public String getCUST_PHONE() {
		return CUST_PHONE;
	}

	public void setCUST_PHONE(String cUST_PHONE) {
		CUST_PHONE = cUST_PHONE;
	}

	public String getSAVEBTN() {
		return SAVEBTN;
	}

	public void setSAVEBTN(String sAVEBTN) {
		SAVEBTN = sAVEBTN;
	}

	public String getSTAFF_LEAD() {
		return STAFF_LEAD;
	}

	public void setSTAFF_LEAD(String sTAFF_LEAD) {
		STAFF_LEAD = sTAFF_LEAD;
	}

	public String getNEXTSTEP() {
		return NEXTSTEP;
	}

	public void setNEXTSTEP(String nEXTSTEP) {
		NEXTSTEP = nEXTSTEP;
	}

	public String getSELECTACCOUNTLINK() {
		return SELECTACCOUNTLINK;
	}

	public void setSELECTACCOUNTLINK(String sELECTACCOUNTLINK) {
		SELECTACCOUNTLINK = sELECTACCOUNTLINK;
	}

	public String getSELECTACCOUNT() {
		return SELECTACCOUNT;
	}

	public void setSELECTACCOUNT(String sELECTACCOUNT) {
		SELECTACCOUNT = sELECTACCOUNT;
	}

	public String getRELEVANCEBTN() {
		return RELEVANCEBTN;
	}

	public void setRELEVANCEBTN(String rELEVANCEBTN) {
		RELEVANCEBTN = rELEVANCEBTN;
	}

	public String getIMPORTPQCODE() {
		return IMPORTPQCODE;
	}

	public void setIMPORTPQCODE(String iMPORTPQCODE) {
		IMPORTPQCODE = iMPORTPQCODE;
	}

	public String getYARDSBTN() {
		return YARDSBTN;
	}

	public void setYARDSBTN(String yARDSBTN) {
		YARDSBTN = yARDSBTN;
	}
}
