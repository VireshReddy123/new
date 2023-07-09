package org.automation.pageObjects.customers;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.DateGenerator;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class ChargePage extends BasePage {
    // Charges
	By adminTab = By.xpath("(//*[@class='icon-lock'])[2]");
	By Customer= By.xpath("//button[@class='btn btn-default dropdown-toggle']");
	 public By searchBtn = By.xpath("//button[@id='btn_search']");
	public By recordId = By.xpath("//input[@id='search_input']");
    public By Chargetab = By.xpath("//i[@class='icon-usd']");
    public By Search =By.xpath("//input[@placeholder='Search']");
    public By SearchIcon =By.xpath("//span[@class='glyphicon glyphicon-search']");
    public By AddIconForManualCharge = By.xpath("//a[@title='Add Charge']");
    public By ServiceDropdownField = By.xpath("//select[@name='lineSeqNo']");
    public By ChargeDescriptionField = By.xpath("//input[@name='description']");
    public By RollupDescriptionField = By.xpath("//input[@name='rollupDescription']");
    public By unitsField = By.xpath("//input[@name='units']");
    public By rateField = By.xpath("//input[@name='rate']");
    public By ActiveDayField = By.xpath("//td[@class='active day']");
    public By PriceChargeDollarField = By.xpath("//input[@name='price_charge_dollar']");
    public By SaveButton = By.xpath("//a[@value='Save']");
    public By ClickOnDatepickerField = By.xpath("//input[@id='dateStart']");
    public By clickOnOkButton = By.xpath("//button[@class='btn btn-default'])[2]");
    public By entryMsgOnAddingManualMessage = By.xpath("(//div[@class='dataTables_info'])[1]");
    // Recurring Charges
    public By AddIconForRecurringCharge = By.xpath("(//i[@class='icon-plus'])[2]");
    public By ServiceDropdownRecurringField = By.xpath("//select[@name='lineSeqNo']");
    public By CodeField = By.xpath("//select[@name='code']");
    public By CurrentDateField = By.xpath("//td[@class='active day']");
    public By PlanNameField = By.xpath("//input[@name='planName']");
    public By NumberOfPeriodsField = By.xpath("//input[@name='cycleInMonth']");
    public By ChargeOngoingField = By.xpath("//input[@name='chargeOngoing']");
    public By OngoingCheckbox =By.xpath("//input[@id='chargeOngoing']");
    public By entryMsgOnAddingRecurringMessage = By.xpath("(//div[@class='dataTables_info'])[2]");
    Assertions as;
    String SUCCESS_MSG = "Showing 1 to 1 of 1 entries";

    public void clickOnChargeTab() {
    	WebdriverWaits.waitForElementUntilVisible(Chargetab, 10);
         clickBtn_custom(Chargetab, "Chargetab");
   
    }

    public void clickOnSaveBtn() {
    	WebdriverWaits.waitForElementUntilVisible(SaveButton, 10);
        scrollIntoView(SaveButton);
        click_custom(SaveButton, "Save");
    }

    public void clickOnPlusIcon() {
        click_custom(AddIconForManualCharge, "Plus Icon");
    }

    public void selectService(int serviceByIndex) {
        click_custom(ServiceDropdownField, "Service");
        selectDropDownByIndex_custom(ServiceDropdownField, serviceByIndex, "Service");
    }

    public void enterChargeDesciption(String chargeDescriptionText) {
    	WebdriverWaits.waitForElementUntilVisible( ChargeDescriptionField, 5);
        sendKeys_custom(ChargeDescriptionField, chargeDescriptionText, " Charge Desciption");
    }

    public void enterRollupDesciption(String rollupDescriptionText) {
    	WebdriverWaits.waitForElementUntilVisible(RollupDescriptionField, 5);
        sendKeys_custom(RollupDescriptionField, rollupDescriptionText, " Rollup Desciption");
    }

    public void enterStartDate() {
        click_custom(ClickOnDatepickerField, "Start Date");
        click_custom(ActiveDayField, "Datepicker");
    }

    public void enterUnitsRate(String unitText) {
        scrollIntoView(unitsField);
        sendKeys_custom(unitsField, unitText, "Unit");
    }

    public void enterFlatRate(String rateText) {
        sendKeys_custom(rateField, rateText, "Rate");
    }

    public void enterPriceChargeDollar(String PriceChargetext) {
        sendKeys_custom(PriceChargeDollarField, PriceChargetext, "Charge");
    }

    public void clickOkButton() {
        click_custom(clickOnOkButton, "Ok");
    }

    public void clickOnRecurringPlusIcon() {
        ScrollDownThePageMax();
        WebdriverWaits.waitForElementUntilVisible(AddIconForRecurringCharge, 10);
        click_custom(AddIconForRecurringCharge, "Plus Icon ");
    }

    public void enterServiceDropdownOption(int serviceText) {
    	WebdriverWaits.waitForElementUntilVisible(ServiceDropdownRecurringField, 10);
        click_custom(ServiceDropdownRecurringField, "Service");
        selectDropDownByIndex_custom(ServiceDropdownRecurringField, serviceText, "Service");
    }

    public void enterChargeDescriptionDropdownOption(int chargeText) {
        click_custom(CodeField, "Charge Description");
        selectDropDownByIndex_custom(CodeField, chargeText, "Charge Description");
    }

    public void clickOnGoingToggleBtn() {
        click_custom(ChargeOngoingField, "On Going - always Recurring");
    }

    public void enterPeriodOFCharge(String PeriodOfChargeText) {
        sendKeys_custom(NumberOfPeriodsField, PeriodOfChargeText, "Period Of Charge");
    }

    public String newRowAddUnderManualCharge() {
        WebdriverWaits.waitForElementVisible(entryMsgOnAddingManualMessage, 10);
        return getText_custom(entryMsgOnAddingManualMessage);
    }
    public void admintab()
    {
    	clickBtn_custom(adminTab, "adminTab");
    }
    public void Customerdropdown(String customerdropdown)
    {
    	 
    	selectDropDownByVisibleText_custom(Customer,customerdropdown, "Customer");
    	WebdriverWaits.waitForElementUntilVisible(Customer, 10);
    }
    

    public String newRowAddUnderRecurringCharge() {
        WebdriverWaits.waitForElementUntilVisible(entryMsgOnAddingRecurringMessage, 10);
        return getText_custom(entryMsgOnAddingRecurringMessage);
    }
    public void Checkbox()
    {
    	selectCheckBox(OngoingCheckbox,"OngoingCheckbox");
    }
    public void search(String searchtext)
    {
    	sendKeys_withClear( Search,searchtext," Search");
    }
    public void searchicon()
    {
    	click_custom(SearchIcon,"SearchIcon");
    }

    public void addOnceOffCharges(String recordIdText,int selectServiceIndex, String ChargeDescriptionText, String rollUpText,
                                  String unitRateText, String flatRateText, String priceChargeText) throws InterruptedException {
        as = new Assertions();
      //  admintab();
        Thread.sleep(2000);
     //  Customerdropdown(Customerdropdown);
       Thread.sleep(2000);
       DateGenerator dateGenerator = new DateGenerator();
       clickOnSearchBtn(recordIdText);
    //   search( searchtext);  
   //    searchicon();
        clickOnChargeTab();
        clickOnPlusIcon();
        selectService(selectServiceIndex);
        enterChargeDesciption(ChargeDescriptionText);
        Thread.sleep(3000);
        enterRollupDesciption(rollUpText);
        Thread.sleep(1000);
        enterStartDate();
        enterUnitsRate(unitRateText);
        enterFlatRate(flatRateText);
        enterPriceChargeDollar(priceChargeText);
        clickOnSaveBtn();
        as.assertEquals(newRowAddUnderManualCharge(), SUCCESS_MSG);

    }

    public void  clickOnSearchBtn(String recordIdText) {
    	sendKeys_custom(recordId, recordIdText, "Record Id");
    	WebdriverWaits.waitForElementVisible(searchBtn, 10);
    	click_custom(searchBtn, "Search icon");
	}

	public void addNewRecurringCharge(String recordIdText,int serviceText, int chargeText, String PeriodOfChargeText)
            throws InterruptedException {
        as = new Assertions();
        DateGenerator dateGenerator = new DateGenerator();
        clickOnSearchBtn( recordIdText);
        Thread.sleep(2000);
        clickOnChargeTab();
        clickOnRecurringPlusIcon();
        Thread.sleep(2000);
        enterServiceDropdownOption(serviceText);
        Thread.sleep(3000);
        enterChargeDescriptionDropdownOption(chargeText);
        Thread.sleep(2000);
        enterStartDate();
        Thread.sleep(2000);
      //  clickOnGoingToggleBtn();
        enterPeriodOFCharge(PeriodOfChargeText);
        Checkbox();
        clickOnSaveBtn();
        as.assertEquals(newRowAddUnderRecurringCharge(), SUCCESS_MSG);

    }

}
