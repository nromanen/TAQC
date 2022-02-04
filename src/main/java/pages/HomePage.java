package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By hdngFindYourParcel = By.xpath
            ("//h5[contains(@class, 'MuiTypography-h5')]");
    private final By inptField = By.xpath
            ("//input[@class='MuiInputBase-input']");
    private final By btnInptSearch = By.xpath
            ("//button[@type='submit']");
    private final By btnSrchByPhoto = By.xpath
            ("(//button[contains(@class, 'MuiButtonBase-root MuiIconButton-root')])[4]");
    private final By imgLbFastTracking = By.xpath
            ("(//div[@class='jss15']/*[name()='svg'])[1]");
    private final By lbFastTracking = By.xpath
            ("//div[@class='jss15'][1]");
    private final By lbIntuitiveInterface = By.xpath
            ("//div[@class='jss15'][2]");
    private final By imgLbIntuitiveInterface = By.xpath
            ("(//div[@class='jss15']/*[name()='svg'])[2]");
    private final By lbArchiveParcels = By.xpath
            ("//div[@class='jss15'][3]");
    private final By imgLbArchiveParcels = By.xpath
            ("(//div[@class='jss15']/*[name()='svg'])[3]");
    private final By hdngOurPartners = By.xpath
            ("//h4[@class='MuiTypography-root jss13 MuiTypography-h4']");
    private final By imgNovaPoshta = By.cssSelector
            ("img[src='/static/media/nova-poshta.7e612a5d.png']");
    private final By imgJustin = By.cssSelector
            ("img[src='/static/media/justin.112383fd.svg']");
    private final By imgDhl = By.cssSelector
            ("img[src='/static/media/dhl.eda3e6a1.png']");




    /**
     * Find and click on button Input Search
     */
    public SrchFldPage clkBtnInptSrch() {
        WebElement buttonInputSearchFind = driver.findElement(btnInptSearch);
        buttonInputSearchFind.click();
        // driver.findElement(btnInptSearch).click();
        return new SrchFldPage(driver);
    }

    public HomePage srchFldParse(String val) {
        WebElement inputTest = driver.findElement(inptField);
        inputTest.sendKeys(val);
        return this;
    }







    public boolean isHdngFindYourParcelDsp() {

        return driver.findElement(hdngFindYourParcel).isDisplayed();
    }
    public boolean isBtnInptSrchDsp() {

        return driver.findElement(btnInptSearch).isDisplayed();
    }
    public boolean isBtnSrchByPhotoDsp() {

        return driver.findElement(btnSrchByPhoto).isDisplayed();
    }
    public boolean isImgFastTrackingDsp() {

        return driver.findElement(imgLbFastTracking).isDisplayed();
    }
    public boolean isLbFastTrackingDsp() {

        return driver.findElement(lbFastTracking).isDisplayed();
    }
    public boolean isLbIntuitiveInterfaceDsp() {

        return driver.findElement(lbIntuitiveInterface).isDisplayed();
    }
    public boolean isImgIntuitiveInterfaceDsp() {

        return driver.findElement(imgLbIntuitiveInterface).isDisplayed();
    }
    public boolean isLbArchiveParcelsDsp() {

        return driver.findElement(lbArchiveParcels).isDisplayed();
    }
    public boolean isImgArchiveParcelsDsp() {

        return driver.findElement(imgLbArchiveParcels).isDisplayed();
    }
    public boolean isHdngOurPartnersDsp() {

        return driver.findElement(hdngOurPartners).isDisplayed();
    }
    public boolean isImgNovaPoshtaDsp() {

        return driver.findElement(imgNovaPoshta).isDisplayed();
    }
    public boolean isImgJustinDsp() {

        return driver.findElement(imgJustin).isDisplayed();
    }
    public boolean isImgDhlDsp() {

        return driver.findElement(imgDhl).isDisplayed();
    }

    public boolean isInptFieldDsp() {

        return driver.findElement(inptField).isDisplayed();
    }
}

