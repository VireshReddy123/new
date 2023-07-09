package org.automation.pageObjects.admin.paymentGateway;

import org.automation.base.BasePage;
import org.automation.utilities.Assertions;
import org.automation.utilities.DateGenerator;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class PaymentsPage extends BasePage {
	public By searchBtn = By.xpath("//button[@id='btn_search']");
	public By recordId = By.xpath("//input[@id='search_input']");
    public By transactionsubtab = By.xpath("//a[text()=' Transactions']");
    public By transactintypedropdownfield = By.xpath("//select[@name='tranType']");
    public By paymentMethoddropdownfield = By.xpath("//select[@name='tranSubType']");
    public By emailfortransactionfield = By.xpath("//input[@name='receiptEmail']");
    public By amountfield = By.xpath("//input[@name='amount']");
    public By allowduplicatecheckbox = By.xpath("//input[@name='allowDupes']");
    public By commentfield = By.xpath("//input[@name='comment']");
    public By transactionsubmitbutton = By.xpath("//a[@name='submitBtn']");
    public By okbuttonfortransaction = By.xpath("(//button[@class='btn btn-primary'])[3]");
    public By makeNewPaymentButton = By.xpath("//span[text()='Make New Payment']");
    public By viewHistoryButton = By.xpath("//span[text()='View History']");
    public By entryMsgOnAddingPaymentByCreditCard = By.xpath("//div[@id='tbl-trans-history_info']");
    public By entryMsgOnAddingPaymentBySecurityDeposit = By.xpath("//div[@id='tbl-trans-history_info']");
    Assertions as;
    String SUCCESS_MSG = "Showing 1 to 1 of 1 entries";
    String SUCCESS_MSG_SECURITY = "Showing 1 to 2 of 2 entries";

    public void clickOnTransactionTab() {
    	WebdriverWaits.fluentWait_Clickable(5, 5, transactionsubtab);
        click_custom(transactionsubtab, "Transaction");
    }

    public void selectTransactionTypeOption(String transactionTypeText) {
        click_custom(transactintypedropdownfield);
        selectDropDownByVisibleText_custom(transactintypedropdownfield, transactionTypeText,
                " Transaction Type");
    }

    public void selectPaymentMethodOption(String paymentMethodTypeText) {

        selectDropDownByVisibleText_custom(paymentMethoddropdownfield, paymentMethodTypeText,
                " Payment Method");
    }

    public void enterReceiptEmail(String receiptEmailText) {
        sendKeys_withClear(emailfortransactionfield, receiptEmailText, " Receipt Email");
    }

    public void enterAmount(String amountText) {
        sendKeys_custom(amountfield, amountText, "Amount");
    }

    public void clickduplicateCheckBoxToggleButton() {
        clickBtn_custom(allowduplicatecheckbox, "Allow Duplicate transcation");

    }
    public void  clickOnSearchBtn(String recordIdText) {
    	sendKeys_custom(recordId, recordIdText, "Record Id");
    	WebdriverWaits.waitForElementVisible(searchBtn, 10);
    	click_custom(searchBtn, "Search icon");
	}

    public void enterComments(String commentText) {
        sendKeys_custom(commentfield, commentText, "Commnets");

    }

    public void clickSubmitTransactionButton() {
        scrollIntoView(transactionsubmitbutton);
        click_custom(transactionsubmitbutton, "Submit Transaction");
    }

    public void clickOkButton() {
        WebdriverWaits.waitForElementVisible(okbuttonfortransaction, 2);
        click_custom(okbuttonfortransaction, "Ok");
    }

    public void clickOnMakePaymentButton() {
        scrollIntoView(makeNewPaymentButton);
        // WebdriverWaits.waitForElementVisible(makeNewPaymentButton, 2);
        clickBtn_custom(makeNewPaymentButton, "Make New Payment");
    }

    public void clickOnViewHistoryButton() {
        WebdriverWaits.fluentWait_Clickable(5,5,viewHistoryButton);
        click_custom(viewHistoryButton, "View History");
    }

    public String entryMsgOnAddingPaymentByCreditCard() {
        WebdriverWaits.waitForElementVisible(entryMsgOnAddingPaymentByCreditCard, 10);
        return getText_custom(entryMsgOnAddingPaymentByCreditCard);
    }

    public String entryMsgOnAddingPaymentBySecurityDeposit() {
        WebdriverWaits.waitForElementVisible(entryMsgOnAddingPaymentBySecurityDeposit, 10);
        return getText_custom(entryMsgOnAddingPaymentBySecurityDeposit);
    }

    public void PaymentsFromCreditCard(String recordIdText,String transactionTypeText, String paymentMethodTypeText,
                                       String receiptEmailText, String amountText, String commentText) throws InterruptedException {
        as = new Assertions();
        DateGenerator dateGenerator = new DateGenerator();
        clickOnSearchBtn( recordIdText);
        clickOnTransactionTab();
        selectTransactionTypeOption(transactionTypeText);
        Thread.sleep(3000);
        selectPaymentMethodOption(paymentMethodTypeText);
        enterReceiptEmail(receiptEmailText);
        enterAmount(amountText);
        clickduplicateCheckBoxToggleButton();
        enterComments(commentText);
        clickSubmitTransactionButton();
        clickOkButton();
        Thread.sleep(2000);
        clickOnViewHistoryButton();
        as.assertEquals(entryMsgOnAddingPaymentByCreditCard(), SUCCESS_MSG);
        Thread.sleep(3000);
        clickOnMakePaymentButton();

    }

    public void AddSecurityDeposit(String transactionTypeText, String paymentMethodTypeText, String receiptEmailText,
                                   String amountText, String commentText) {
        as = new Assertions();
        clickOnTransactionTab();
        selectTransactionTypeOption(transactionTypeText);
        selectPaymentMethodOption(paymentMethodTypeText);
        enterReceiptEmail(receiptEmailText);
        enterAmount(amountText);
        clickduplicateCheckBoxToggleButton();
        enterComments(commentText);
        clickSubmitTransactionButton();
        clickOkButton();
        as.assertEquals(entryMsgOnAddingPaymentByCreditCard(), SUCCESS_MSG_SECURITY);

    }

    public void AddSecurityDepositFromCC(String recordIdText, String transactionTypeText, String paymentMethodTypeText,
                                         String receiptEmailText, String amountText, String commentText) throws InterruptedException {
        as = new Assertions();
        DateGenerator dateGenerator = new DateGenerator();
        clickOnSearchBtn( recordIdText);
        clickOnTransactionTab();
        selectTransactionTypeOption(transactionTypeText);
        Thread.sleep(3000);
        selectPaymentMethodOption(paymentMethodTypeText);
        enterReceiptEmail(receiptEmailText);
        enterAmount(amountText);
        clickduplicateCheckBoxToggleButton();
        enterComments(commentText);
        clickSubmitTransactionButton();
        clickOkButton();
        as.assertEquals(entryMsgOnAddingPaymentByCreditCard(), SUCCESS_MSG);


    }
}
