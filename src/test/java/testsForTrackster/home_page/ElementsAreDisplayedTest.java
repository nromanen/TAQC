package testsForTrackster.home_page;

import org.junit.jupiter.api.Test;
import testsForTrackster.base.BaseTest;

public class ElementsAreDisplayedTest extends BaseTest {
    @Test
    public void checkThatToolBarIsDisplayed() {
        homePage.findToolBar();
    }

    @Test
    public void checkThatButtonOfMenuIsDisplayed() {
        homePage.findButtonOfMenu();
    }

    @Test
    public void checkThatImgLogoIsDisplayed() {
        homePage.findImgLogo();
    }

    @Test
    public void checkThatButtonFollowToLandingPageIsDisplayed() {
        homePage.findButtonFollowToLandingPage();
    }

    @Test
    public void checkThatButtonForSelectMenuOfLanguageIsDisplayed() {
        homePage.findButtonForSelectMenuOfLanguage();
    }

    @Test
    public void checkThatHeadingFindYourParcelIsDisplayed() {
        homePage.findHeadingFindYourParcel();
    }

    @Test
    public void checkThatInputFoldIsDisplayed() {
        homePage.findInputFold();
    }

    @Test
    public void checkThatButtonForInputSearchIsDiplayed() {
        homePage.findButtonForInputSearch();
    }

    @Test
    public void checkThatbuttonForSearchByPhotoIsDisplayed() {
        homePage.findButtonForSearchByPhoto();
    }

    @Test
    public void checkThatImgLabelFastTrackingIsDisplayed() {
        homePage.findImgLabelFastTracking();
    }

    @Test
    public void checkThatLabelFastTrackingIsDisplayed() {
        homePage.findLabelFastTracking();
    }

    @Test
    public void checkThatLabelIntuitiveInterfaceIsDisplayed() {
        homePage.findLabelIntuitiveInterface();
    }

    @Test
    public void checkThatImgLabelIntuitiveInterfaceIsDisplayed() {
        homePage.findImgLabelIntuitiveInterface();
    }

    @Test
    public void checkThatLabelArchiveParcelsIsDisplayed() {
        homePage.findLabelArchiveParcels();
    }

    @Test
    public void checkThatImgLabelArchiveParcelsIsDisplayed() {
        homePage.findImgLabelArchiveParcels();
    }

    @Test
    public void checkThatHeadingOurPartnersIsDisplayed() {
        homePage.findHeadingOurPartners();
    }

    @Test
    public void checkThatImgNovaPoshtaIsDisplayed() {
        homePage.findImgNovaPoshta();
    }

    @Test
    public void checkThatImgJustinIsDisplayed() {
        homePage.findImgJustin();
    }

    @Test
    public void checkThatImgDhlIsDisplayed() {
        homePage.findImgDhl();
    }
}
