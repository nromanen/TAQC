package tests.home_page;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
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

    public MenuTest() {
        super();
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    @Test
    public void testIsHdnMenuDsp() {

        homePage.clkMenuBtn();
        assertTrue(menuPage.isHdnMenuDsp(), "The menuBtn does not work properly");
    }


    @Test
    public void testIsLogInDsp() {

        homePage.clkMenuBtn();
        assertTrue(menuPage.isLogInDsp(), "There is no LogIn item in the Menu");
    }

    @Test
    public void testIsSingUpDsp() {

        homePage.clkMenuBtn();
        assertTrue(menuPage.isSingUpDsp(), "There is no SignUp item in the Menu");
    }

    @Test
    public void testMainBtn() {

        basePage.open(UNK_SEARCH_PAGE_URL); // FIX LATER

        homePage.clkMenuBtn()
                .clkMainBtn();

        String actual = driver.getCurrentUrl();
        String expected = "https://ttrackster.herokuapp.com/";
        assertEquals(actual, expected, "Returning to the home page does not work correctly");
    }

    @Test
    public void testLogInBtn() {

        homePage.clkMenuBtn()
                .clkLoginBtn();
        String actual = driver.getCurrentUrl();
        String expected = "https://ttrackster.herokuapp.com/login";
        assertEquals(expected, actual, "Going to the login page is incorrect");
    }

    @Test
    public void testSingUpBtn() {

        homePage.clkMenuBtn()
                .clkSingupBtn();
        String actual = driver.getCurrentUrl();
        String expected = "https://ttrackster.herokuapp.com/signup";
        assertEquals(actual, expected, "Going to the signup page is incorrect");
    }

    // --------------------------------------------------------------------------------

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

    @Test
    public void testUserParselBtn() throws InterruptedException {

        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn()
                .clkUserParselBtn();

        String expected = driver.getCurrentUrl();
        String actual = "https://ttrackster.herokuapp.com/parcels";
        assertEquals(actual, expected, "Going to the signup page is incorrect");

        homePage.clkMenuBtn().clkUserLogOutBtn();

    }

    @Test
    public void testUserSettingsBtn() throws InterruptedException {

        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn()
                .clkUserSettingsBtn();

        String expected = driver.getCurrentUrl();
        String actual = "https://ttrackster.herokuapp.com/settings";
        assertEquals(actual, expected, "Going to the signup page is incorrect");

        homePage.clkMenuBtn().clkUserLogOutBtn();

    }

    @Test
    public void testUserLogOutBtn() throws InterruptedException {

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
        softAssertions.assertThat(menuPage.isSingUpDsp())
                .withFailMessage("SingUp isn't displayed").isTrue();

        softAssertions.assertAll();

    }

}
