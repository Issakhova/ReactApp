package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends BasePage {
    @FindBy(xpath = "//button[contains(text(),Continue)]")
    public WebElement continueButton;
}
