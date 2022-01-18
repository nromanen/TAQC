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
    private final By singupBtn = By.xpath
            ("//span[contains(.,'Sign Up')]");
    private final By mainBtn = By.xpath
            ("//span[contains(.,'Main')]");
    private final By userMain = By.cssSelector
            ("a.MuiButtonBase-root.MuiListItem-root.MuiListItem-gutters.MuiListItem-button:nth-of-type(1)");
    private final By userParsel = By.cssSelector
            ("a.MuiButtonBase-root.MuiListItem-root.MuiListItem-gutters.MuiListItem-button:nth-of-type(2)");
    private final By userSetings = By.cssSelector
            ("a.MuiButtonBase-root.MuiListItem-root.MuiListItem-gutters.MuiListItem-button:nth-of-type(3)");
    private final By userLogOut = By.cssSelector
            ("ul.MuiList-root.MuiList-padding:nth-of-type(2) span.MuiTypography-root.MuiListItemText-primary.MuiTypography-body1.MuiTypography-displayBlock");



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

    // ------------------------------------------------------

    public SrchFldPage clkUserParselBtn() throws InterruptedException {
        Thread.sleep(1000);
        WebElement userParselTest = waitElementIsVisible(userParsel);
        userParselTest.click();
        return new SrchFldPage(driver);
    }

    public HomePage clkUserSetingsBtn() throws InterruptedException {
        Thread.sleep(1000);
        WebElement userSetingsTest = waitElementIsVisible(userSetings);
        userSetingsTest.click();
        return new HomePage(driver);
    }

    public HomePage clkUserLogOutBtn() throws InterruptedException {
        Thread.sleep(1000);
        WebElement userLogOutTest = waitElementIsVisible(userLogOut);
        userLogOutTest.click();
        return new HomePage(driver);
    }

    // ------------------------------------------------------

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
        WebElement userSetingsDsp = waitElementIsVisible(userSetings);
        return userSetingsDsp.isDisplayed();
    }
    public boolean isUserLogOutDsp() {
        WebElement userLogOutDsp = waitElementIsVisible(userLogOut);
        return userLogOutDsp.isDisplayed();
    }

}

