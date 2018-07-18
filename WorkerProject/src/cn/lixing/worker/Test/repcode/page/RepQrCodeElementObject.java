package cn.lixing.worker.Test.repcode.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.lixing.worker.Test.page.WorkerPage;

public class RepQrCodeElementObject {
	private WebElement REPBINDElement;
	private WebElement DEVICESNAM;
	private WebElement NEXTSTEP;
	private WebElement IMPORTPQCODE;
	private WebElement REQBINDSBTN;
	
	private WorkerPage page;
	private RepQrCodeXpathData xpathData;
	private WebDriver driver;
	
	public RepQrCodeElementObject() {
		page=new WorkerPage();
		page.openWorkerPage();
		xpathData=new RepQrCodeXpathData();
		driver=page.getDriver();
	}

	public WebElement getREPBINDElement() {
		REPBINDElement=page.getWebElement(xpathData.getREPBINDXPATH());
		return REPBINDElement;
	}

	public void setREPBINDElement(WebElement rEPBINDElement) {
		REPBINDElement = rEPBINDElement;
	}

	public WebElement getDEVICESNAM() {
		DEVICESNAM=page.getWebElement(xpathData.getDEVICESNAME());
		return DEVICESNAM;
	}

	public void setDEVICESNAM(WebElement dEVICESNAM) {
		DEVICESNAM = dEVICESNAM;
	}

	public WebElement getNEXTSTEP() {
		NEXTSTEP=page.getWebElement(xpathData.getNEXTSTEP());
		return NEXTSTEP;
	}

	public void setNEXTSTEP(WebElement nEXTSTEP) {
		NEXTSTEP = nEXTSTEP;
	}

	public WebElement getIMPORTPQCODE() {
		IMPORTPQCODE=page.getWebElement(xpathData.getIMPORTPQCODE());
		return IMPORTPQCODE;
	}

	public void setIMPORTPQCODE(WebElement iMPORTPQCODE) {
		IMPORTPQCODE = iMPORTPQCODE;
	}

	public WebElement getREQBINDSBTN() {
		REQBINDSBTN=page.getWebElement(xpathData.getREQBINDSBTN());
		return REQBINDSBTN;
	}

	public void setREQBINDSBTN(WebElement rEQBINDSBTN) {
		REQBINDSBTN = rEQBINDSBTN;
	}

	public WorkerPage getPage() {
		return page;
	}

	public void setPage(WorkerPage page) {
		this.page = page;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
