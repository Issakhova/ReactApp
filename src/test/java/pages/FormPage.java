package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage{
    @FindBy(name = "address1")
    public WebElement address1;
    @FindBy(name = "address2")
    public WebElement address2;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "state")
    public WebElement state;
    @FindBy(name = "zipCode")
    public WebElement zipcode;
    @FindBy(name = "phone")
    public WebElement mobilePhoneNumber;
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(name = "dobMonth")
    public WebElement month;
    @FindBy(name = "dobDay")
    public WebElement day;
    @FindBy(name = "dobYear")
    public WebElement year;
    @FindBy(tagName = "button")
    public WebElement submitButton;


    public void selectState(String stateName){

        Select select = new Select(state);
        select.selectByVisibleText(stateName);

    }

}
