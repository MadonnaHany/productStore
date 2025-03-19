package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;

public class SignUpPage extends MainPage {
    @FindBy(id = "sign-username")
    private WebElement usernameField;

    @FindBy(id = "sign-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@onclick='register()']")
    private WebElement registerButton;


    public SignUpPage(WebDriver driver) throws FileNotFoundException {
        super(driver);
    }

    public void signUp(String username, String password) {
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            registerButton.click();
//        return username;
    }

}
