package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By toolBar = By.xpath
            ("//header[@class=\"MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary MuiPaper-elevation0\"]");
    private final By buttonOfMenu = By.xpath
            ("//button[@class=\"MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart\"]");
    private final By imgLogo = By.cssSelector
            ("img[src=\"/static/media/cardboard-box.e6f6462e.svg\"]");
    private final By buttonFollowToLandingPage = By.xpath
            ("//a[@class=\"logo-link active\"]");
    private final By buttonForSelectMenuOfLanguage = By.xpath
            ("//div[@aria-haspopup=\"listbox\"]");
    private final By headingFindYourParcel = By.xpath
            ("//h5[@class=\"MuiTypography-root jss13 MuiTypography-h5\"]");
    private final By inputFold = By.xpath
            ("//input[@class=\"MuiInputBase-input\"]");
    private final By buttonForInputSearch = By.xpath
            ("//button[@type=\"submit\"]");
    private final By buttonForSearchByPhoto = By.xpath
            ("(//button[@class=\"MuiButtonBase-root MuiIconButton-root jss23\"])[2]");
    private final By imgLabelFastTracking = By.xpath
            ("(//div[@class=\"jss15\"]/*[name()='svg'])[1]");
    private final By labelFastTracking = By.xpath
            ("//div[@class=\"jss15\"][1]");
    private final By labelIntuitiveInterface = By.xpath
            ("//div[@class=\"jss15\"][2]");
    private final By imgLabelIntuitiveInterface = By.xpath
            ("(//div[@class=\"jss15\"]/*[name()='svg'])[2]");
    private final By labelArchiveParcels = By.xpath
            ("//div[@class=\"jss15\"][3]");
    private final By imgLabelArchiveParcels = By.xpath
            ("(//div[@class=\"jss15\"]/*[name()='svg'])[3]");
    private final By headingOurPartners = By.xpath
            ("//h4[@class=\"MuiTypography-root jss13 MuiTypography-h4\"]");
    private final By imgNovaPoshta = By.cssSelector
            ("img[src=\"/static/media/nova-poshta.7e612a5d.png\"]");
    private final By imgJustin = By.cssSelector
            ("img[src=\"/static/media/justin.112383fd.svg\"]");
    private final By imgDhl = By.cssSelector
            ("img[src=\"/static/media/dhl.eda3e6a1.png\"]");

    /**
     * Find and click to buttonOfMenu
     */
    public HomePage clickToButtonOfMenu() {
        WebElement buttonOfMenuFind = driver.findElement(buttonOfMenu);
        buttonOfMenuFind.click();
        return this;
    }

    /**
     * Find and click to buttonForSelectMenuOfLanguage
     */
    public HomePage clickToButtonForSelectMenuOfLanguage() {
        WebElement buttonForSelectMenuOfLanguageFind = driver.findElement(buttonForSelectMenuOfLanguage);
        buttonForSelectMenuOfLanguageFind.click();
        return this;
    }

    /**
     * Find and click to inputFold
     */
    public HomePage clickToInputFold() {
        WebElement inputFoldFind = driver.findElement(inputFold);
        inputFoldFind.click();
        return this;
    }

    /**
     * Find and click to Trackster button
     */
    public HomePage clickToButtonFollowToLandingPage() {
        WebElement buttonFollowToLandingPageFind = driver.findElement(buttonFollowToLandingPage);
        buttonFollowToLandingPageFind.click();
        return this;
    }

    /**
     * Find elements on page
     */
    public HomePage findToolBar() {
        driver.findElement(toolBar).isDisplayed();
        return this;
    }
    public HomePage findImgLogo() {
        driver.findElement(imgLogo).isDisplayed();
        return this;
    }
    public HomePage findHeadingFindYourParcel() {
        driver.findElement(headingFindYourParcel).isDisplayed();
        return this;
    }
    public HomePage findButtonForInputSearch() {
        driver.findElement(buttonForInputSearch).isDisplayed();
        return this;
    }
    public HomePage findButtonForSearchByPhoto() {
        driver.findElement(buttonForSearchByPhoto).isDisplayed();
        return this;
    }
    public HomePage findImgLabelFastTracking() {
        driver.findElement(imgLabelFastTracking).isDisplayed();
        return this;
    }
    public HomePage findLabelFastTracking() {
        driver.findElement(labelFastTracking).isDisplayed();
        return this;
    }
    public HomePage findLabelIntuitiveInterface() {
        driver.findElement(labelIntuitiveInterface).isDisplayed();
        return this;
    }
    public HomePage findImgLabelIntuitiveInterface() {
        driver.findElement(imgLabelIntuitiveInterface).isDisplayed();
        return this;
    }
    public HomePage findLabelArchiveParcels() {
        driver.findElement(labelArchiveParcels).isDisplayed();
        return this;
    }
    public HomePage findImgLabelArchiveParcels() {
        driver.findElement(imgLabelArchiveParcels).isDisplayed();
        return this;
    }
    public HomePage findHeadingOurPartners() {
        driver.findElement(headingOurPartners).isDisplayed();
        return this;
    }
    public HomePage findImgNovaPoshta() {
        driver.findElement(imgNovaPoshta).isDisplayed();
        return this;
    }
    public HomePage findImgJustin() {
        driver.findElement(imgJustin).isDisplayed();
        return this;
    }
    public HomePage findImgDhl() {
        driver.findElement(imgDhl).isDisplayed();
        return this;
    }
    public HomePage findButtonOfMenu() {
        driver.findElement(buttonOfMenu).isDisplayed();
        return this;
    }
    public HomePage findButtonFollowToLandingPage() {
        driver.findElement(buttonFollowToLandingPage).isDisplayed();
        return this;
    }
    public HomePage findButtonForSelectMenuOfLanguage() {
        driver.findElement(buttonForSelectMenuOfLanguage).isDisplayed();
        return this;
    }
    public HomePage findInputFold() {
        driver.findElement(inputFold).isDisplayed();
        return this;
    }
}
