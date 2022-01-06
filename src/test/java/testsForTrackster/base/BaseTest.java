package testsForTrackster.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.home.HomePage;

import static common.constants.Constant.Urls.HOME_PAGE_URL;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    @BeforeEach
    public void beforeEach() {
        basePage.open(HOME_PAGE_URL);
    }
}
