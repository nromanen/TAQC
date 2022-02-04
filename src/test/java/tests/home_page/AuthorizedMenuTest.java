package tests.home_page;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import pages.*;
import tests.AuthorizedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuthorizedMenuTest extends AuthorizedTest {

    protected MenuPage menuPage;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected MyParcelsPage myparselPage;
    protected SettingsPage settingsPage;


    // Fix Page extnds
    public AuthorizedMenuTest() {
        super();
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
        myparselPage = new MyParcelsPage(driver);
        settingsPage = new SettingsPage(driver);
    }


    /**
     * Check whether the User Menu is displayed after user authorization
     */
    @Test
    public void verifyUserMenuDsp() {

        homePage.clkMenuBtn();

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(menuPage.isUserMainDsp())
                .withFailMessage("UserMain isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isUserParselDsp())
                .withFailMessage("UserParsel isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isUserSetingsDsp())
                .withFailMessage("UserSetings isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isUserLogOutDsp())
                .withFailMessage("UserLogOut isn't displayed").isTrue();

        softAssertions.assertAll();
    }

    /**
     * Check the transition to the MyParcels page after click
     */
    @Test
    public void userParselBtn() {

        homePage.clkMenuBtn()
                .clkUserParselBtn();

        assertTrue(myparselPage.isTrckNbrFldDisplayed(), "There is no SignUp item in the Menu");

        homePage.clkMenuBtn().clkUserLogOutBtn();
    }

    /**
     * Check the transition to the Settings page after click
     */
    @Test
    public void userSettingsBtn() {

        homePage.clkMenuBtn()
                .clkUserSettingsBtn();

        assertTrue(settingsPage.findheadingProfile(), "Problem settins");

        homePage.clkMenuBtn().clkUserLogOutBtn();

    }

    /**
     * Check log out correctly after clicking on the LogOut button
     */
    @Test
    public void userLogOutBtn() {

        homePage.clkMenuBtn()
                .clkUserLogOutBtn()
                .clkMenuBtn();

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(menuPage.isHdnMenuDsp())
                .withFailMessage("Menu isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isLogInDsp())
                .withFailMessage("LogIn isn't displayed").isTrue();
        softAssertions.assertThat(menuPage.isSignUpDsp())
                .withFailMessage("SingUp isn't displayed").isTrue();

        softAssertions.assertAll();

    }

}
