package com.BikeRentalManagement.genric.fileutility;

import java.io.IOException;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.BikeRentalManagement.POMPages.AdminLogin;
import com.bikerentalapp.genric.Webdriverutility.WebDriverUtility;

public class BaseClass {
    
    protected RemoteWebDriver driver;
    FileUtility flib = new FileUtility();
    AdminLogin login;
    SoftAssert soft = new SoftAssert();
    WebDriverUtility wbu = new WebDriverUtility();

    @BeforeClass
    public void browserConfigurations() throws IOException {
        String browser = flib.getDataFromPropertyFile("browser");
        
//        DesiredCapabilities option = new DesiredCapabilities();
//        option.setBrowserName(browser);
//        URL remoteurl = new URL("http://192.168.1.240:4444");
//        
//        driver = new RemoteWebDriver(remoteurl, option);

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser specified: " + browser);
        }
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

    @BeforeMethod
    public void login() throws IOException {
        String url = flib.getDataFromPropertyFile("url");
    	wbu.waitForPageToLoad(driver);
        driver.get(url);
        driver.manage().window().maximize();
        login = new AdminLogin(driver); // Initialize after driver creation
        String username = flib.getDataFromPropertyFile("username");
        String password = flib.getDataFromPropertyFile("password");
        String actualTitle = "Bike Rental Portal | Admin Panel";
        
        login.getUsernameTextField().sendKeys(username);
        login.getPasswordTextField().sendKeys(password);
        login.getLoginButton().click();
        
        String expectedTitle = driver.getTitle();
        
        soft.assertEquals(actualTitle, expectedTitle);
        
    }
    
    @AfterMethod
    public void logout() {
    	
    }
}
