package cn.lixing.worker.Test.repcode.page;

import static cn.lixing.worker.Test.uilts.SleepTimeUilts.sleepTime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cn.lixing.worker.Test.page.WorkerPage;

public class RepQrCodePage {
	private RepQrCodeElementObject elementObject;
	private WebDriver driver;
	private WorkerPage page;
	private Robot robot;
	
	public RepQrCodePage() {
		try {
			robot=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementObject=new RepQrCodeElementObject();
		page=elementObject.getPage();
		driver=elementObject.getDriver();
	}
	public void openRepQrCodePage() {
		sleepTime(6000);
		page.click(elementObject.getREPBINDElement());
	}
	public void reqDevicePage(String deviceName,String pqcode) {
		//openRepQrCodePage();
		page.sendKey(elementObject.getDEVICESNAM(), deviceName);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		sleepTime(6000);
		page.click(elementObject.getNEXTSTEP());
		sleepTime(6000);
		String js ="document.getElementsByClassName(\"el-input\")[0].style.display=\"block\";";
		JavascriptExecutor exejs=(JavascriptExecutor) driver; 
		exejs.executeScript(js);
		page.sendKey(elementObject.getIMPORTPQCODE(), pqcode);
		page.click(elementObject.getREQBINDSBTN());
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
