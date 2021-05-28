package org.junit;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static WebDriver driver;
	public static Select select;
	@BeforeClass
	public static  void beforeClassMethods() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasi kumar\\eclipse-workspace\\MavenProjectFramework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	
	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@After 
	public void afterMethod() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File screenshotAs = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, new File("adactin.png"));
		Date date = new Date();
		System.out.println(date);
	}
	
	
	
	@Test
	public void tc0() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("sasikumar2244");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("sasikumar24");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();		
				
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		select = new Select(location);
		select.selectByIndex(1);
		 
		WebElement hotels = driver.findElement(By.id("hotels"));
		location.click();
		select = new Select(hotels);
		select.selectByIndex(1);
	
		WebElement roomType = driver.findElement(By.id("room_type"));
		location.click();
		select = new Select(roomType);
		select.selectByIndex(1);
	
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		location.click();
		select = new Select(roomNo);
		select.selectByIndex(1);
	
		WebElement adultNo = driver.findElement(By.id("adult_room"));
		location.click();
		select = new Select(adultNo);
		select.selectByIndex(1);
		
		
		WebElement childNo = driver.findElement(By.id("child_room"));
		location.click();
		select = new Select(childNo);
		select.selectByIndex(1);
	
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("20/05/2021");
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("21/05/2021");
		
		WebElement btnSubmit= driver.findElement(By.id("Submit"));
		btnSubmit.click();
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("sasi");
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("kumaru");
	
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("chennai");
		WebElement ccNumber = driver.findElement(By.id("cc_num"));
		ccNumber.sendKeys("1234567891012354");
		
		WebElement ccType = driver.findElement(By.id("cc_type"));
		ccType.click();
		select = new Select(ccType);
		select.selectByIndex(1);
		
		WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
		ccMonth.click();
		select = new Select(ccMonth);
		select.selectByIndex(1);
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		ccYear.click();
		select = new Select(ccYear);
		select.selectByIndex(2);
		
		WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
		cvvNumber.sendKeys("544");
		
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
