package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;

public class HomePage extends MainPage {

    @FindBy(id = "signin2")
    private WebElement signUpButton;

    @FindBy(id = "login2")
    private WebElement loginButton;

    @FindBy(id = "logout2")
    private WebElement logoutButton;

    public HomePage(WebDriver driver) throws FileNotFoundException {
        super(driver);
    }

    public void navigate() {
        driver.get("https://www.demoblaze.com/");
    }

    public void clickSignUp() {
        signUpButton.click();
    }

    public void clickLogin() {
        loginButton.click();
    }

//    public void clickLogout() {
//        logoutButton.click();
//    }

}
