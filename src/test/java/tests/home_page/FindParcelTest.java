package tests.home_page;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.HomePage;
import pages.SrchFldPage;
import tests.BaseTest;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindParcelTest extends BaseTest {

    protected SrchFldPage srchFldPage;
    protected HomePage homePage;
    protected BasePage basePage;

    public FindParcelTest() {
        super();
        srchFldPage = new SrchFldPage(driver);
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        srchFldPage.open(DriverConfiguration.BASE_URL);
    }

    @Test
    public void testNFndDlv() {

        String invalidTrackNumb = "1234567890";
        homePage.srchRqst(invalidTrackNumb)
                .clkBtnInptSrch();

        WebElement notf = basePage.waitElementIsVisible(By.cssSelector("div.not-found p")); // FIX LATER
        String actual = notf.getText();
        String expected = "Nothing found...";

        assertEquals(actual, expected, "The result of an empty search is incorrect");
    }



}