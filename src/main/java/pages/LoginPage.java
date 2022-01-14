package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By userEmail = By.cssSelector("input#email");
    private final By userPassword = By.cssSelector("input#password");
    private final By loginBtn = By.xpath("//button[@type=\"submit\"]");

    public LoginPage insertLoginFld(String email,String password) {

        WebElement userEmailWait = waitElementIsVisible(userEmail);
        WebElement userPasswordWait = waitElementIsVisible(userPassword);
        userEmailWait.sendKeys(email);
        userPasswordWait.sendKeys(password);
        return this;
    }

    public HomePage clkSubmitLogin() {

        WebElement loginBtnClk = waitElementIsVisible(loginBtn);
        loginBtnClk.click();
        return new HomePage(driver);
    }




}
