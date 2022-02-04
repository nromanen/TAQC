package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By tbr = By.xpath
            ("//header[@class='MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary MuiPaper-elevation0']");
    private final By btnMenu = By.xpath
            ("//div[@class='MuiToolbar-root MuiToolbar-regular MuiToolbar-gutters']//button");
    private final By imgLogo = By.cssSelector
            ("img[src='/static/media/cardboard-box.e6f6462e.svg']");
    private final By lnkLogo = By.xpath
            ("//a[@class='logo-link active']");
    private final By btnListBox = By.xpath
            ("//div[@aria-haspopup='listbox']");
    private final By uaBtnLanguage = By.xpath
            ("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']");
    private final By hdngUa = By.xpath
            ("//h5[text()='Знайдіть вашу посилку в один клік']");
    private final By engBtnLanguage = By.xpath
            ("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']");
    private final By hdngEng = By.xpath
            ("//h5[text()='Find your parcel just in one moment']");


    /**
     * Find and click on buttonOfMenu
     */
    public MenuPage clkMenuBtn() {
        WebElement btnMenuFind = waitElementIsVisible(btnMenu);
        btnMenuFind.click();
        return new MenuPage(driver);
    }


    /**
     * Find and click on Trackster link
     */
    public BasePage clkLnkLogo() {
        WebElement lnkLogoFind = driver.findElement(lnkLogo);
        lnkLogoFind.click();
        return this;
    }

    /**
     * Methods find elements on page
     */
    public boolean isTbrDsp() {

        return driver.findElement(tbr).isDisplayed();
    }
    public boolean isImgLogoDsp() {

        return driver.findElement(imgLogo).isDisplayed();
    }

    /**
     * Find and click to buttonForSelectMenuOfLanguage
     */
    public BasePage clkListBoxBtn() {
        WebElement btnListBoxFind = driver.findElement(btnListBox);
        btnListBoxFind.click();
        return this;
    }

    /**
     * Click ENG button to change Language on Page
     */
    public BasePage clkEngBtn() {
        WebElement engBtn = waitElementIsVisible(engBtnLanguage);
        engBtn.click();
        return this;
    }

    /**
     * Heading on Ukrainian
     */
    public boolean isUaHdngDisplayed() {
        return driver.findElement(hdngUa).isDisplayed();
    }



    /**
     * Heading on English
     */
    public boolean isEngHdngDisplayed() {
        return driver.findElement(hdngEng).isDisplayed();
    }

    /**
     * Click UA button to change Language on Page
     */
    public BasePage clkUaBtn() {
        WebElement uaBtn = waitElementIsVisible(uaBtnLanguage);
        uaBtn.click();
        return this;
    }

    public boolean isBtnMenuDsp() {

        return driver.findElement(btnMenu).isDisplayed();
    }
    public boolean isLnkLogoDsp() {

        return driver.findElement(lnkLogo).isDisplayed();
    }
    public boolean isBtnListBoxDsp() {

        return driver.findElement(btnListBox).isDisplayed();
    }


    public BasePage open(String url) {
        driver.get(url);
        return this;
    }

    public WebElement waitElementIsVisible(By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
