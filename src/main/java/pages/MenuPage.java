package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;


public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    private final By hdnMenu = By.cssSelector
            ("div.MuiPaper-root.MuiDrawer-paper.jss7.MuiDrawer-paperAnchorLeft.MuiDrawer-paperAnchorDockedLeft.MuiPaper-elevation0");
    private final By loginBtn = By.xpath
            ("//span[contains(.,'Log In')]");
    private final By singupBtn = By.xpath
            ("//span[contains(.,'Sign Up')]");
    private final By mainBtn = By.xpath
            ("//span[contains(.,'Main')]");
    private final By menuBtn = By.xpath
            ("//button[@class=\"MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart\"]");

    public LoginPage clkLoginBtn() {
        WebElement loginBtnTest = waitElementIsVisible(loginBtn);
        loginBtnTest.click();
        return new LoginPage(driver);
    }

    public SignupPage clkSingupBtn() {
        WebElement singupBtnTest = waitElementIsVisible(singupBtn);
        singupBtnTest.click();
        return new SignupPage(driver);
    }

    public HomePage clkMainBtn() {
        WebElement mainBtnTest = waitElementIsVisible(mainBtn);
        mainBtnTest.click();
        return new HomePage(driver);
    }

    public boolean isLogInDsp() {
        WebElement logInDsp = waitElementIsVisible(loginBtn);
        return logInDsp.isDisplayed();
    }

    public boolean isSingUpDsp() {
        WebElement singUpDsp = waitElementIsVisible(singupBtn);
        return singUpDsp.isDisplayed();
    }

    public boolean isHdnMenuDsp() {
        WebElement hdnMenuDsp = waitElementIsVisible(hdnMenu);
        return hdnMenuDsp.isDisplayed();
    }

    public boolean isUserMenuDsp() {
        WebElement hdnMenuDsp = waitElementIsVisible(hdnMenu);
        return hdnMenuDsp.isDisplayed();
    }

    /**
     * for myParcelsPageTest
     */
    private final By tracksterHdng = By.xpath
            ("//h6[@class=\"MuiTypography-root jss4 MuiTypography-h6\"]");

    public boolean isTracksterHdngDsp() {
        WebElement tracksterHdngDsp = waitElementIsVisible(tracksterHdng);
        return tracksterHdngDsp.isDisplayed();
    }

    private final By logOutBtn = By.xpath
            ("//ul[2]//a");

    public HomePage clkLogOutBtn() {
        WebElement clklogoutBtn = waitElementIsVisible(logOutBtn);
        clklogoutBtn.click();
        return new HomePage(driver);
    }
}

