package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

public class LogInTest extends BaseTest{
    protected LoginPage loginPage;
    public LogInTest() {
        super();
        loginPage = new LoginPage(driver);
    }


}
