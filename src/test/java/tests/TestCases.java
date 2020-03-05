package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FormPage;
import pages.SummaryPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestCases {
    @BeforeTest
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Test
    public void userInfoForm() {
        FormPage formPage = new FormPage();
        SummaryPage summaryPage = new SummaryPage();

        Assert.assertTrue(formPage.logo_isDisplayed());
        System.out.println(formPage.getPageTitle());
        formPage.address1.sendKeys("4646 Mueller Blvd");
        formPage.address2.sendKeys("Apt.0000");
        formPage.city.sendKeys("Austin");
        formPage.selectState("TX");
        formPage.zipcode.sendKeys("78723");
        formPage.mobilePhoneNumber.sendKeys("5125128051");
        formPage.email.sendKeys("Self@gmail.com");
        formPage.month.sendKeys("04");
        formPage.day.sendKeys("15");
        formPage.year.sendKeys("1991");
        formPage.submitButton.click();
        Assert.assertEquals(formPage.getPageTitle(), "React App");
        summaryPage.continueButton.click();
        Driver.getDriver().close();


    }

}
