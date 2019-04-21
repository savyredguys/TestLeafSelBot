package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp")  WebElement eleCompanyName;
	@FindBy(how=How.XPATH, using="//a[text()='Duplicate Lead']") WebElement eleDuplicateLeadButton;
	@FindBy(how=How.ID, using="viewLead_dataSources_sp") WebElement eleSourceVerify;
	
	public ViewLeadPage verifyCompanyName(String data) {
		String companyName = getElementText(eleCompanyName);
		if (companyName.contains(data)) {
			System.out.println("The Company Name is Matching Successfully ");
		} else {
			System.out.println("The Company Name is not Matching ");
		}
		return this;
	}

public DuplicateLead clickDuplicateLeadButton() {
	click(eleDuplicateLeadButton);
	return new DuplicateLead();
}

	public ViewLeadPage sourcesVerify() {
	String sourcesName = getElementText(eleSourceVerify);
	if (sourcesName.contains("Existing Customer")) {
		System.out.println("The Source Name is Matching Successfully and Source name is: "+sourcesName);
	} else {
		System.out.println("The Company Name is not Matching ");
	}
	return this;
}


}
