package cn.lixing.worker.Test.TestCase;

import static cn.lixing.worker.Test.uilts.SelectDbUilts.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.worker.Test.decode.page.DeQrCodePage;


public class DeCodeTestCase {
	private DeQrCodePage page;
	private WebDriver driver;
	private String[][]qrcodeTestDatas;
	private String[][]deviceTestDatas;
	
	@BeforeClass
	public void initTestClass() {
		page=new DeQrCodePage();
		driver=page.getDriver();
		
		qrcodeTestDatas=decrypteQpcodeData(1);
		deviceTestDatas=selectdEevices("TB_PQ_DEVICE_DETAIL",new String[] {"DEVICE_SN"},1);
	}
	@BeforeMethod
	public void BeforeMethod() {
		page.openDeQrCodePage();
	}
	
	@DataProvider(name="decodeData")
	public String[][] getTestQrcodeData(){
		return qrcodeTestDatas;
	}
	
	@DataProvider(name="deviceData")
	public String[][] getTestDevicesData(){
		return deviceTestDatas;
	}
	
	@Test(dataProvider="decodeData",priority=2)
	public void useDeQrCodeTestCase(String qrcode) {
		page.useDeQrCodePage(qrcode);
	}
	
	@Test(dataProvider="deviceData",priority=1)
	public void disDeQrCodeTestCase(String deviceName) {
		page.disDeQrCodePage(deviceName);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
