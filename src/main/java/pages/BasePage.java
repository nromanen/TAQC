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

    public BasePage open(String url) {
        driver.get(url);
        return this;
    }

<<<<<<< Updated upstream
=======
    public WebElement waitElementIVisiable(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

>>>>>>> Stashed changes
    public WebElement waitElementIsVisible(By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
