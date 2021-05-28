import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasi kumar\\eclipse-workspace\\FacebookLoginn\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.name("email"));
		txtUserName.sendKeys("sasikumar");
		WebElement txtPassword = driver.findElement(By.name("pass"));
		txtPassword.sendKeys("4566211");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
	
	
	
}
