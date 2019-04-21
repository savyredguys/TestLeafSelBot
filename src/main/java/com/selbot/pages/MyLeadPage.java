package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class MyLeadPage extends Annotations{

	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.LINK_TEXT, using="Create Lead")  WebElement eleCreateLead;
	@FindBy(how=How.LINK_TEXT, using="Find Leads") WebElement eleFindLead;
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]") WebElement eleFirName;
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']") WebElement eleFindLeadButton;
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") WebElement eleFirstLeadlist;

	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}

public MyLeadPage clickFindLead() throws InterruptedException {
	click(eleFindLead);
	Thread.sleep(3000);
	return this;
}

public MyLeadPage enterFirName(String firName) {
	clearAndType(eleFirName, firName);
	return this;
}

public MyLeadPage clickFindLeadButton() throws InterruptedException {
	click(eleFindLeadButton);
	Thread.sleep(3000);
	return this;
}

public ViewLeadPage clickFirstLeadList() {
	click(eleFirstLeadlist);
	return new ViewLeadPage();
}


}
