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
            ("p.MuiTypography-root.MuiTypography-body1");
    private final By headerDetails = By.cssSelector
            ("div.jss31");
    private final By bodyDetails = By.cssSelector
            ("div.jss37");
    private final By statusDetails = By.cssSelector
            ("div.jss35");

    public SrchFldPage parseFldSrch(String req) {
        WebElement parseFldSrchTest = waitElementIsVisible(fldSrch);
        parseFldSrchTest.sendKeys(req);
        return this;
    }
    public SrchFldPage clkBtnSrch() {
        WebElement clkBtnSrchTest = waitElementIsVisible(btnSrch);
        clkBtnSrchTest.click();
        return this;
    }
    public SrchFldPage clkBtnDetails() {
        WebElement clkBtnDetailsTest = waitElementIsVisible(btnDetails);
        clkBtnDetailsTest.click();
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
