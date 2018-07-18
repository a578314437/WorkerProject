package cn.lixing.worker.Test.repcode.page;

import static cn.lixing.worker.Test.uilts.PropertiesFileUilt.*;
public class RepQrCodeXpathData {
	private String REPBINDXPATH;
	private String DEVICESNAME;
	private String NEXTSTEP;
	private String IMPORTPQCODE;
	private String REQBINDSBTN;
	
	public RepQrCodeXpathData() {
		REPBINDXPATH=getData("REPBINDXPATH", "\\TestDataFile\\repCodeXpath");
		DEVICESNAME=getData("DEVICESNAME", "\\TestDataFile\\repCodeXpath");
		NEXTSTEP=getData("NEXTSTEP", "\\TestDataFile\\repCodeXpath");
		IMPORTPQCODE=getData("IMPORTPQCODE", "\\TestDataFile\\repCodeXpath");
		REQBINDSBTN=getData("REQBINDSBTN", "\\TestDataFile\\repCodeXpath");
	}

	public String getREPBINDXPATH() {
		return REPBINDXPATH;
	}

	public void setREPBINDXPATH(String rEPBINDXPATH) {
		REPBINDXPATH = rEPBINDXPATH;
	}

	public String getNEXTSTEP() {
		return NEXTSTEP;
	}

	public void setNEXTSTEP(String nEXTSTEP) {
		NEXTSTEP = nEXTSTEP;
	}

	public String getIMPORTPQCODE() {
		return IMPORTPQCODE;
	}

	public void setIMPORTPQCODE(String iMPORTPQCODE) {
		IMPORTPQCODE = iMPORTPQCODE;
	}

	public String getREQBINDSBTN() {
		return REQBINDSBTN;
	}

	public void setREQBINDSBTN(String rEQBINDSBTN) {
		REQBINDSBTN = rEQBINDSBTN;
	}

	public String getDEVICESNAME() {
		return DEVICESNAME;
	}

	public void setDEVICESNAME(String dEVICESNAME) {
		DEVICESNAME = dEVICESNAME;
	}
}
