package org.automation.pageObjects.admin.billing;

import org.automation.base.BasePage;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class LateFeeSettings extends BasePage {
    By search = By.xpath("//input[@type='search']");
    By checkBox = By.xpath("//span[@data-on='Yes']");
    By checkBoxValue = By.xpath("//input[@data-desc='Electricity flat usage']");

//    By search = By.xpath("//input[@type='search']");
//    By search = By.xpath("//input[@type='search']");
//    By search = By.xpath("//input[@type='search']");
//    By search = By.xpath("//input[@type='search']");

    public void enableCheckBox() {
    	WebdriverWaits.waitForElementUntilVisible(checkBox, 5);
        selectCheckBox(checkBox, "Recurring Charge");
    }

    public void disableCheckBox() {
    	WebdriverWaits.waitForElementUntilVisible(checkBox, 5);
        uncheckCheckBox(checkBox, "Recurring Charge");
    }

    public void enterSearchText(String searchText) {

        sendKeys_withClear(search, searchText, "Search");
    }

    public boolean isEnabledCheckBox() {
        return getCheckBoxValue(checkBox, "Recurring Charge");

    }

}
