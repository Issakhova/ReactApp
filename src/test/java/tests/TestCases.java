package tests;

import org.junit.Test;
import pages.FormPage;
import pages.SummaryPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestCases {
    @Test
    public void userInfoForm(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        FormPage formPage = new FormPage();
        SummaryPage summaryPage = new SummaryPage();

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
        summaryPage.continueButton.click();
        Driver.getDriver().close();



    }
}
