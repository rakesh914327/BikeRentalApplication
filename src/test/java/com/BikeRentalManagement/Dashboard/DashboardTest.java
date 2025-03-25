package com.BikeRentalManagement.Dashboard;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BikeRentalManagement.POMPages.Dashboard;
import com.BikeRentalManagement.genric.fileutility.BaseClass;

public class DashboardTest extends BaseClass {

    Dashboard dash;
    SoftAssert soft = new SoftAssert();

    @Test
    public void verifyNavigationToDashboard() {
        
        dash = new Dashboard(driver);
        
        dash.getDashboardLink();
        System.out.println("Navigated to Dashboard successfully.");
        String expectedText = "Dashboard";
        String dashText = dash.getDashboardText().getText();
        System.out.println(dashText);
        
        soft.assertEquals(expectedText, dashText);
        
        soft.assertAll();
        //hello
        
        
    }
}
