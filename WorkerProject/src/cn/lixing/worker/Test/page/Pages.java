package cn.lixing.worker.Test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface Pages {
	public WebDriver openWorkerPage();
	
	//public void ElementWaitTime(String xpathExpression);
	
	public WebElement getWebElement(String xpath);
	
	public void click(WebElement element);
	
	public void sendKey(WebElement element, String context);
	
	public void clear(WebElement element);
	
	
}
