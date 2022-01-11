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
     * Methods find elements on page
     */
    public boolean findToolBar() {
        return driver.findElement(toolBar).isDisplayed();
    }
    public boolean findImgLogo() {
        return driver.findElement(imgLogo).isDisplayed();
    }
    public boolean findHeadingFindYourParcel() {
        return driver.findElement(headingFindYourParcel).isDisplayed();
    }
    public boolean findButtonForInputSearch() {
        return driver.findElement(buttonForInputSearch).isDisplayed();
    }
    public boolean findButtonForSearchByPhoto() {
        return driver.findElement(buttonForSearchByPhoto).isDisplayed();
    }
    public boolean findImgLabelFastTracking() {
        return driver.findElement(imgLabelFastTracking).isDisplayed();
    }
    public boolean findLabelFastTracking() {
        return driver.findElement(labelFastTracking).isDisplayed();
    }
    public boolean findLabelIntuitiveInterface() {
        return driver.findElement(labelIntuitiveInterface).isDisplayed();
    }
    public boolean findImgLabelIntuitiveInterface() {
        return driver.findElement(imgLabelIntuitiveInterface).isDisplayed();
    }
    public boolean findLabelArchiveParcels() {
        return driver.findElement(labelArchiveParcels).isDisplayed();
    }
    public boolean findImgLabelArchiveParcels() {
        return driver.findElement(imgLabelArchiveParcels).isDisplayed();
    }
    public boolean findHeadingOurPartners() {
        return driver.findElement(headingOurPartners).isDisplayed();
    }
    public boolean findImgNovaPoshta() {
        return driver.findElement(imgNovaPoshta).isDisplayed();
    }
    public boolean findImgJustin() {
        return driver.findElement(imgJustin).isDisplayed();
    }
    public boolean findImgDhl() {
        return driver.findElement(imgDhl).isDisplayed();
    }
    public boolean findButtonOfMenu() {
        return driver.findElement(buttonOfMenu).isDisplayed();
    }
    public boolean findButtonFollowToLandingPage() {
        return driver.findElement(buttonFollowToLandingPage).isDisplayed();
    }
    public boolean findButtonForSelectMenuOfLanguage() {
        return driver.findElement(buttonForSelectMenuOfLanguage).isDisplayed();
    }
    public boolean findInputFold() {
        return driver.findElement(inputFold).isDisplayed();
    }
}
