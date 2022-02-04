package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By divLogin = By.cssSelector("div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-6.MuiGrid-grid-lg-4");

    private final By userEmail = By.cssSelector("input#email");
    private final By userPassword = By.cssSelector("input#password");
    private final By loginBtn = By.xpath("//button[@type=\"submit\"]");


    private final By logInYourAccountTxt = By.xpath("//h4[@class='MuiTypography-root jss27 MuiTypography-h4 MuiTypography-gutterBottom']");
    private final By emailFld = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-marginDense MuiOutlinedInput-marginDense']");
    //private final By emailFld = By.cssSelector ("input[class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']");
    private final By passwordFld = By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'][1]");
    //private final By passwordFld = By.cssSelector("");
    //private final By loginBnt = By.xpath("//span[@class='MuiButton-label']");
    private final By loginBnt = By.cssSelector("span[class='MuiButton-label']");
    private final By forgotPasswordBnt = By.xpath("//a[@href='/reset-password']");
    //private final By forgotPasswordBnt = By.cssSelector("a[href='/reset-password']");
    private final By loginWithGoogleBnt = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']");
    //private final By loginWithGoogleBnt = By.cssSelector("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']");
    private final By loginWithFacebookBnt = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge'][1]");
    //private final By loginWithFacebookBnt = By.cssSelector("img[class='jss65']");
    //private final By loginPageLogoImg  = By.xpath("//img[@src='/static/media/login-img.8fa56c8b.svg']");
    private final By loginPageLogoImg = By.cssSelector("img[alt='login-svg']");
    private final By dontHaveAnAccountTxt = By.cssSelector("h4[class='MuiTypography-root jss27 MuiTypography-h4 MuiTypography-gutterBottom']");

    public LoginPage insertLoginFld(String email, String password) {

        WebElement userEmailWait = waitElementIsVisible(userEmail);
        WebElement userPasswordWait = waitElementIsVisible(userPassword);
        userEmailWait.sendKeys(email);
        userPasswordWait.sendKeys(password);
        return this;
    }

    public MyParcelsPage clkSubmitLogin() {

        WebElement loginBtnClk = waitElementIsVisible(loginBtn);
        loginBtnClk.click();
        return new MyParcelsPage(driver);
    }

    public boolean isDivLoginDsp() {
        return driver.findElement(divLogin).isDisplayed();
    }

    /**
     * Methods to find elements on the "Login Page"
     */
    public boolean isLogInYourAccountTxtDsp() {
        return driver.findElement(logInYourAccountTxt).isDisplayed();
    }

    public boolean isEmailFieldBtnDsp() {
        return driver.findElement(emailFld).isDisplayed();
    }

    public boolean isPasswordFieldDsp() {
        return driver.findElement(passwordFld).isDisplayed();
    }

    public boolean isLoginBtnDsp() {
        return driver.findElement(loginBnt).isDisplayed();
    }

    public boolean isForgotPasswordBtnDsp() {
        return driver.findElement(forgotPasswordBnt).isDisplayed();
    }

    public boolean isLoginWithGoogleBtnDsp() {
        return driver.findElement(loginWithGoogleBnt).isDisplayed();
    }

    public boolean isLoginWithFacebookDsp() {
        return driver.findElement(loginWithFacebookBnt).isDisplayed();
    }

    public boolean isLoginPageLogoImageDsp() {
        return driver.findElement(loginPageLogoImg).isDisplayed();
    }

    public boolean isDontHaveAnAccountTxtDsp() {
        return driver.findElement(dontHaveAnAccountTxt).isDisplayed();
    }

}

