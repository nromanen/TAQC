package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

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

    public MenuPage clkMenuBtn() {
        WebElement menuBtnEl = waitElementIsVisible(menuBtn);
        menuBtnEl.click();
        return this;
    }

    public LoginPage clkLoginBtn() {
        WebElement loginBtnTest = waitElementIsVisible(loginBtn);
        loginBtnTest.click();
        return new LoginPage(driver);
    }

    public MenuPage clkSingupBtn() {
        WebElement singupBtnTest = waitElementIsVisible(singupBtn);
        singupBtnTest.click();
        return this;
    }

    public MenuPage clkMainBtn() {
        WebElement mainBtnTest = waitElementIsVisible(mainBtn);
        mainBtnTest.click();
        return this;
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

}

