package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;
import pages.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By tbr = By.xpath
            ("//header[@class='MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary MuiPaper-elevation0']");
    private final By btnMenu = By.xpath
            ("//button[@class='MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart']");
    private final By imgLogo = By.cssSelector
            ("img[src=\"/static/media/cardboard-box.e6f6462e.svg\"]");
    private final By lnkLogo = By.xpath
            ("//a[@class=\"logo-link active\"]");
    private final By btnListBox = By.xpath
            ("//div[@aria-haspopup=\"listbox\"]");
    private final By headingFindYourParcel = By.xpath
            ("//h5[@class=\"MuiTypography-root jss13 MuiTypography-h5\"]");
    private final By inputFold = By.xpath
            ("//input[@class=\"MuiInputBase-input\"]");
    private final By btnInputSearch = By.xpath
            ("//button[@type=\"submit\"]");
    private final By btnSearchByPhoto = By.xpath
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
    public MenuPage clkMenuBtn() {
        WebElement btnMenuFind = waitElementIsVisible(btnMenu);
        btnMenuFind.click();
        return new MenuPage(driver);
    }

    public SrchFldPage clkBtnInptSrch() {
        WebElement buttonInputSearchFind = driver.findElement(btnInputSearch);
        buttonInputSearchFind.click();
        return new SrchFldPage(driver);
    }

    public HomePage srchFldParse(String val) {
        WebElement inputTest = driver.findElement(inputFold);
        inputTest.sendKeys(val);
        return this;
    }

    /**
     * Find and click to buttonForSelectMenuOfLanguage
     */
    public HomePage clickListBoxBtn() {
        WebElement btnListBoxFind = driver.findElement(btnListBox);
        btnListBoxFind.click();
        return this;
    }

    /**
     * Find and click to inputFold
     */
    public HomePage clickInputFold() {
        WebElement inputFoldFind = driver.findElement(inputFold);
        inputFoldFind.click();
        return this;
    }

    /**
     * Find and click to Trackster link
     */
    public HomePage clickLnkLogo() {
        WebElement lnkLogoFind = driver.findElement(lnkLogo);
        lnkLogoFind.click();
        return this;
    }

    /**
     * Methods find elements on HomePage
     */
    public boolean isTbrDisplayed() {

        return driver.findElement(tbr).isDisplayed();
    }
    public boolean isImgLogoDisplayed() {

        return driver.findElement(imgLogo).isDisplayed();
    }
    public boolean isHeadingFindYourParcelDisplayed() {

        return driver.findElement(headingFindYourParcel).isDisplayed();
    }
    public boolean isBtnInputSearchDisplayed() {

        return driver.findElement(btnInputSearch).isDisplayed();
    }
    public boolean isBtnSearchByPhoto() {

        return driver.findElement(btnSearchByPhoto).isDisplayed();
    }
    public boolean isImgLabelFastTrackingDisplayed() {

        return driver.findElement(imgLabelFastTracking).isDisplayed();
    }
    public boolean isLabelFastTrackingDisplayed() {

        return driver.findElement(labelFastTracking).isDisplayed();
    }
    public boolean isLabelIntuitiveInterfaceDisplayed() {

        return driver.findElement(labelIntuitiveInterface).isDisplayed();
    }
    public boolean isImgLabelIntuitiveInterfaceDisplayed() {

        return driver.findElement(imgLabelIntuitiveInterface).isDisplayed();
    }
    public boolean isLabelArchiveParcelsDisplayed() {

        return driver.findElement(labelArchiveParcels).isDisplayed();
    }
    public boolean isImgLabelArchiveParcelsDisplayed() {

        return driver.findElement(imgLabelArchiveParcels).isDisplayed();
    }
    public boolean isHeadingOurPartnersDisplayed() {

        return driver.findElement(headingOurPartners).isDisplayed();
    }
    public boolean isImgNovaPoshtaDisplayed() {

        return driver.findElement(imgNovaPoshta).isDisplayed();
    }
    public boolean isImgJustinDisplayed() {

        return driver.findElement(imgJustin).isDisplayed();
    }
    public boolean isImgDhlDisplayed() {

        return driver.findElement(imgDhl).isDisplayed();
    }
    public boolean isBtnMenuDisplayed() {

        return driver.findElement(btnMenu).isDisplayed();
    }
    public boolean isLnkLogoDisplayed() {

        return driver.findElement(lnkLogo).isDisplayed();
    }
    public boolean isBtnListBoxDisplayed() {

        return driver.findElement(btnListBox).isDisplayed();
    }
    public boolean isInputFoldDisplayed() {

        return driver.findElement(inputFold).isDisplayed();
    }

}

