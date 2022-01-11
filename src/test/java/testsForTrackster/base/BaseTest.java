package testsForTrackster.base;

import common.DriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class BaseTest {
    protected WebDriver driver = DriverConfiguration.createDriver();
    protected BasePage basePage = new BasePage(driver);

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
