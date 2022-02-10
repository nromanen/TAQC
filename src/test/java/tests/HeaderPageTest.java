package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class HeaderPageTest extends AuthorizedTest {

    public HeaderPageTest() {
        super();
    }

    @Test
    public void verifyThatAllElementsAreDisplayed() {
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(headerPage.isTbrDsp())
                .withFailMessage("Tbr isn't displayed").isTrue();
        softAssertions.assertThat(headerPage.isImgLogoDsp())
                .withFailMessage("ImgLogo isn't displayed").isTrue();
        softAssertions.assertThat(headerPage.isLnkLogoDsp())
                .withFailMessage("LnkLogo isn't diplayed").isTrue();
        softAssertions.assertThat(headerPage.isBtnListBoxDsp())
                .withFailMessage("BtnListBox isn't displayed").isTrue();
        softAssertions.assertThat(headerPage.isBtnMenuDsp())
                .withFailMessage("BtnMenu isn't displayed").isTrue();
    }
}
