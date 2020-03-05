package utilities;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestBase {


    public String getPageTitle(){
        String title = Driver.getDriver().getTitle();
        return title;
    }




}
