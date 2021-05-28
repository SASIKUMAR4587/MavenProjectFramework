package org.select;

import org.base1.LibGlobal1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal1 {
	public SelectHotel(){
		PageFactory.initElements(driver, this);
	}
		@FindBy(name="radiobutton_0")
		private WebElement radiobtn;
		@FindBy(id="continue")
		private WebElement continuee;
		
		public WebElement getRadiobtn() {
			return radiobtn;
		}
		public WebElement getContinuee() {
			return continuee;
		}
		
		
		
}
