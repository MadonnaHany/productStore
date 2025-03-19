package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileNotFoundException;

public class OrderPage extends MainPage {

    @FindBy(xpath = "//a[contains(text(),'Laptops')]")
    private WebElement laptopsButton;

    @FindBy(xpath = "//a[contains(text(),'Sony vaio i5')]")
    private WebElement sonyVaioI5Button;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@onclick='deleteItem(1)']")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@data-target='#orderModal']")
    private WebElement placeOrderButton;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "country")
    private WebElement countryField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "card")
    private WebElement cardField;

    @FindBy(id = "month")
    private WebElement monthField;

    @FindBy(id = "year")
    private WebElement yearField;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    private WebElement purchaseButton;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    private WebElement okButton;

    @FindBy(id = "cartur")
    private WebElement cartLink;

    @FindBy(linkText = "Apple monitor 24")
    private WebElement appleMonitorLink;

    @FindBy(linkText = "Monitors")
    private WebElement monitorsLink;

    public OrderPage(WebDriver driver) throws FileNotFoundException {
        super(driver);
    }


    public void createOrder() {
        monitorsLink.click();
        appleMonitorLink.click();
        addToCartButton.click();
        cartLink.click();
        placeOrderButton.click();
        nameField.sendKeys("Test User");
        countryField.sendKeys("Test Country");
        cityField.sendKeys("Test City");
        cardField.sendKeys("1234567890123456");
        monthField.sendKeys("12");
        yearField.sendKeys("2025");
        purchaseButton.click();
    }

//    public void clickLaptops() {
//        laptopsButton.click();
//    }
//
//    public void clickSonyVaioI5() {
//        sonyVaioI5Button.click();
//    }
//
//    public void clickAddToCart() {
//        addToCartButton.click();
//    }
//
//    public void clickCart() {
//        cartButton.click();
//    }
//
//    public void clickDelete() {
//        deleteButton.click();
//    }
//
//    public void clickPlaceOrder() {
//        placeOrderButton.click();
//    }
//
//    public void fillForm(String name, String country, String city, String card, String month, String year) {
//        nameField.sendKeys(name);
//        countryField.sendKeys(country);
//        cityField.sendKeys(city);
//        cardField.sendKeys(card);
//        monthField.sendKeys(month);
//        yearField.sendKeys(year);
//    }
//
//    public void clickPurchase() {
//        purchaseButton.click();
//    }
//
//    public void clickOk() {
//        okButton.click();
//    }
}
