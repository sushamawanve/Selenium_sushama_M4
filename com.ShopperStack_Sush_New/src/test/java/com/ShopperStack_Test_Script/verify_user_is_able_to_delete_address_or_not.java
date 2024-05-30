package com.ShopperStack_Test_Script;

import org.testng.annotations.Test;

import com.ShopperStack_Sush.GenericUtility.BaseTest;
import com.ShopperStack_Sush.Pom.MyAddress_Page;
import com.ShopperStack_Sush.Pom.MyProfile_Page;



public class verify_user_is_able_to_delete_address_or_not extends BaseTest{
	@Test
	public void deleteAddress() throws InterruptedException {
		homePage.getAccountSettingBtn().click();
		Thread.sleep(2000);
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddressBtn().click();
		Thread.sleep(2000);
		MyAddress_Page myaddress=new MyAddress_Page(driver);
		myaddress.getRemoveAddressBtn().click();
		Thread.sleep(2000);
		myaddress.getYesBtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	
}
}

