package cn.lixing.worker.Test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkerPage {
	private WebDriver driver;
	private WebElement element;
	private WebDriverWait wait;
	
	public WebDriver openWorkerPage() {
		System.setProperty("webdriver.chrome.driver", "D:\\SelfServiceProject\\SelfServiceProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://58.249.55.68:30063/worker/");
		return driver;
	}
	public void ElementWaitTime(String xpathExpression) {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathExpression)));
	}
	
	public WebElement getWebElement(String xpath) {
		ElementWaitTime(xpath);
		element=driver.findElement(By.xpath(xpath));
		return element;
	}

	public void click(WebElement element) {
		element.click();
	}

	public void sendKey(WebElement element, String context) {
		element.sendKeys(context);
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
