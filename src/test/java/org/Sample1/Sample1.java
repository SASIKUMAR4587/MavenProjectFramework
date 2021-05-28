package org.Sample1;


import org.base1.LibGlobal1;
import org.booking.BookHotel;
import org.hotelsearch.SearchHotel;
import org.login.LoginPage1;
import org.openqa.selenium.WebElement;
import org.select.SelectHotel;

public class Sample1 extends LibGlobal1 {
	public static void main(String[] args) throws InterruptedException {
		
		LibGlobal1 global = new LibGlobal1();
		global.getdriver();
		global.launchUrl("https://adactinhotelapp.com/");
		
		LoginPage1 loginPage1 = new LoginPage1();
		WebElement userName = loginPage1.getTxtUserName();
		global.enterText(userName,"sasikumar2244");
		
		WebElement password = loginPage1.getTxtPassword();
		global.enterText(password, "sasikumar24");
		
		WebElement btnLogin = loginPage1.getBtnLogin();
		global.btnClick(btnLogin);
		
		SearchHotel search = new SearchHotel();
		WebElement location = search.getLocation();
		global.dropDown(location, 1);
		
		WebElement hotel = search.getHotel();
		global.dropDown(hotel, 2);
		
		WebElement roomType = search.getRoomType();
		global.dropDown(roomType, 3);
		
		WebElement roomNum = search.getRoomNum();
		global.dropDown(roomNum, 2);
		
		Thread.sleep(2000);
		WebElement checkIn = search.getCheckIn();
		global.clear(checkIn);
		global.enterText(checkIn, "15/05/2021");
		
		Thread.sleep(1000);
		WebElement checkOut = search.getCheckOut();
		global.clear(checkOut);
		global.enterText(checkOut, "17/05/2021");
		
		WebElement adult = search.getAdult();
		global.dropDown(adult, 2);
		
		WebElement child = search.getChild();
		global.dropDown(child, 1);
		
		WebElement submit = search.getSubmit();
		global.btnClick(submit);
		
		SelectHotel select = new SelectHotel();
		WebElement radiobtn = select.getRadiobtn();
		global.btnClick(radiobtn);
		
		WebElement continuee = select.getContinuee();
		global.btnClick(continuee);
		
		BookHotel book = new BookHotel();
		WebElement firstName = book.getFirstName();
		global.enterText(firstName, "sasi");
		
		WebElement lastName = book.getLastName();
		global.enterText(lastName, "kumar");
		
		WebElement address = book.getAddress();
		global.enterText(address, "neyveli,cuddalore district,tamilnadu");
		
		WebElement creditCardNum = book.getCreditCardNum();
		global.enterText(creditCardNum, "1234 5678 9101 1121");
		
		WebElement ccType = book.getCcType();
		global.dropDown(ccType, 1);
		
		WebElement expMonth = book.getExpMonth();
		global.dropDown(expMonth, 1);
		
		WebElement expYear = book.getExpYear();
		global.dropDown(expYear, 2);
		
		WebElement cvvNum = book.getCvvNum();
		global.enterText(cvvNum, "305");
		
		WebElement book2 = book.getBook();
		global.btnClick(book2);
	}
	
	
		
}
