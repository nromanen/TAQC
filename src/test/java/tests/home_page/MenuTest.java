package tests.home_page;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public void testIsUserMenuDsp() {


        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME,USER_PASSWORD)
                .clkSubmitLogin()
                .clkMenuBtn();
        assertTrue(menuPage.isUserMenuDsp(), "The UserMenu does not work properly");
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
        String expected = "http://ttrackster.herokuapp.com/";
        assertEquals(actual, expected, "Returning to the home page does not work correctly");
    }

    @Test
    public void testLogInBtn() {

        homePage.clkMenuBtn()
                .clkLoginBtn();
        String actual = driver.getCurrentUrl();
        String expected = "http://ttrackster.herokuapp.com/login";
        assertEquals(expected, actual, "Going to the login page is incorrect");
    }

    @Test
    public void testSingUpBtn() {

        homePage.clkMenuBtn()
                .clkSingupBtn();
        String actual = driver.getCurrentUrl();
        String expected = "http://ttrackster.herokuapp.com/signup";
        assertEquals(actual, expected, "Going to the signup page is incorrect");
    }

}
