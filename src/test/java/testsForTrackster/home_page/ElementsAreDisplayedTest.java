package testsForTrackster.home_page;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.home.HomePage;
import testsForTrackster.base.BaseTest;

import static common.constants.Constant.Urls.HOME_PAGE_URL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElementsAreDisplayedTest extends BaseTest {
    protected HomePage homePage;

    @BeforeEach
    public void beforeEach() {
        homePage = new HomePage(driver);
        homePage.open(HOME_PAGE_URL);
    }

    @Test
    public void checkThatToolBarIsDisplayed() {
        assertTrue(homePage.findToolBar(),
                "The tool bar isn't displayed");
    }
    @Test
    public void checkThatButtonOfMenuIsDisplayed() {
        assertTrue(homePage.findButtonOfMenu(),
                "The button of menu isn't displayed");
    }
    @Test
    public void checkThatImgLogoIsDisplayed() {
        assertTrue(homePage.findImgLogo(),
                "The Img logo isn't displayed");
    }
    @Test
    public void checkThatButtonFollowToLandingPageIsDisplayed() {
        assertTrue(homePage.findButtonFollowToLandingPage(),
                "The button Trackster isn't displayed");
    }
    @Test
    public void checkThatButtonForSelectMenuOfLanguageIsDisplayed() {
        assertTrue(homePage.findButtonForSelectMenuOfLanguage(),
                "The button for select menu of language isn't displayed");
    }
    @Test
    public void checkThatHeadingFindYourParcelIsDisplayed() {
        assertTrue(homePage.findHeadingFindYourParcel(),
                "The heading Find Your Parce isn't displayed");
    }
    @Test
    public void checkThatInputFoldIsDisplayed() {
        assertTrue(homePage.findInputFold(),
                "The input fold for search isn't displayed");
    }
    @Test
    public void checkThatButtonForInputSearchIsDiplayed() {
        assertTrue(homePage.findButtonForInputSearch(),
                "The button for input search isn't displayed");
    }
    @Test
    public void checkThatbuttonForSearchByPhotoIsDisplayed() {
        assertTrue(homePage.findButtonForSearchByPhoto(),
                "The button for search by photo isn't displayed");
    }
    @Test
    public void checkThatImgLabelFastTrackingIsDisplayed() {
        assertTrue(homePage.findImgLabelFastTracking(),
                "The img of label Fast Tracking isn't displayed");
    }
    @Test
    public void checkThatLabelFastTrackingIsDisplayed() {
        assertTrue(homePage.findLabelFastTracking(),
                "The label Fast Tracking isn't displayed");
    }
    @Test
    public void checkThatLabelIntuitiveInterfaceIsDisplayed() {
        assertTrue(homePage.findLabelIntuitiveInterface(),
                "The label Intuitive Interface isn't displayed");
    }
    @Test
    public void checkThatImgLabelIntuitiveInterfaceIsDisplayed() {
        assertTrue(homePage.findImgLabelIntuitiveInterface(),
                "The img of label Intuitive Interface isn't displayed");
    }
    @Test
    public void checkThatLabelArchiveParcelsIsDisplayed() {
        assertTrue(homePage.findLabelArchiveParcels(),
                "The label Archive Parcels isn't displayed");
    }
    @Test
    public void checkThatImgLabelArchiveParcelsIsDisplayed() {
        assertTrue(homePage.findImgLabelArchiveParcels(),
                "The img of label Archive Parcels isn't displayed");
    }
    @Test
    public void checkThatHeadingOurPartnersIsDisplayed() {
        assertTrue(homePage.findHeadingOurPartners(),
                "The heading Our Partners isn't displayed");
    }
    @Test
    public void checkThatImgNovaPoshtaIsDisplayed() {
        assertTrue(homePage.findImgNovaPoshta(),
                "The img Nova Poshta isn't displayed");
    }
    @Test
    public void checkThatImgJustinIsDisplayed() {
        assertTrue(homePage.findImgJustin(),
                "The img Justin isn't displayed");
    }
    @Test
    public void checkThatImgDhlIsDisplayed() {
        assertTrue(homePage.findImgDhl(),
                "The img DHL isn't displayed");
    }
}
