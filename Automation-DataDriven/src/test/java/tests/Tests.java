package tests;


import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

public class Tests extends TestBase {

    @Test(priority = 1, dataProvider = "OrangeHRMLogin", dataProviderClass = TestData.class)
    public void testGenderlInformation(String user,String pass)  {

        LoginPage.setUserName(user);
        extentTest.log(LogStatus.PASS, "Enter The Username");
        LoginPage.setPassword(pass);
        extentTest.log(LogStatus.PASS, "Enter Password");
        LoginPage.clickLogin();
        extentTest.log(LogStatus.PASS, "Login Button Clicked");

    }
}
