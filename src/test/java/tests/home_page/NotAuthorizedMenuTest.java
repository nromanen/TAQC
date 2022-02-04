package tests.home_page;

import org.junit.jupiter.api.Test;
import pages.*;
import tests.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotAuthorizedMenuTest extends BaseTest {


    protected MenuPage menuPage;
    protected HomePage homePage;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected MyParcelsPage myparselPage;
    protected SettingsPage settingsPage;

    public NotAuthorizedMenuTest() {
        super();
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
        myparselPage = new MyParcelsPage(driver);
        settingsPage = new SettingsPage(driver);
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

        homePage.clkMenuBtn().clkLoginBtn();

        menuPage.clkMainBtn();

        assertTrue(homePage.isInptFieldDsp(), "Main button don't work correctly");
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

    // TODO: 20.01.2022
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
}
