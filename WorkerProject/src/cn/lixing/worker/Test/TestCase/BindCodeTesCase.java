package cn.lixing.worker.Test.TestCase;
import static cn.lixing.worker.Test.uilts.SelectDbUilts.*;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.worker.Test.bindcode.page.BindQrCodePage;
public class BindCodeTesCase {
	private String[][] testDatas;
	private BindQrCodePage page;
	private WebDriver driver;
	private List<Object>expectedValues;
	private String actualUSER_ACCOUNT;
	private String actualSTATUS="1";
	private String expectedUSER_ACCOUNT;
	private String expectedSTATUS;
	
	@BeforeClass
	public void initTestData() {
		page=new BindQrCodePage();
		page.openCompanyPage();
		driver=page.getDriver();
		testDatas=decrypteQpcodeData(0);
	}
	
	@DataProvider(name="BindCodeData")
	public String[][]getTestData(){
		return testDatas;
	}
	
	@Test(dataProvider="BindCodeData")
	public void BindCodeTest_01(String pqcode) {
		page.AddDevicePage(pqcode);
		expectedValues=select("TB_PQ_QRCODE",new String[] {"USER_ACCOUNT","STATUS"},1,"STATUS");
		expectedUSER_ACCOUNT=(String) expectedValues.get(0);
		expectedSTATUS=(String) expectedValues.get(1);
		actualUSER_ACCOUNT=page.getBusNumber();
	
		
		Assert.assertEquals(actualUSER_ACCOUNT,expectedUSER_ACCOUNT);
		Assert.assertEquals(actualSTATUS,expectedSTATUS);
		
	}
	
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
