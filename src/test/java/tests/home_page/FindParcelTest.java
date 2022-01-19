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
import static org.junit.jupiter.api.Assertions.assertTrue;


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

    /**
     * Test window not found parcel
     */
    @Test
    public void testNFndDlv() {

        String invalidTrackNumb = "1234567890";
        homePage.srchFldParse(invalidTrackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isNFoundFldDsp(), "There must be a mistake");
    }

    /**
     * Test whether the search for a valid track number works
     */
    @Test
    public void testResultSrchDsp() {

        String trackNumb = "20450498476837";
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isResultSrchDsp(), "Something is wrong with finding a parcel");
    }

    /**
     * Check that all fields of advanced Details are displayed
     */
    @Test
    public void testBtnDetailsDsp() {

        String trackNumb = "20450498476837";
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch()
                .clkBtnDetails();

        assertTrue(srchFldPage.isMoreDetailsDsp(), "There must be a mistake");
    }

    /**
     * Check the presence of the Details button
     */
    @Test
    public void testIsBtnDetailsDsp() {

        String trackNumb = "20450498476837";
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isBtnDetailsDsp(), "There must be a mistake");
    }

    /**
     * Check the presence of the search field
     */
    @Test
    public void testIsFldSrchDsp() {

        String trackNumb = "20450498476837";
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isFldSrchDsp(), "There must be a mistake");
    }

    /**
     * Test whether the search works correctly on SrchFldPage
     */
    @Test
    public void testSrchWork() {

        String trackNumb = "59000777883118";

        homePage.srchFldParse("")
                .clkBtnInptSrch()
                .parseFldSrch(trackNumb)
                .clkBtnSrch();

        assertTrue(srchFldPage.isResultSrchDsp(), "There must be a mistake");
    }






}