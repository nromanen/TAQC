package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SrchFldPage extends BasePage {
    public SrchFldPage(WebDriver driver) {
        super(driver);
    }

    private final By fldSrch = By.cssSelector
            ("input.MuiInputBase-input");
    private final By btnSrch = By.cssSelector
            ("button[type='submit'].MuiButtonBase-root.MuiIconButton-root");
    private final By nFoundFld = By.cssSelector
            ("div.not-found");
    private final By resultSrch = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded");
    private final By btnDetails = By.cssSelector
            ("button p.MuiTypography-root.MuiTypography-body1");
    private final By headerDetails = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded div:nth-child(4) div:nth-child(1)");
    private final By bodyDetails = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded div:nth-child(4) div:nth-child(4)");
    private final By statusDetails = By.cssSelector
            ("div.MuiPaper-root.MuiPaper-elevation1.MuiPaper-rounded div:nth-child(4) div:nth-child(5)");

    public SrchFldPage parseFldSrch(String req) {
        WebElement parseFldSrch = waitElementIsVisible(fldSrch);
        parseFldSrch.sendKeys(req);
        return this;
    }
    public SrchFldPage clkBtnSrch() {
        WebElement clkBtnSrch = waitElementIsVisible(btnSrch);
        clkBtnSrch.click();
        return this;
    }
    public SrchFldPage clkBtnDetails() {
        WebElement clkBtnDetails = waitElementIsVisible(btnDetails);
        clkBtnDetails.click();
        return this;
    }


    public boolean isFldSrchDsp() {
        WebElement fldSrchDsp = waitElementIsVisible(fldSrch);
        return fldSrchDsp.isDisplayed();
    }
    public boolean isBtnDetailsDsp() {
        WebElement btnDetailsDsp = waitElementIsVisible(btnDetails);
        return btnDetailsDsp.isDisplayed();
    }
    public boolean isResultSrchDsp() {
        WebElement resultSrchDsp = waitElementIsVisible(resultSrch);
        return resultSrchDsp.isDisplayed();
    }
    public boolean isNFoundFldDsp() {
        WebElement nFoundFldDsp = waitElementIsVisible(nFoundFld);
        return nFoundFldDsp.isDisplayed();
    }
    public boolean isMoreDetailsDsp() {
        WebElement headerDetailsDsp = waitElementIsVisible(headerDetails);
        WebElement bodyDetailsDsp = waitElementIsVisible(bodyDetails);
        WebElement statusDetailsDsp = waitElementIsVisible(statusDetails);
        return (headerDetailsDsp.isDisplayed()&&bodyDetailsDsp.isDisplayed()&&statusDetailsDsp.isDisplayed());
    }



}
