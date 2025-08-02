package com.BikeRentalManagement.Dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BikeRentalManagement.POMPages.Dashboard;
import com.BikeRentalManagement.genric.fileutility.BaseClass;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class DashboardTest extends BaseClass {

    Dashboard dash;
    SoftAssert soft = new SoftAssert();

    @Test
    public void verifyNavigationToDashboard() {
        
        dash = new Dashboard(driver);
        
        dash.getDashboardLink();
        //hello
    }
    
    @Test
    @Description("verify Navigating to Register Users Page")
    @Feature("Feature: Register User")
    @Story("Story : Reg Usser")
    @Severity(SeverityLevel.MINOR)
    public void verifyPageRedirectsToRegUserClickingUponRegUsersLinkinDashboard() throws InterruptedException {
    	
    	dash = new Dashboard(driver);
    	dash.getDashboardLink();
    	dash.getRegUsersFullDetailLink().click();;
    	String actual =dash.getRegUsersText();
    	Assert.assertEquals(actual, "Reg Users");
    }
    
    @Test
    @Description("verify Navigating to Vehicles Page")
    @Feature("Feature: Vehicles")
    @Story("Story : list vehicles")
    @Severity(SeverityLevel.MINOR)
    public void verifyPageRedirectsToListedVehiclesClickingUponListedVehiclesLinkinDashboard() {
    	
    	dash = new Dashboard(driver);
    	dash.getDashboardLink();
    	dash.getListedVehiclesFullDetailLink().click();;
    	String actual = dash.getListedVehiclesText();
    	Assert.assertEquals(actual, "Vehicle Details");
    	
    }
    
    @Test
    @Description("verify Navigating to Brands Page")
    @Feature("Feature: List Brands")
    @Story("Story : brands")
    @Severity(SeverityLevel.MINOR)
    public void verifyPageRedirectsToBrandsClickingUponBrandsLinkinDashboard() {
    	
    	dash = new Dashboard(driver);
    	dash.getDashboardLink();
    	dash.getListedBrandsFullDetailLink().click();
    	String actual = dash.getListedBrandsText();
    	Assert.assertEquals(actual, "Listed  Brands");
    	
    }
    
    @Test
    @Description("verify Navigating to Bookings Page")
    @Feature("Feature: Total Bookings")
    @Story("Story : bookings")
    @Severity(SeverityLevel.MINOR)
    public void verifyPageRedirectsToTotalBookingsClickingUponTotalBookingsLinkinDashboard() {
    	
    	
    	dash = new Dashboard(driver);
    	dash.getDashboardLink();
    	dash.getTotalBookingsFullDetailLink().click();;
    	String actual = dash.getTotalBookingsText();
    	Assert.assertEquals(actual, "Bookings Info");
    	
    }
    
    @Test
    @Description("verify Navigating to Subcribe Page")
    @Feature("Feature: subscribe")
    @Story("Story : subscribe")
    @Severity(SeverityLevel.MINOR)
    public void verifyPageRedirectsToSubscribesrClickingUponSubscribesLinkinDashboard() {
    	
    	dash = new Dashboard(driver);
    	dash.getDashboardLink();
    	dash.getSubscribersFullDetailLink().click();
    	String actual = dash.getSubscribersText();
    	Assert.assertEquals(actual, "Subscribers Details");
    	
    	
    }
}
