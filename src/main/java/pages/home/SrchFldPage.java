package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class SrchFldPage extends BasePage {
    public SrchFldPage(WebDriver driver) {
        super(driver);
    }


    private final By buttonForInputSearch = By.xpath
            ("//button[@type=\"submit\"]");
    private final By inputFold = By.xpath
            ("//input[@class=\"MuiInputBase-input\"]");

    public SrchFldPage clkInptFld() {
        WebElement inputFoldFind = driver.findElement(inputFold);
        inputFoldFind.click();
        return this;
    }

    public SrchFldPage clkBtnInptSrch() {
        WebElement buttonInputSearchFind = driver.findElement(buttonForInputSearch);
        buttonInputSearchFind.click();
        return this;
    }

    public SrchFldPage srchRqst(String val) {
        WebElement inputTest = driver.findElement(inputFold);
        inputTest.sendKeys(val);
        return this;
    }

    public boolean fndInptFld() {
        return driver.findElement(inputFold).isDisplayed();
    }
}
