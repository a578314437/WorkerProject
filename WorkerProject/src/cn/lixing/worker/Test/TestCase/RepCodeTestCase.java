package cn.lixing.worker.Test.TestCase;

import static cn.lixing.worker.Test.uilts.ConcatUilt.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cn.lixing.worker.Test.repcode.page.RepQrCodePage;

public class RepCodeTestCase {
	private RepQrCodePage page;
	private WebDriver driver;
	String[][] testDatas;
	
	private int actualSTATUS=1;
	private int expectedSTATUS;
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
		
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
