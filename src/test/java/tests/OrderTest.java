package tests;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

import java.io.FileNotFoundException;

public class OrderTest extends BaseTest {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private OrderPage orderPage;

    public OrderTest() throws FileNotFoundException {
    }

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        orderPage = new OrderPage(driver);
    }

    @Test
    public void testCreateOrder() {
        homePage.navigate();
        homePage.clickLogin();
        loginPage.login("username","password");
        orderPage.createOrder();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
