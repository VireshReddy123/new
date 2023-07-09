package org.automation.pageObjects.customers;

import org.automation.base.BasePage;
import org.automation.utilities.WebdriverWaits;
import org.openqa.selenium.By;

public class AddMeterReads extends BasePage {
    public By searchBtn = By.xpath("//button[@id=\"btn_search\"]");
    public By recordId = By.xpath("//input[@id='search_input']");
    public By Admin = By.xpath("//a[@title='Administration']");
    public By SMTPicon = By.xpath("(//i[@class='icon-hdd'])[2]");
    public By SrverField = By.xpath("//input[@name='smtpServer']");
    public By PortField = By.xpath("//input[@name='smtpPort']");
    public By UserAuthCheckbox = By.xpath("//input[@id='auth']");
    public By Username = By.xpath("//input[@class='auth-inputs']");
    public By Password = By.xpath("(//input[@class='auth-inputs'])[2]");
    public By UpdateSMTPbutton = By.xpath("//a[@class='btn btn-large btn-primary']");

    public By TemplateIcon = By.xpath("//i[@class='glyphicon glyphicon-comment']");
    public By MsgType = By.xpath("//select[@id='email_message_type']");
    public By Emailfrom = By.xpath("//input[@id='email_rem_from']");
    public By Emailbcc = By.xpath("//input[@id='email_rem_bcc']");
    public By Subject = By.xpath("//input[@id='email_rem_subject']");
    public By SaveEmailTemp = By.xpath("(//button[@id='validtagsEmail'])[2]");
    public By SavedEmailMsg = By.xpath("//div[@class='alert alert-success']/center/p");
    public By SMStab = By.xpath("//ul[@id='myTab']/li[2]/a");
    public By Messagetyp = By.xpath("(//tr[@class='frmTb2'])[5]/td[2]/select");
    public By SMSmsg = By.xpath("//textarea[@id='sms_rem_message']");
    public By SaveSMS = By.xpath("(//a[@class='buttonSml'])[2]");
    public By CustDetailsTab = By.xpath("//ul[@class='nav nav-tabs']/li[2]");
    public By CustEmailField = By.xpath("//input[@name='contact_email']");
    public By SaveCust = By.xpath("//a[@id='saveButton']");
    public By OKbtnn = By.xpath("//button[text()='OK']");
    public By SavedCustMsg = By.xpath("//div[@id='notification']/center");
    public By CustNumberCreated = By.xpath("(//a[@class='prevent'])[3]/p/b");
    public By BillRunCycle = By.xpath("(//div[@class='box-content quicklinksbox'])[6]/div[2]");
    public By CreateCycle = By.xpath("//a[@id='addBtn']");
    public By CycleName = By.xpath("//input[@id='cyclename']");
    public By SearchCustForCycle = By.xpath("//input[@class='filter form-control']");
    public By SelectCust = By.xpath("//select[@name='custnos_helper1']/option");
    public By RightArrow = By.xpath("(//i[@class='glyphicon glyphicon-arrow-right'])[3]");
    public By SaveCyc = By.xpath("//button[@id='saveCycle']");
    public By CycleSavedSuccess = By.xpath("//span[@id='resultMsg']");
    public By MainCustSearch = By.xpath("//input[@id='search_input']");
    public By SearchIcon = By.xpath("//button[@id='btn_search']");
    public By MeterReadsTab = By.xpath("//ul[@class='nav nav-tabs']/li[4]");
    public By AddRead = By.xpath("//a[contains(text(),' Add Read')]");
    public By ReadType = By.xpath("//select[@id='modalReadType']");
    public By ReadDate = By.xpath("//input[@id='modalReadDate']");
    public By TodayDate = By.xpath("//td[@class='active day']");
    public By ReadReadings = By.xpath("//input[@id='modalReadingA']");
    public By SaveReads = By.xpath("(//button[@class='btn btn-primary'])[2]");
    public By ReadTypeSaved = By.xpath("//tr[@id='0']/td[4]");
    public By SelectMeterNumbr = By.xpath("//select[@name='meterNo']");
   // public By NextDate = By.xpath("(//td[@class='active day']/following-sibling::td)[4]");

    public By NextDate = By.xpath("//td[@class='active day']/../preceding-sibling::tr/td[contains(text(),'26')]");

    public By BillRunTab = By.xpath("//a[@title='Saas Bill Run']/i");
    public By RunTheBills = By.xpath("//button[@class='btn btn-success']");
    public By Reccurringdate = By.xpath("//input[@id='cycleDate']");
    public By IssueDate = By.xpath("//input[@id='issueDate']");
    public By DueDate = By.xpath("//input[@id='dueDate']");
    public By CycleNumber = By.xpath("//select[@id='cycleno']");
    public By RunBillBtn = By.xpath("//button[@class='btn btn-primary']");
    public By NextDay = By.xpath("//td[@class='new day']");
    public By cross = By.xpath("//*[@class='bootstrap-dialog-close-button']");
    public By comsumptionDate = By.xpath("(//div[@class='datepicker-days']//tr/td[@class='day'])[28]");
    public By Date = By.id("modalReadDate");

    public By meterPeak = By.id("modalReadingP");
    public By offPeak = By.id("modalReadingO");
    public By shoulder = By.id("modalReadingS");


    public void sendPeakMeterReads(String peakText) {
    	WebdriverWaits.waitForElementUntilVisible(meterPeak, 10);
    	click_custom(meterPeak, "Meter Read(flat)");
        sendKeys_custom(meterPeak, peakText, "Meter Read(flat)");
    }

    public void sendOffPeakMeterReads(String offPeakText) {
    	
        sendKeys_custom(offPeak, offPeakText, "Meter Read(flat)");
    }

    public void sendShoulderMeterReads(String shoulderText) {
        sendKeys_custom(shoulder, shoulderText, "Meter Read(flat)");
    }



    public void clickOnMeterReadsTab() {
    	WebdriverWaits.waitForElementUntilVisible(MeterReadsTab, 5);
        clickBtn_custom(MeterReadsTab, "Meter Reads");
        scrollIntoView(AddRead);
    }


    public void clickOnAddReads() {
        scrollIntoView(AddRead);
        clickBtn_custom(AddRead, "Add Read");
    }

    public void selectMeterNumberDD(int indexNo) {
        WebdriverWaits.waitForElementVisible(SelectMeterNumbr, 2);
        selectDropDownByIndex_custom(SelectMeterNumbr, indexNo, "Meter Number");
    }

    public void clickMeterNumberDD() {
        click_custom(SelectMeterNumbr, "Meter Number");

    }

    public void selectReadTypeFromDropdownlist(String categoryText) {
    	WebdriverWaits.waitForElementUntilVisible(ReadType, 10);
        selectDropDownByVisibleText_custom(ReadType, categoryText, "Add Read Type");

    }


    public void selectReadDateFromDatepickerForToday() {
        clickBtn_custom(ReadDate, "Read Date");
        clickBtn_custom(TodayDate, "Date");

    }

    public void selectReadDateFromDatepickerForNxtDay() {
        clickBtn_custom(ReadDate, "Read Date");
        clickBtn_custom(NextDate, "Date");

    }

    public void sendMeterReadings(String meterReadingText) {
        sendKeys_custom(ReadReadings, meterReadingText, "Meter Read(flat)");
    }

    public void selectReadDateFromDatepickerForNextDay() {
        clickBtn_custom(ReadDate, "Read Date");
        clickBtn_custom(NextDate, "Date");

    }

    public void clickOnSaveBtn() {
        clickBtn_custom(SaveReads, "Save");
    }

    public void addMeterReads(String categoryText, String meterReadingText) throws InterruptedException {
        clickOnAddReads();
        selectReadTypeFromDropdownlist(categoryText);
//        if (categoryText.equalsIgnoreCase("estimate")) {
//            selectReadDateFromDatepickerForNextDay();
//        } else
//            selectReadDateFromDatepickerForToday();
        //String date =  dateGenerator.getDateWithDays("dd/MM/yyyy",45);

        selectReadDateFromDatepickerForToday();
        sendMeterReadings(meterReadingText);
        clickOnSaveBtn();
    }

    public void addComsumptionReads(String categoryText, String meterReadingText) throws InterruptedException {
        clickOnAddReads();
        selectReadTypeFromDropdownlist(categoryText);
        selectReadDateFromDatepickerForNextDay();
//        click_custom(Date);
//        click_custom(comsumptionDate);
        sendMeterReadings(meterReadingText);
        clickOnSaveBtn();
    }

    public void clickOnSearchBtn(String recordIdText) {
        sendKeys_custom(recordId, recordIdText, "Record Id");
        WebdriverWaits.waitForElementVisible(searchBtn, 10);
        clickBtn_custom(searchBtn, "Search icon");

    }


    public void clickCross() {
        click_custom(cross);
    }

    public void addMeterReadsForWater(int indexNo, String categoryText, String meterReadingText) {
        clickOnMeterReadsTab();
        clickOnAddReads();
        selectReadTypeFromDropdownlist(categoryText);
        selectReadDateFromDatepickerForNextDay();
        sendMeterReadings(meterReadingText);
        clickOnSaveBtn();
    }


    public void addMeterReading(String categoryText, String peakText) throws InterruptedException {
        clickOnAddReads();
        Thread.sleep(2000);
        selectReadTypeFromDropdownlist(categoryText);
//        if (categoryText.equalsIgnoreCase("estimate")) {
//            selectReadDateFromDatepickerForNextDay();
//        } else
//            selectReadDateFromDatepickerForToday();
        //String date =  dateGenerator.getDateWithDays("dd/MM/yyyy",45);

        selectReadDateFromDatepickerForToday();
        // sendMeterReadings(meterReadingText);
        sendPeakMeterReads(peakText);
        Thread.sleep(2000);
  //      sendOffPeakMeterReads(offPeakText);
  //     sendShoulderMeterReads(shoulderText);
        clickOnSaveBtn();
    }

    public void addComsumptionReading(String categoryText, String peakText) throws InterruptedException {
        clickOnAddReads();
        selectReadTypeFromDropdownlist(categoryText);
        selectReadDateFromDatepickerForNextDay();
     //click_custom(Date);
    //  click_custom(comsumptionDate);
        sendPeakMeterReads(peakText);
        Thread.sleep(1000);
     //  sendOffPeakMeterReads(offPeakText);
       Thread.sleep(1000);
   //   sendShoulderMeterReads(shoulderText);
        clickOnSaveBtn();
        Thread.sleep(2000);
    }
}


