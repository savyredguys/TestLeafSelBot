package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selbot.testng.api.base.Annotations;

public class DuplicateLead extends Annotations{
	
	public DuplicateLead() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(how=How.ID, using="createLeadForm_dataSourceId") WebElement eleSourceDropdown;
		@FindBy(how=How.CLASS_NAME, using="smallSubmit") WebElement eleCreateLeadButton;
		
		public DuplicateLead sourceDropdown() {
			Select dropdown= new Select(eleSourceDropdown);
			dropdown.selectByVisibleText("Existing Customer");
			return this;
		}
		
		public ViewLeadPage clickCreateLeadButton() {
			click(eleCreateLeadButton);
			return new ViewLeadPage();
			
		}

		
		}
	
		


