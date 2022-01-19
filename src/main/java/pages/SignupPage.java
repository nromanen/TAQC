package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage extends BasePage{
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    private final By createYourAcc = By.cssSelector
            ("h4.MuiTypography-root.MuiTypography-h4.MuiTypography-gutterBottom");
    private final By emailFld = By.cssSelector
            ("div.MuiInputBase-root.MuiOutlinedInput-root.MuiInputBase-fullWidth.MuiInputBase-formControl.MuiInputBase-marginDense.MuiOutlinedInput-marginDense");
    private final By passwordFld = By.cssSelector
            ("div.MuiInputBase-root.MuiOutlinedInput-root.MuiInputBase-formControl.MuiInputBase-marginDense.MuiOutlinedInput-marginDense input#email");
    private final By confirmPasswordFld = By.cssSelector
            ("div.MuiInputBase-root.MuiOutlinedInput-root.MuiInputBase-formControl.MuiInputBase-marginDense.MuiOutlinedInput-marginDense input#password-confirmation");
    private final By sighUpBtn = By.cssSelector
            ("button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-containedSizeLarge.MuiButton-sizeLarge.MuiButton-disableElevation");
    private final By loginWithGoogle = By.cssSelector
            ("a.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedSecondary.MuiButton-containedSizeLarge.MuiButton-sizeLarge.MuiButton-disableElevation.MuiButton-fullWidth  span.MuiButton-label span.MuiButton-startIcon.MuiButton-iconSizeLarge:nth-child(1)");
    private final By loginWithFacebook = By.xpath
            ("//span[contains(text(), 'Login with Facebook')]");
    private final By logInUrl = By.xpath
            ("//span//a[@href='/login']");

    public boolean findCreateYourAcc() {return driver.findElement(createYourAcc).isDisplayed();}
    public boolean findEmailFld() {return driver.findElement(emailFld).isDisplayed();}
    public boolean findPasswordFld() {return driver.findElement(passwordFld).isDisplayed();}
    public boolean findConfirmPasswordFld() {return driver.findElement(confirmPasswordFld).isDisplayed();}
    public boolean findSignUpBtn() {return driver.findElement(sighUpBtn).isDisplayed();}
    public boolean findLoginWithGoogle() {return driver.findElement(loginWithGoogle).isDisplayed();}
    public boolean findLoginWithFacebook() {return driver.findElement(loginWithFacebook).isDisplayed();}
    public boolean findLogInUrl() {return driver.findElement(logInUrl).isDisplayed();}

}
