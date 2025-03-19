package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;

    public LoginTest() throws FileNotFoundException {
    }

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        homePage.navigate();
        homePage.clickLogin();
        loginPage.login("username", "password");
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
