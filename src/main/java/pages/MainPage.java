package pages;

import constants.GeneralConstants;
import utils.PropertiesFilesHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertiesFilesHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;


public class MainPage {

    // Initialize web drivers
    public WebDriver driver;
    public JavascriptExecutor jsDriver;
    public WebDriverWait wait;
  //  PropertiesFilesHandler propHandler = new PropertiesFilesHandler();
    //Properties generalConfigsProps = propHandler.loadPropertiesFile(GeneralConstants.GENERAL_CONFIG_FILE_NAME);



    public MainPage(WebDriver driver) throws FileNotFoundException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpened() {
        return driver.getTitle().equals("Home");
    }
}
