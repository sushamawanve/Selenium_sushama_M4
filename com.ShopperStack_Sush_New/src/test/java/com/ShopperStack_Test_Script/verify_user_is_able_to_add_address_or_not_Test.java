package com.ShopperStack_Test_Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShopperStack_Sush.GenericUtility.BaseTest;
import com.ShopperStack_Sush.Pom.AddressForm_Page;
import com.ShopperStack_Sush.Pom.MyAddress_Page;
import com.ShopperStack_Sush.Pom.MyProfile_Page;


public class verify_user_is_able_to_add_address_or_not_Test extends BaseTest{
	
	@Test 
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException{
		homePage.getAccountSettingBtn().click();
		Thread.sleep(2000);
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myprofile=new MyProfile_Page(driver);
		myprofile.getMyAddressBtn().click();
		
		MyAddress_Page myaddress=new MyAddress_Page(driver);
		myaddress.getRemoveAddressBtn().click();
		
		AddressForm_Page addressfrom = new AddressForm_Page(driver);
		addressfrom.getOfficeRBtn().click();
		addressfrom.getNameBtn().sendKeys(file.readExcelData("Sheet1", 1, 0));
		addressfrom.getHouseBtn().sendKeys(file.readExcelData("Sheet1", 1, 1));
		addressfrom.getStreetInfoBtn().sendKeys(file.readExcelData("Sheet1", 1, 2));
		addressfrom.getLandmarkBtn().sendKeys(file.readExcelData("Sheet1", 1, 3));
		
		webdriver.selectByValue(addressfrom.getCountryBtn(), file.readPropertyData("country"));
		webdriver.selectByValue(addressfrom.getStateBtn(), file.readPropertyData("state"));
		webdriver.selectByValue(addressfrom.getCityBtn(), file.readPropertyData("city"));
		
		addressfrom.getPincodeBtn().sendKeys(file.readExcelData("Sheet1", 1, 4));
		addressfrom.getPhoneNumberBtn().sendKeys(file.readExcelData("Sheet1", 1, 5));
	    addressfrom.getAddAddressBtn().click();
	    Thread.sleep(3000);

		}

}
	
	
	
	


