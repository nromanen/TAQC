package tests.home_page;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.SrchFldPage;
import tests.BaseTest;
import utils.DriverConfiguration;
import model.TestData;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.YAMLDeserializer.fromFileToMap;


public class FindParcelTest extends BaseTest {

    protected SrchFldPage srchFldPage;
    private static TestData testData;

    public FindParcelTest() {
        super();
        srchFldPage = new SrchFldPage(driver);
    }

    @BeforeAll
    static void beforeAll() {

            testData = new TestData();
            Map<String, String> map = fromFileToMap("testData.yaml");
            testData.setCorrectIds(map.get("correctIds"));
            testData.setIncorrectIds(map.get("incorrectIds"));

    }

    @Test
    public void displayingParcelNotFoundPage() {

        String invalidTrackNumb = testData.getIncorrectIds();
        homePage.srchFldParse(invalidTrackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isNFoundFldDsp(), "The search does not work correctly if the deception is incorrect");
    }

    @Test
    public void searchResultIsDisplayed() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isResultSrchDsp(), "Something is wrong with finding a parcel");
    }

    @Test
    public void displayAdditionalInformation() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch()
                .clkBtnDetails();

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(srchFldPage.isHeaderDetails())
                .withFailMessage("No 'header' part displayed").isTrue();
        softAssertions.assertThat(srchFldPage.isBodyDetails())
                .withFailMessage("No 'body' part displayed").isTrue();
        softAssertions.assertThat(srchFldPage.isStatusDetails())
                .withFailMessage("No 'status' part displayed").isTrue();

        softAssertions.assertAll();
    }

    @Test
    public void verifyButtonDetailsDisplaying() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isBtnDetailsDsp(), "The Details button did not display");
    }

    @Test
    public void verifyFieldSearchDisplayed() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse(trackNumb)
                .clkBtnInptSrch();

        assertTrue(srchFldPage.isFldSrchDsp(), "Search Field not displayed");
    }

    @Test
    public void verifyWorkSearch() {

        String trackNumb = testData.getCorrectIds();
        homePage.srchFldParse("")
                .clkBtnInptSrch()
                .parseFldSrch(trackNumb)
                .clkBtnSrch();

        assertTrue(srchFldPage.isResultSrchDsp(), "There must be a mistake");
    }

}