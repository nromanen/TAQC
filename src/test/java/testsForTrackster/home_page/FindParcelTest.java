package testsForTrackster.home_page;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import pages.home.SrchFldPage;
import testsForTrackster.base.BaseTest;

import static common.constants.Constant.Urls.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindParcelTest extends BaseTest {

    protected SrchFldPage srchFldPage;
    protected BasePage basePage;

    @BeforeEach
    public void beforeEach() {
        srchFldPage = new SrchFldPage(driver);
        basePage = new BasePage(driver);
        srchFldPage.open(HOME_PAGE_URL);
    }

    @Test
    public void testNFndDlv() {

        String invalidTrackNumb = "1234567890";
        srchFldPage.srchRqst(invalidTrackNumb);
        srchFldPage.clkBtnInptSrch();
        WebElement notf = basePage.waitElementIsVisible(By.cssSelector("div.not-found p"));
        String actual = notf.getText();
        String expected = "Nothing found...";
        assertEquals(actual, expected, "The result of an empty search is incorrect");
    }



}