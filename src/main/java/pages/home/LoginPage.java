package pages.home;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String email, String password){
        //click Log In
        return new HomePage(driver);
    }
}
