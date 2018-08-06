package cn.lixing.worker.Test.bindcode.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static cn.lixing.worker.Test.uilts.SleepTimeUilts.*;

public class BindQrCodePage {
	private BindQrCodeElementObject elementObject;
	private Robot robot;
	private WebDriver driver;
	private String busNumber="607270598";
	public BindQrCodePage() {
		try {
			robot=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementObject=new BindQrCodeElementObject();
		driver=elementObject.getDriver();
	}
	
	public void openCompanyPage() {
		elementObject.getUSER_ACCOUNT_ELEMENT().clear();
		elementObject.getUSER_ACCOUNT_ELEMENT().sendKeys(busNumber);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		sleepTime(8000);
		elementObject.getCOMPANY_NAME_ELEMENT().click();
		sleepTime(8000);
		
	}
	public void AddDevicePage(String pqcode) {
		//openCompanyPage();
		elementObject.getCUST_ELEMENT().click();
		elementObject.getCUST_NAME_ELEMENT().clear();
		elementObject.getCUST_NAME_ELEMENT().sendKeys("lisi");
		elementObject.getCUST_PHONE_ELEMENT().clear();
		elementObject.getCUST_PHONE_ELEMENT().sendKeys("13564785423");
		elementObject.getSAVEBTN_ELEMENT().click();
		sleepTime(6000);
		elementObject.getSTAFF_LEAD_ELEMENT().click();
		elementObject.getCUST_NAME_ELEMENT().clear();
		elementObject.getCUST_NAME_ELEMENT().sendKeys("lisi");
		
		elementObject.getCUST_PHONE_ELEMENT().clear();
		elementObject.getCUST_PHONE_ELEMENT().sendKeys("13564785423");
		elementObject.getSAVEBTN_ELEMENT().click();
		sleepTime(6000);
		elementObject.getNEXTSTEP_ELEMENT().click();
		sleepTime(6000);
		elementObject.getSELECTACCOUNTLINK_ELEMENT().click();
		sleepTime(6000);
		elementObject.getSELECTACCOUNT_ELEMENT().click();
		elementObject.getRELEVANCEBTN_ELEMENT().click();
		sleepTime(6000);
		elementObject.getNEXTSTEP_ELEMENT().click();
		sleepTime(6000);
		String js ="document.getElementsByClassName(\"el-input\")[0].style.display=\"block\";";
		JavascriptExecutor exejs=(JavascriptExecutor) driver; 
		exejs.executeScript(js);
		elementObject.getIMPORTPQCODE_ELEMENT().sendKeys(pqcode);
		elementObject.getYARDSBTN_ELEMENT().click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	
	
}
