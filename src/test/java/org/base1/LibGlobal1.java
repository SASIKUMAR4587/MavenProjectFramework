package org.base1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal1 {
	public static WebDriver driver;
	
	public void getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasi kumar\\eclipse-workspace\\FacebookLoginn\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void enterText(WebElement element,String dataa) {
		element.sendKeys(dataa);
	}
	public void btnClick(WebElement element) {
		element.click();
	}
	public void dropDown(WebElement element,Integer index) {
		element.click();
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void clear(WebElement element) {
		element.clear();
	}
	
	
	
	
	
	
	
}
