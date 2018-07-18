package cn.lixing.worker.Test.decode.page;

import static cn.lixing.worker.Test.uilts.SleepTimeUilts.sleepTime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cn.lixing.worker.Test.page.WorkerPage;

public class DeQrCodePage {
	private DeQrCodeElementObject elementObject;
	private WebDriver driver;
	private WorkerPage page;
	private Robot robot;
	public DeQrCodePage() {
		try {
			robot=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementObject=new DeQrCodeElementObject();
		page=elementObject.getPage();
		driver=elementObject.getDriver();
	}
	
	public void openDeQrCodePage() {
		sleepTime(6000);
		page.click(elementObject.getDECODEElement());
	}
	
	public void useDeQrCodePage(String qrcode) {
		//openDeQrCodePage();
		sleepTime(6000);
		page.click(elementObject.getUSADDECODEBNTElement());
		sleepTime(6000);
		String js ="document.getElementsByClassName(\"el-input\")[0].style.display=\"block\";";
		JavascriptExecutor exejs=(JavascriptExecutor) driver; 
		exejs.executeScript(js);
		page.sendKey(elementObject.getIMPORTPQCODEElement(), qrcode);
		page.click(elementObject.getCODEBNTElement());
	}
	
	public void disDeQrCodePage(String deviceName) {
		//openDeQrCodePage();
		page.click(elementObject.getIDSDECODEBNTElement());
		page.sendKey(elementObject.getDEVICESNAMEElement(), deviceName);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		sleepTime(6000);
		page.click(elementObject.getDECODEDEVICEBNTElement());
		sleepTime(6000);
		page.click(elementObject.getCONFIRMBTNElement());
		page.click(elementObject.getRETURNBTNElement());
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) {
		DeQrCodePage page=new DeQrCodePage();
		page.disDeQrCodePage("008");
	}
}
