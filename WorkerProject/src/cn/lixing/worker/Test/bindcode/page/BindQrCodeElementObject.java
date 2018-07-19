package cn.lixing.worker.Test.bindcode.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lixing.worker.Test.page.WorkerPage;

public class BindQrCodeElementObject extends WorkerPage {
	private WebElement USER_ACCOUNT_ELEMENT;
	private WebElement COMPANY_NAME_ELEMENT;
	private WebElement CUST_ELEMENT;
	private WebElement CUST_NAME_ELEMENT;
	private WebElement CUST_PHONE_ELEMENT;
	private WebElement SAVEBTN_ELEMENT;
	private WebElement STAFF_LEAD_ELEMENT;
	private WebElement NEXTSTEP_ELEMENT;
	private WebElement SELECTACCOUNTLINK_ELEMENT;
	private WebElement SELECTACCOUNT_ELEMENT;
	private WebElement RELEVANCEBTN_ELEMENT;
	private WebElement IMPORTPQCODE_ELEMENT;
	private WebElement YARDSBTN_ELEMENT;
	
	private WebDriver driver;
	private BindQrCodeXpathData xpathData;
	private WorkerPage page;
	private ApplicationContext context;
	
	public BindQrCodeElementObject() {
		context=new ClassPathXmlApplicationContext("AppctionContext.xml");
		page=(WorkerPage) context.getBean("worker");
		driver=page.openWorkerPage();
		xpathData=new BindQrCodeXpathData();
	}

	public WebElement getUSER_ACCOUNT_ELEMENT() {
		USER_ACCOUNT_ELEMENT=page.getWebElement(xpathData.getUSER_ACCOUNT());
		return USER_ACCOUNT_ELEMENT;
	}

	public void setUSER_ACCOUNT_ELEMENT(WebElement uSER_ACCOUNT_ELEMENT) {
		USER_ACCOUNT_ELEMENT = uSER_ACCOUNT_ELEMENT;
	}

	public WebElement getCOMPANY_NAME_ELEMENT() {
		COMPANY_NAME_ELEMENT=page.getWebElement(xpathData.getCOMPANY_NAME());
		return COMPANY_NAME_ELEMENT;
	}

	public void setCOMPANY_NAME_ELEMENT(WebElement cOMPANY_NAME_ELEMENT) {
		COMPANY_NAME_ELEMENT = cOMPANY_NAME_ELEMENT;
	}

	public WebElement getCUST_ELEMENT() {
		CUST_ELEMENT=page.getWebElement(xpathData.getCUST());
		return CUST_ELEMENT;
	}

	public void setCUST_ELEMENT(WebElement cUST_ELEMENT) {
		CUST_ELEMENT = cUST_ELEMENT;
	}

	public WebElement getCUST_NAME_ELEMENT() {
		CUST_NAME_ELEMENT=page.getWebElement(xpathData.getCUST_NAME());
		return CUST_NAME_ELEMENT;
	}

	public void setCUST_NAME_ELEMENT(WebElement cUST_NAME_ELEMENT) {
		CUST_NAME_ELEMENT = cUST_NAME_ELEMENT;
	}

	public WebElement getCUST_PHONE_ELEMENT() {
		CUST_PHONE_ELEMENT=page.getWebElement(xpathData.getCUST_PHONE());
		return CUST_PHONE_ELEMENT;
	}

	public void setCUST_PHONE_ELEMENT(WebElement cUST_PHONE_ELEMENT) {
		CUST_PHONE_ELEMENT = cUST_PHONE_ELEMENT;
	}

	public WebElement getSAVEBTN_ELEMENT() {
		SAVEBTN_ELEMENT=page.getWebElement(xpathData.getSAVEBTN());
		return SAVEBTN_ELEMENT;
	}

	public void setSAVEBTN_ELEMENT(WebElement sAVEBTN_ELEMENT) {
		SAVEBTN_ELEMENT = sAVEBTN_ELEMENT;
	}

	public WebElement getSTAFF_LEAD_ELEMENT() {
		STAFF_LEAD_ELEMENT=page.getWebElement(xpathData.getSTAFF_LEAD());
		return STAFF_LEAD_ELEMENT;
	}

	public void setSTAFF_LEAD_ELEMENT(WebElement sTAFF_LEAD_ELEMENT) {
		STAFF_LEAD_ELEMENT = sTAFF_LEAD_ELEMENT;
	}

	public WebElement getNEXTSTEP_ELEMENT() {
		NEXTSTEP_ELEMENT=page.getWebElement(xpathData.getNEXTSTEP());
		return NEXTSTEP_ELEMENT;
	}

	public void setNEXTSTEP_ELEMENT(WebElement nEXTSTEP_ELEMENT) {
		NEXTSTEP_ELEMENT = nEXTSTEP_ELEMENT;
	}

	public WebElement getSELECTACCOUNTLINK_ELEMENT() {
		SELECTACCOUNTLINK_ELEMENT=page.getWebElement(xpathData.getSELECTACCOUNTLINK());
		return SELECTACCOUNTLINK_ELEMENT;
	}

	public void setSELECTACCOUNTLINK_ELEMENT(WebElement sELECTACCOUNTLINK_ELEMENT) {
		SELECTACCOUNTLINK_ELEMENT = sELECTACCOUNTLINK_ELEMENT;
	}

	public WebElement getSELECTACCOUNT_ELEMENT() {
		SELECTACCOUNT_ELEMENT=page.getWebElement(xpathData.getSELECTACCOUNT());
		return SELECTACCOUNT_ELEMENT;
	}

	public void setSELECTACCOUNT_ELEMENT(WebElement sELECTACCOUNT_ELEMENT) {
		SELECTACCOUNT_ELEMENT = sELECTACCOUNT_ELEMENT;
	}

	public WebElement getRELEVANCEBTN_ELEMENT() {
		RELEVANCEBTN_ELEMENT=page.getWebElement(xpathData.getRELEVANCEBTN());
		return RELEVANCEBTN_ELEMENT;
	}

	public void setRELEVANCEBTN_ELEMENT(WebElement rELEVANCEBTN_ELEMENT) {
		RELEVANCEBTN_ELEMENT = rELEVANCEBTN_ELEMENT;
	}

	public WebElement getIMPORTPQCODE_ELEMENT() {
		IMPORTPQCODE_ELEMENT=page.getWebElement(xpathData.getIMPORTPQCODE());
		return IMPORTPQCODE_ELEMENT;
	}

	public void setIMPORTPQCODE_ELEMENT(WebElement iMPORTPQCODE_ELEMENT) {
		IMPORTPQCODE_ELEMENT = iMPORTPQCODE_ELEMENT;
	}

	public WebElement getYARDSBTN_ELEMENT() {
		YARDSBTN_ELEMENT=page.getWebElement(xpathData.getYARDSBTN());
		return YARDSBTN_ELEMENT;
	}

	public void setYARDSBTN_ELEMENT(WebElement yARDSBTN_ELEMENT) {
		YARDSBTN_ELEMENT = yARDSBTN_ELEMENT;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
