package cn.lixing.worker.Test.decode.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cn.lixing.worker.Test.page.WorkerPage;
public class DeQrCodeElementObject {
	private WebElement DECODEElement;
	private WebElement USADDECODEBNTElement;
	private WebElement IMPORTPQCODEElement;
	private WebElement IDSDECODEBNTElement;
	private WebElement DEVICESNAMEElement;
	private WebElement DECODEDEVICEBNTElement;
	private WebElement CONFIRMBTNElement;
	private WebElement CODEBNTElement;
	private WebElement RETURNBTNElement;
	
	private WorkerPage page;
	private WebDriver driver;
	private DeQrCodeXpathData xpathData;
	
	public DeQrCodeElementObject() {
		page=new WorkerPage();
		page.openWorkerPage();
		driver=page.getDriver();
		xpathData=new DeQrCodeXpathData();
	}

	public WebElement getDECODEElement() {
		DECODEElement=page.getWebElement(xpathData.getDECODE());
		return DECODEElement;
	}

	public void setDECODEElement(WebElement dECODEElement) {
		DECODEElement = dECODEElement;
	}

	public WebElement getUSADDECODEBNTElement() {
		USADDECODEBNTElement=page.getWebElement(xpathData.getUSADDECODEBNT());
		return USADDECODEBNTElement;
	}

	public void setUSADDECODEBNTElement(WebElement uSADDECODEBNTElement) {
		USADDECODEBNTElement = uSADDECODEBNTElement;
	}

	public WebElement getIMPORTPQCODEElement() {
		IMPORTPQCODEElement=page.getWebElement(xpathData.getIMPORTPQCODE());
		return IMPORTPQCODEElement;
	}

	public void setIMPORTPQCODEElement(WebElement iMPORTPQCODEElement) {
		IMPORTPQCODEElement = iMPORTPQCODEElement;
	}

	public WebElement getIDSDECODEBNTElement() {
		IDSDECODEBNTElement=page.getWebElement(xpathData.getIDSDECODEBNT());
		return IDSDECODEBNTElement;
	}

	public void setIDSDECODEBNTElement(WebElement iDSDECODEBNTElement) {
		IDSDECODEBNTElement = iDSDECODEBNTElement;
	}

	public WebElement getDEVICESNAMEElement() {
		DEVICESNAMEElement=page.getWebElement(xpathData.getDEVICESNAME());
		return DEVICESNAMEElement;
	}

	public void setDEVICESNAMEElement(WebElement dEVICESNAMEElement) {
		DEVICESNAMEElement = dEVICESNAMEElement;
	}

	public WebElement getDECODEDEVICEBNTElement() {
		DECODEDEVICEBNTElement=page.getWebElement(xpathData.getDECODEDEVICEBNT());
		return DECODEDEVICEBNTElement;
	}

	public void setDECODEDEVICEBNTElement(WebElement dECODEDEVICEBNTElement) {
		DECODEDEVICEBNTElement = dECODEDEVICEBNTElement;
	}

	public WebElement getCONFIRMBTNElement() {
		CONFIRMBTNElement=page.getWebElement(xpathData.getCONFIRMBTN());
		return CONFIRMBTNElement;
	}

	public void setCONFIRMBTNElement(WebElement cONFIRMBTNElement) {
		CONFIRMBTNElement = cONFIRMBTNElement;
	}

	public WebElement getCODEBNTElement() {
		CODEBNTElement=page.getWebElement(xpathData.getCODEBNT());
		return CODEBNTElement;
	}

	public void setCODEBNTElement(WebElement cODEBNTElement) {
		CODEBNTElement = cODEBNTElement;
	}

	public WebElement getRETURNBTNElement() {
		RETURNBTNElement=page.getWebElement(xpathData.getRETURNBTN());
		return RETURNBTNElement;
	}

	public void setRETURNBTNElement(WebElement rETURNBTNElement) {
		RETURNBTNElement = rETURNBTNElement;
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
