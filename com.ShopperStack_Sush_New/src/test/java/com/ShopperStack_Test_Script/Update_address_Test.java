package com.ShopperStack_Test_Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.ShopperStack_Sush.GenericUtility.BaseTest;
import com.ShopperStack_Sush.Pom.MyAddress_Page;
import com.ShopperStack_Sush.Pom.MyProfile_Page;
import com.ShopperStack_Sush.Pom.Update_address;


public class Update_address_Test extends BaseTest{

	
	@Test
	public void update() throws InterruptedException, AWTException
	{
		homePage.getAccountSettingBtn().click();
		Thread.sleep(2000);
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddressBtn().click();
		
		MyAddress_Page myaddress=new MyAddress_Page(driver);
		myaddress.getUpdateAddressBtn().click();
		Thread.sleep(3000);
//		myaddress.getUpdateAddressBtn().click();
		
		Update_address update=new Update_address(driver);
		Thread.sleep(3000);
		update.getUpdateNamebtn().click();
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_DELETE);
		update.getUpdateNamebtn().sendKeys("sushma");
		Thread.sleep(3000);
		update.getUpdateNamebtn().click();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(2000);
		update.getUpdateNamebtn().sendKeys("Wanve HOUSE");
		Thread.sleep(3000);
		
		update.getUpdateNamebtn().click();
		Thread.sleep(3000);
	}

	
	
}	
		