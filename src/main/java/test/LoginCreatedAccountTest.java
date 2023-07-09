/*  package test;

import org.automation.base.BaseTest;
import org.automation.pageObjects.LoginCreatedAccount;
import org.automation.pageObjects.LoginPage;
import org.automation.utilities.PropertiesUtil;
import org.testng.annotations.Test;

public class LoginCreatedAccountTest extends BaseTest {

    @Test(enabled = true)
    public void loginAccount() throws InterruptedException {
        LoginCreatedAccount userPage = new LoginCreatedAccount();
        LoginPage login = new LoginPage();

        userPage.clickAdmin();
        Thread.sleep(2000);
        userPage.clickUsers();
       // userPage.enterSearch("158test");
        userPage.clickUserIcon();
        userPage.clickLogout();
        login.enterUsername(PropertiesUtil.getPropertyValue("userName"));
        login.enterPassword(PropertiesUtil.getPropertyValue("password"));
        userPage.clickLoginBtn();
        userPage.clickAdmin();
        userPage.clickUsers();
        userPage.enterSearch("158test");
        userPage.clickInquiryCheckbox();
        userPage.clickUserIcon();
        userPage.clickLogout();

    }

}       */
