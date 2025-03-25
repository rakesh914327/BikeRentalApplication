package com.bikerentalapp.genric.Webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	// Implicitly Wait
	public void waitForPageToLoad(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	
	// Wait until Visibilty of an  Element
	public void waitForElementVisibilty(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	// Switch to window based on url
	public void switchNewBrowserTab(WebDriver driver, String partialURL) {
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(partialURL)) {
				break;
			}
			
		}
		
	}
	public void switchToFrame(WebDriver driver , int index) {
		driver.switchTo().frame(index);
		
	}
	
	public void switchToFrame(WebDriver driver , String nameID) {
		driver.switchTo().frame(nameID);
		
	}
	
	public void switchToFrame(WebDriver driver , WebElement element) {
		driver.switchTo().frame(element);
		
	}
	

}
