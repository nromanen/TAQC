package tests.home_page;

import org.junit.jupiter.api.Test;
import pages.*;
import tests.BaseTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotAuthorizedMenuTest extends BaseTest {

    protected MenuPage menuPage;
    protected LoginPage loginPage;
    protected SignupPage signupPage;

    public NotAuthorizedMenuTest() {
        super();
        menuPage = new MenuPage(driver);
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
    }

    @Test
    public void testIsHdnMenuDsp() {

        headerPage.clkMenuBtn();

        assertTrue(menuPage.isHdnMenuDsp(), "The menuBtn does not work properly");
    }

    @Test
    public void testIsLogInDsp() {

        headerPage.clkMenuBtn();

        assertTrue(menuPage.isLogInDsp(), "There is no LogIn item in the Menu");
    }

    @Test
    public void testIsSingUpDsp() {

        headerPage.clkMenuBtn();

        assertTrue(menuPage.isSignUpDsp(), "There is no SignUp item in the Menu");
    }

    @Test
    public void testMainBtn() {

        headerPage.clkMenuBtn().clkLoginBtn();
        headerPage.clkMenuBtn().clkMainBtn();

        assertTrue(homePage.isInptFieldDsp(), "Main button don't work correctly");
    }

    @Test
    public void testLogInBtn() {

        headerPage.clkMenuBtn()
                .clkLoginBtn();

        assertTrue(loginPage.isDivLoginDsp(), "There is no SignUp item in the Menu");
    }

    @Test
    public void testSignUpBtn() {

        headerPage.clkMenuBtn()
                .clkSignupBtn();

        assertTrue(signupPage.isSignUpImgDsp(), "Going to the signup page is incorrect");
    }
}
