package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

public class SummaryPage extends TestBase {
    @FindBy(xpath = "//button[contains(text(),Continue)]")
    public WebElement continueButton;
    public SummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
