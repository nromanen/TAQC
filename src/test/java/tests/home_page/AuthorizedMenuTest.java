package tests.home_page;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import pages.*;
import tests.AuthorizedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizedMenuTest extends AuthorizedTest {

    protected MenuPage menuPage;
    protected LoginPage loginPage;
    protected SettingsPage settingsPage;

    public AuthorizedMenuTest () {
        super();
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
        settingsPage = new SettingsPage(driver);
    }

    @Test
    public void verifyMainButton() {

        headerPage.clkMenuBtn()
                .clkUserSettingsBtn();
        menuPage.clkMainBtn();

        assertTrue(homePage.isInptFieldDsp(), "Main button don't work correctly");
    }

    @Test
    public void verifyAllElementsInUserMenuDisplayed() {

        headerPage.clkMenuBtn();

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(menuPage.isUserMainDsp())
                .withFailMessage("UserMain isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isUserParselDsp())
                .withFailMessage("UserParsel isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isUserSetingsDsp())
                .withFailMessage("UserSetings isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isUserLogOutDsp())
                .withFailMessage("UserLogOut isn't displayed").isTrue();

        menuPage.clkBurgerBtn();

        softAssertions.assertAll();
    }

    @Test
    public void verifyUserParselBtn() {

        headerPage.clkMenuBtn()
                .clkUserParselBtn();

        assertTrue(myParcelsPage.isTrckNbrFldDisplayed(), "There is no SignUp item in the Menu");
    }

    @Test
    public void verifyUserSettingsBtn() {

        headerPage.clkMenuBtn()
                .clkUserSettingsBtn();

        assertTrue(settingsPage.findHeadingProfile(), "Problem settins");
    }

}
