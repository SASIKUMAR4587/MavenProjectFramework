package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions actions;
	public static Robot robot;
	public static Alert alert;
	public static TakesScreenshot screenshot;
	public static JavascriptExecutor js ;
	public static Select select;
	
	
	public void getDriver() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasi kumar\\eclipse-workspace\\MavenProjectFramework\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		robot = new Robot();
		screenshot =(TakesScreenshot)driver;
		js = (JavascriptExecutor)driver;
	}
	public void lanuchUrl(String url) {
		driver.get(url);
	}
	public void entertext(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement element) {
		element.click();
		
	}
	public void printCurrentUrl(WebDriver driver ) {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public void printTitle(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void close(WebDriver driver) {
		driver.close();
	}
	
	public void mouseOver(Actions actions,WebElement element) {
		actions.moveToElement(element).perform();

	}
	public void doubleClick(Actions actions) {
		actions.doubleClick().perform();

	}
	public void rightClick(Actions actions) {
		actions.contextClick().perform();
		
	}
	public void downKey(Robot robot) {
		
		for (int i = 0; i <=7; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	public void getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	public void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void promptAlert(String input) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		alert.accept();
	}
	public void alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	}
	public void dragAndDrop(WebElement source,WebElement target) {
		actions.dragAndDrop(source, target).perform();

	}
	public void screenShot(String path) throws IOException {
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileHandler.copy(screenshotAs, f);
	}
	public void scrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	public void scrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public void goTo(String url) {
		driver.navigate().to(url);
	}
	
	public void goBack() {
		driver.navigate().back();
	}
	public void goForward() {
		driver.navigate().forward();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void waits(WebDriver driver,long timeout,TimeUnit secs) {
		driver.manage().timeouts().implicitlyWait(timeout, secs);
	}
	public void getOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i <options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	public void newFile(String path) throws IOException {
		File file = new File(path);
		boolean exists = file.exists();
		System.out.println(exists);
		boolean file2 = file.createNewFile();
		System.out.println(file2);
	}
	public void newFolder(String folder) {
		File f = new File(folder);
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
	}
	public void insideNewFolder(String folder) {
		File f1 = new File(folder);
		boolean mkdirs = f1.mkdirs();
		System.out.println(mkdirs);
	}
	public void quit(WebDriver driver) {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
