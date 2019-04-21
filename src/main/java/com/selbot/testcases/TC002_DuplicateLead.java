package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC002_DuplicateLead extends Annotations {

	@BeforeTest
	public void setData() {
		testcaseName = "TC002_DuplicateLead";
		testcaseDec = "Login, Duplicate Lead and Verify";
		author = "Sarvesh";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd, String firName) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirName(firName)
		.clickFindLeadButton()
		.clickFirstLeadList()
		.clickDuplicateLeadButton()
		.sourceDropdown()
		.clickCreateLeadButton()
		.sourcesVerify();
	}
	
}
