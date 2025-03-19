package tests;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileNotFoundException;


public class LogoutTest {

    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void testLogout() {
        homePage.navigate();
//        homePage.clickLogout();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
