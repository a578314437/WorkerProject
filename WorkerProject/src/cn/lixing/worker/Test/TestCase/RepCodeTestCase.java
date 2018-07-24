package cn.lixing.worker.Test.TestCase;

import static cn.lixing.worker.Test.uilts.ConcatUilt.*;
import static cn.lixing.worker.Test.uilts.SelectDbUilts.*;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.worker.Test.repcode.page.RepQrCodePage;

public class RepCodeTestCase {
	private RepQrCodePage page;
	private WebDriver driver;
	String[][] testDatas;
	
	private String actualSTATUS="1";
	private String expectedSTATUS;
	
	private String actualQRCODE;
	private String expectedQRCODE;
	
	private List<Object>expectedValues;
	@BeforeClass
	public void BeforeClass() {
		page=new RepQrCodePage();
		page.openRepQrCodePage();
		driver=page.getDriver();
		testDatas=concat();
	}
	@DataProvider(name="repcodeDatas")
	public String[][] getTestData(){
		return testDatas;
	}
	
	@Test(dataProvider="repcodeDatas")
	public void RepCodeTestCase_01(String pqcode,String deviceName) {
		page.reqDevicePage(deviceName, pqcode);
		expectedValues=select("TB_PQ_QRCODE",new String[] {"STATUS","QRCODE"},1,"STATUS");
		expectedSTATUS=(String) expectedValues.get(0);
		expectedQRCODE=(String) expectedValues.get(1);
		
		actualQRCODE=(String) select("TB_PQ_QRCODE",new String[] {"STATUS","QRCODE"},1,"STATUS").get(1);
		
		Assert.assertEquals(actualSTATUS,expectedSTATUS);
		Assert.assertEquals(actualQRCODE,expectedQRCODE);
		
		
	}
	
	@AfterClass
	public void afterClass() {
		updata(
				new Object[] {"AREA_CODE",
							 "USER_ACCOUNT",
							 "DEVICE_MODE_ID",
							 "BIND_TIME",
							 "STATUS",
							 "CUST_NAME",
							 "CUST_PHONE",
							 "DEVICE_SN",
							 "COMPANY_CODE",
							 "VIRTUAL_DEVICE",
							 "DEVICE_MODE",
							 "COMPANY_NAME",
							 "STAFF_LEAD_PHONE",
							 "STAFF_LEAD_NAME"
							 }, 
				new Object[] {null,null,null,null,0,null,null,null,null,null,null,null,null,null}, "TB_PQ_QRCODE","STATUS", 9);
		driver.quit();
	}
}
