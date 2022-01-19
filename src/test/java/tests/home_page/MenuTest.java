package tests.home_page;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import tests.BaseTest;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverConfiguration.*;


public class MenuTest extends BaseTest {

    protected MenuPage menuPage;
    protected HomePage homePage;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected MyParcelsPage myparselPage;
    protected SettingsPage settingsPage;

    public MenuTest() {
        super();
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
        myparselPage = new MyParcelsPage(driver);
        settingsPage = new SettingsPage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    /**
     * Test whether the menu will be displayed after pressing MenuBatton
     */
    @Test
    public void testIsHdnMenuDsp() {

        homePage.clkMenuBtn();
        assertTrue(menuPage.isHdnMenuDsp(), "The menuBtn does not work properly");
    }

    /**
     * Test whether the LoginButton element is displayed
     */
    @Test
    public void testIsLogInDsp() {

        homePage.clkMenuBtn();
        assertTrue(menuPage.isLogInDsp(), "There is no LogIn item in the Menu");
    }

    /**
     * Test whether the SingUpButton element is displayed
     */
    @Test
    public void testIsSingUpDsp() {

        homePage.clkMenuBtn();
        assertTrue(menuPage.isSignUpDsp(), "There is no SignUp item in the Menu");
    }

    /**
     * Test whether the Main button works
     */
    @Test
    public void testMainBtn() {

        basePage.open(UNK_SEARCH_PAGE_URL); // FIX LATER

        homePage.clkMenuBtn()
                .clkMainBtn();
        String actual = driver.getCurrentUrl();
        String expected = "http://ttrackster.herokuapp.com/";
        assertEquals(expected,actual , "Returning to the home page does not work correctly");
    }

    /**
     * Test whether you switch to LoginPage by clicking the LogIn button
     */
    @Test
    public void testLogInBtn() {

        homePage.clkMenuBtn()
                .clkLoginBtn();

        assertTrue(loginPage.isDivLoginDsp(), "There is no SignUp item in the Menu");


    }

    // TODO: 19.01.2022
    /**
     * Test whether you switch to SignupPage by clicking the SingUp button
     */
    @Test
    public void testSignUpBtn() {

        homePage.clkMenuBtn()
                .clkSignupBtn();
        String actual = driver.getCurrentUrl();
        String expected = "https://ttrackster.herokuapp.com/signup";
        assertEquals(actual, expected, "Going to the signup page is incorrect");
    }

    // --------------------------------------------------------------------------------

    /**
     * Check whether the User Menu is displayed after user authorization
     */
    @Test
    public void testIsUserMenuDsp() {

        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn();

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
    public void testUserParselBtn() {

        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn()
                .clkUserParselBtn();

        assertTrue(myparselPage.isTrckNbrFldDisplayed(), "There is no SignUp item in the Menu");

        homePage.clkMenuBtn().clkUserLogOutBtn();
    }

    /**
     * Check the transition to the Settings page after click
     */
    @Test
    public void testUserSettingsBtn() {

        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn()
                .clkUserSettingsBtn();

        assertTrue(settingsPage.findheadingProfile(), "Problem settins");

        homePage.clkMenuBtn().clkUserLogOutBtn();

    }

    /**
     * Check log out correctly after clicking on the LogOut button
     */
    @Test
    public void testUserLogOutBtn() {

        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn()
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
