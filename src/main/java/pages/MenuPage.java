package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    private final By hdnMenu = By.cssSelector
            ("div.MuiPaper-root.MuiDrawer-paper.jss7.MuiDrawer-paperAnchorLeft.MuiDrawer-paperAnchorDockedLeft.MuiPaper-elevation0");
    private final By loginBtn = By.xpath
            ("//span[contains(.,'Log In')]");
    private final By signupBtn = By.xpath
            ("//span[contains(.,'Sign Up')]");
    private final By mainBtn = By.xpath
            ("//span[contains(.,'Main')]");
    private final By userMain = By.cssSelector
            ("a.MuiButtonBase-root.MuiListItem-root.MuiListItem-gutters.MuiListItem-button:nth-of-type(1)");
    private final By userParsel = By.xpath
            ("//span[contains(.,'My Parcels')]");
    private final By userSettings = By.xpath
            ("//span[contains(.,'Settings')]");
    private final By userLogOut = By.xpath
            ("//span[contains(.,'Log Out')]");



    public LoginPage clkLoginBtn() {
        WebElement loginBtnClk = waitElementIsVisible(loginBtn);
        loginBtnClk.click();
        return new LoginPage(driver);
    }

    public SignupPage clkSignupBtn() {
        WebElement signupBtnClk = waitElementIsVisible(signupBtn);
        signupBtnClk.click();
        return new SignupPage(driver);
    }

    public HomePage clkMainBtn() {
        WebElement mainBtnClk = waitElementIsVisible(mainBtn);
        mainBtnClk.click();
        return new HomePage(driver);
    }

    // ------------------------------------------------------

    public MyParcelsPage clkUserParselBtn() {
        WebElement userParselClk = waitElementIsVisible(userParsel);
        userParselClk.click();
        return new MyParcelsPage(driver);
    }

    public HomePage clkUserSettingsBtn() {
        WebElement userSetingsClk = waitElementIsVisible(userSettings);
        userSetingsClk.click();
        return new HomePage(driver);
    }

    public HomePage clkUserLogOutBtn() {
        WebElement userLogOutClk = waitElementIsVisible(userLogOut);
        userLogOutClk.click();
        return new HomePage(driver);
    }

    // ------------------------------------------------------

    public boolean isLogInDsp() {
        WebElement logInDsp = waitElementIsVisible(loginBtn);
        return logInDsp.isDisplayed();
    }

    public boolean isSignUpDsp() {
        WebElement signUpDsp = waitElementIsVisible(signupBtn);
        return signUpDsp.isDisplayed();
    }

    public boolean isHdnMenuDsp() {
        WebElement hdnMenuDsp = waitElementIsVisible(hdnMenu);
        return hdnMenuDsp.isDisplayed();
    }

    // ------------------------------------------------------

    public boolean isUserMainDsp() {
        WebElement userMainDsp = waitElementIsVisible(userMain);
        return userMainDsp.isDisplayed();
    }
    public boolean isUserParselDsp() {
        WebElement userParselDsp = waitElementIsVisible(userParsel);
        return userParselDsp.isDisplayed();
    }
    public boolean isUserSetingsDsp() {
        WebElement userSetingsDsp = waitElementIsVisible(userSettings);
        return userSetingsDsp.isDisplayed();
    }
    public boolean isUserLogOutDsp() {
        WebElement userLogOutDsp = waitElementIsVisible(userLogOut);
        return userLogOutDsp.isDisplayed();
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

