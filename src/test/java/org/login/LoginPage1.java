package org.login;

import org.base1.LibGlobal1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class LoginPage1 extends LibGlobal1{

	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//input[@id='username']"),@FindBy(name="username")})
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
	
	
}
