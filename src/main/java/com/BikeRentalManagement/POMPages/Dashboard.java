package com.BikeRentalManagement.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    private WebDriver driver;

    // Element locators using @FindAll for auto-healing
    
    @FindAll({@FindBy(xpath = "//a[contains(text(),' Dashboard')]"),@FindBy(xpath = "//a[@href=\"dashboard.php\"]/i/..")})
	private WebElement dashboardLink;
    
    @FindBy(xpath = "//h2[@class=\"page-title\"]")
    WebElement dashboardText;
    
    @FindAll({
        @FindBy(xpath = "//DIV[contains(.,'9')]/descendant::DIV[.='Reg Users']")
    })
    private WebElement regUsersText;

    @FindAll({
        @FindBy(xpath = "//A[@href='reg-users.php' and normalize-space(@class)='block-anchor panel-footer']"),
        @FindBy(xpath = "//*[@href='reg-users.php' and normalize-space(@class)='block-anchor panel-footer']")
    })
    private WebElement regUsersFullDetailLink;

    @FindAll({
        @FindBy(xpath = "//DIV[contains(.,'9')]/descendant::DIV[.='Listed Vehicles']")
    })
    private WebElement listedVehiclesText;

    @FindAll({
        @FindBy(xpath = "//A[@href='manage-vehicles.php' and normalize-space(@class)='block-anchor panel-footer text-center']"),
        @FindBy(xpath = "//*[@href='manage-vehicles.php' and normalize-space(@class)='block-anchor panel-footer text-center']")
    })
    private WebElement listedVehiclesFullDetailLink;

    @FindAll({
        @FindBy(xpath = "(//DIV[contains(.,'23')]/descendant::DIV[1])[12]")
    })
    private WebElement totalBookingsCountText;

    @FindAll({
        @FindBy(xpath = "//div[text()='Bookings Info']")
    })
    private WebElement totalBookingsText;

    @FindAll({
        @FindBy(xpath = "//A[@href='manage-bookings.php' and normalize-space(@class)='block-anchor panel-footer text-center']"),
        @FindBy(xpath = "//*[@href='manage-bookings.php' and normalize-space(@class)='block-anchor panel-footer text-center']")
    })
    private WebElement totalBookingsFullDetailLink;

    @FindAll({
        @FindBy(xpath = "(//DIV[contains(.,'9')]/descendant::DIV[1])[20]")
    })
    private WebElement listedBrandsCountText;

    @FindAll({
        @FindBy(xpath = "//div[text()='Listed  Brands']")
    })
    private WebElement listedBrandsText;

    @FindAll({
        @FindBy(xpath = "//A[@href='manage-brands.php' and normalize-space(@class)='block-anchor panel-footer text-center']"),
        @FindBy(xpath = "//*[@href='manage-brands.php' and normalize-space(@class)='block-anchor panel-footer text-center']")
    })
    private WebElement listedBrandsFullDetailLink;

    @FindAll({
        @FindBy(xpath = "(//DIV[contains(.,'0')]/descendant::DIV[1])[12]")
    })
    private WebElement subscribersCountText;

    @FindAll({
        @FindBy(xpath = "//DIV[contains(.,'0')]/descendant::DIV[.='Subscibers']")
    })
    private WebElement subscribersText;

    @FindAll({
        @FindBy(xpath = "//A[@href='manage-subscribers.php' and normalize-space(@class)='block-anchor panel-footer']"),
        @FindBy(xpath = "//*[@href='manage-subscribers.php' and normalize-space(@class)='block-anchor panel-footer']")
    })
    private WebElement subscribersFullDetailLink;

    @FindAll({
        @FindBy(xpath = "(//DIV[contains(.,'6')]/descendant::DIV[1])[12]")
    })
    private WebElement queriesCountText;

    @FindAll({
        @FindBy(xpath = "//DIV[contains(.,'6')]/descendant::DIV[.='Queries']")
    })
    private WebElement queriesText;

    @FindAll({
        @FindBy(xpath = "//A[@href='manage-conactusquery.php' and normalize-space(@class)='block-anchor panel-footer text-center']"),
        @FindBy(xpath = "//*[@href='manage-conactusquery.php' and normalize-space(@class)='block-anchor panel-footer text-center']")
    })
    private WebElement queriesFullDetailLink;

    @FindAll({
        @FindBy(xpath = "(//DIV[contains(.,'8')]/descendant::DIV[1])[12]")
    })
    private WebElement testimonialsCountText;

    @FindAll({
        @FindBy(xpath = "//DIV[contains(.,'8')]/descendant::DIV[.='Testimonials']")
    })
    private WebElement testimonialsText;

    @FindAll({
        @FindBy(xpath = "//A[@href='testimonials.php' and normalize-space(@class)='block-anchor panel-footer text-center']"),
        @FindBy(xpath = "//*[@href='testimonials.php' and normalize-space(@class)='block-anchor panel-footer text-center']")
    })
    private WebElement testimonialsFullDetailLink;

    public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDashboardText() {
		return dashboardText;
	}

	public WebElement getRegUsersFullDetailLink() {
		return regUsersFullDetailLink;
	}

	public WebElement getListedVehiclesFullDetailLink() {
		return listedVehiclesFullDetailLink;
	}

	public WebElement getTotalBookingsFullDetailLink() {
		return totalBookingsFullDetailLink;
	}

	public WebElement getListedBrandsFullDetailLink() {
		return listedBrandsFullDetailLink;
	}

	public WebElement getSubscribersFullDetailLink() {
		return subscribersFullDetailLink;
	}

	public WebElement getQueriesFullDetailLink() {
		return queriesFullDetailLink;
	}

	public WebElement getTestimonialsFullDetailLink() {
		return testimonialsFullDetailLink;
	}

	public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page
    
    public void getDashboardLink() {
    	dashboardLink.click();
    }
    public String getRegUsersText() {
        return regUsersText.getText();
    }

    public void clickRegUsersFullDetailLink() {
        regUsersFullDetailLink.click();
    }

    public String getListedVehiclesText() {
        return listedVehiclesText.getText();
    }

    public void clickListedVehiclesFullDetailLink() {
        listedVehiclesFullDetailLink.click();
    }

    public String getTotalBookingsCountText() {
        return totalBookingsCountText.getText();
    }

    public String getTotalBookingsText() {
        return totalBookingsText.getText();
    }

    public void clickTotalBookingsFullDetailLink() {
        totalBookingsFullDetailLink.click();
    }

    public String getListedBrandsCountText() {
        return listedBrandsCountText.getText();
    }

    public String getListedBrandsText() {
        return listedBrandsText.getText();
    }

    public void clickListedBrandsFullDetailLink() {
        listedBrandsFullDetailLink.click();
    }

    public String getSubscribersCountText() {
        return subscribersCountText.getText();
    }

    public String getSubscribersText() {
        return subscribersText.getText();
    }

    public void clickSubscribersFullDetailLink() {
        subscribersFullDetailLink.click();
    }

    public String getQueriesCountText() {
        return queriesCountText.getText();
    }

    public String getQueriesText() {
        return queriesText.getText();
    }

    public void clickQueriesFullDetailLink() {
        queriesFullDetailLink.click();
    }

    public String getTestimonialsCountText() {
        return testimonialsCountText.getText();
    }

    public String getTestimonialsText() {
        return testimonialsText.getText();
    }

    public void clickTestimonialsFullDetailLink() {
        testimonialsFullDetailLink.click();
    }
}