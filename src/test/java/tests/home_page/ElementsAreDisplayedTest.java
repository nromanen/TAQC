package tests.home_page;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import tests.BaseTest;
import utils.DriverConfiguration;

public class ElementsAreDisplayedTest extends BaseTest {
    protected HomePage homePage;

    public ElementsAreDisplayedTest() {
        super();
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    /**
     * Test verify that all elements on HomePage are displayed
     */
    @Test
    public void findElements() {
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(homePage.isTbrDisplayed())
                .withFailMessage("Tbr isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnMenuDisplayed())
                .withFailMessage("BtnMenu isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgLogoDisplayed())
                .withFailMessage("ImgLogo isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLnkLogoDisplayed())
                        .withFailMessage("LnkLogo isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnListBoxDisplayed())
                        .withFailMessage("BtnListBox isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isHeadingFindYourParcelDisplayed())
                        .withFailMessage("HeadingFindYourParcel isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isInputFoldDisplayed())
                        .withFailMessage("InputFold isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnInputSearchDisplayed())
                        .withFailMessage("BtnInputSearch isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isBtnSearchByPhoto())
                        .withFailMessage("BtnSearchByPhoto isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgLabelFastTrackingDisplayed())
                        .withFailMessage("ImgLabelFastTracking isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLabelFastTrackingDisplayed())
                        .withFailMessage("LabelFastTracking isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLabelIntuitiveInterfaceDisplayed())
                        .withFailMessage("LabelIntuitiveInterface isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgLabelIntuitiveInterfaceDisplayed())
                        .withFailMessage("ImgLabelIntuitiveInterface isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isLabelArchiveParcelsDisplayed())
                        .withFailMessage("LabelArchiveParcels isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgLabelArchiveParcelsDisplayed())
                        .withFailMessage("ImgLabelArchiveParcels isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isHeadingOurPartnersDisplayed())
                        .withFailMessage("HedingOurParnters isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgNovaPoshtaDisplayed())
                        .withFailMessage("ImgNovaPoshta isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgJustinDisplayed())
                        .withFailMessage("ImgJustin isn't displayed").isTrue();
        softAssertions.assertThat(homePage.isImgDhlDisplayed())
                        .withFailMessage("ImgDHL isn't displayed").isTrue();

        softAssertions.assertAll();
    }
}
