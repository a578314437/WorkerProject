package cn.lixing.worker.Test.decode.page;

import static cn.lixing.worker.Test.uilts.PropertiesFileUilt.*;
public class DeQrCodeXpathData {
	private String DECODE;
	private String USADDECODEBNT;
	private String IMPORTPQCODE;
	private String CODEBNT;
	
	private String IDSDECODEBNT;
	private String DEVICESNAME;
	private String DECODEDEVICEBNT;
	private String CONFIRMBTN;
	private String RETURNBTN;
	
	public DeQrCodeXpathData() {
		DECODE=getData("DECODE", "\\TestDataFile\\deCodeXpath");
		USADDECODEBNT=getData("USADDECODEBNT", "\\TestDataFile\\deCodeXpath");
		IMPORTPQCODE=getData("IMPORTPQCODE", "\\TestDataFile\\deCodeXpath");
		CODEBNT=getData("CODEBNT", "\\TestDataFile\\deCodeXpath");
		
		IDSDECODEBNT=getData("IDSDECODEBNT", "\\TestDataFile\\deCodeXpath");
		DEVICESNAME=getData("DEVICESNAME", "\\TestDataFile\\deCodeXpath");
		DECODEDEVICEBNT=getData("DECODEDEVICEBNT", "\\TestDataFile\\deCodeXpath");
		CONFIRMBTN=getData("CONFIRMBTN", "\\TestDataFile\\deCodeXpath");
		RETURNBTN=getData("RETURNBTN", "\\TestDataFile\\deCodeXpath");
	}

	public String getDECODE() {
		return DECODE;
	}

	public void setDECODE(String dECODE) {
		DECODE = dECODE;
	}

	public String getUSADDECODEBNT() {
		return USADDECODEBNT;
	}

	public void setUSADDECODEBNT(String uSADDECODEBNT) {
		USADDECODEBNT = uSADDECODEBNT;
	}

	public String getIMPORTPQCODE() {
		return IMPORTPQCODE;
	}

	public void setIMPORTPQCODE(String iMPORTPQCODE) {
		IMPORTPQCODE = iMPORTPQCODE;
	}

	public String getCODEBNT() {
		return CODEBNT;
	}

	public void setCODEBNT(String cODEBNT) {
		CODEBNT = cODEBNT;
	}

	public String getIDSDECODEBNT() {
		return IDSDECODEBNT;
	}

	public void setIDSDECODEBNT(String iDSDECODEBNT) {
		IDSDECODEBNT = iDSDECODEBNT;
	}

	public String getDEVICESNAME() {
		return DEVICESNAME;
	}

	public void setDEVICESNAME(String dEVICESNAME) {
		DEVICESNAME = dEVICESNAME;
	}

	public String getDECODEDEVICEBNT() {
		return DECODEDEVICEBNT;
	}

	public void setDECODEDEVICEBNT(String dECODEDEVICEBNT) {
		DECODEDEVICEBNT = dECODEDEVICEBNT;
	}

	public String getCONFIRMBTN() {
		return CONFIRMBTN;
	}

	public void setCONFIRMBTN(String cONFIRMBTN) {
		CONFIRMBTN = cONFIRMBTN;
	}

	public String getRETURNBTN() {
		return RETURNBTN;
	}

	public void setRETURNBTN(String rETURNBTN) {
		RETURNBTN = rETURNBTN;
	}
	
}
