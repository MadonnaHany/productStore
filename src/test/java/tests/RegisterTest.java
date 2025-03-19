package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
//import utils.Log;

import java.io.FileNotFoundException;

public class RegisterTest extends BaseTest{

    private WebDriver driver;
    private HomePage homePage;
    private SignUpPage signUpPage;

    public RegisterTest() throws FileNotFoundException {
    }

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
    }

    @Test
    public void testRegister() {
//        test = extent.createTest("testRegister");
//        Log.test = test;
//        Log.startTestCase("testRegister");
//        AllureLifecycle lifecycle = Allure.getLifecycle();
//        lifecycle.updateTestCase(testResult -> testResult.setName("testRegister"));
        homePage.navigate();
        signUpPage.signUp("username", "password");
//        Assert.assertTrue(homePage.isPageOpened());


//        SignUpPage signUpPage = new SignUpPage(driver);
//        String actual= signUpPage.signUp("username", "password");
//        Assert.assertEquals(actual , "You have successfully registered.");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
