package org.base;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends LibGlobal {
	public static void main(String[] args) throws AWTException, InterruptedException {
		LibGlobal global = new LibGlobal();
//		global.getDriver();
//		global.lanuchUrl("https://www.facebook.com/");
//		WebElement txtUserName = driver.findElement(By.id("email"));
//		global.entertext(txtUserName, "SASIKUMAR");
//		global.printCurrentUrl(driver);
//		global.printTitle(driver);
//		//global.close(driver);
//		global.mouseOver(actions, txtUserName);
//		global.doubleClick(actions);
//		global.rightClick(actions);
//		
//		global.downKey(robot);
//		global.sleep();
//		global.getAttribute(txtUserName);
		
		global.getDriver();
		
		global.lanuchUrl("http://demo.automationtesting.in/Alerts.html");
		WebElement btnClick1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		global.btnClick(btnClick1);
		global.alertOk();
	}
	
	
}
