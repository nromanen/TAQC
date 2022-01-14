package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SrchFldPage extends BasePage {
    public SrchFldPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonForInputSearch = By.xpath
            ("//button[@type=\"submit\"]");
    private final By inputFld = By.cssSelector
            ("input.MuiInputBase-input");



}
