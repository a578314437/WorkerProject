package cn.lixing.worker.Test.TestCase;

import static cn.lixing.worker.Test.uilts.SelectDbUilts.*;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
	
	private String actualQRCODE;
	private String expectedQRCODE;
	
	private List<Object>actualQRCODElist;
	private List<Object>expectedQRCODElist;
	
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
	
	@Test(dataProvider="decodeData")
	public void useDeQrCodeTestCase(String qrcode) {
		actualQRCODElist=select("TB_PQ_QRCODE",new String[] {"QRCODE"},1,"STATUS");
		actualQRCODE=(String) actualQRCODElist.get(0);

		page.useDeQrCodePage(qrcode);
		expectedQRCODElist=select("TB_PQ_QRCODE",new String[] {"QRCODE"},9,"STATUS");
		expectedQRCODE=(String) expectedQRCODElist.get(0);
		
		Assert.assertEquals(actualQRCODE,expectedQRCODE);
	}
	
	//@Test(dataProvider="deviceData",priority=1)
	public void disDeQrCodeTestCase(String deviceName) {
		page.disDeQrCodePage(deviceName);
		
	}
	
	@AfterClass
	public void afterClass() {
		updata(new Object[] {"AREA_CODE","DEVICE_MODE_ID","USER_ACCOUNT","BIND_TIME","STATUS","DEVICE_SN","COMPANY_CODE","VIRTUAL_DEVICE","DEVICE_MODE","COMPANY_NAME","TYPE"}, 
				new Object[] {null,null,null,null,0,null,null,null,null,null,null}, "TB_PQ_QRCODE","STATUS", 9);
		driver.quit();
	}
}
