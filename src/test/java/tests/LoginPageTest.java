package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverConfiguration.USER_NAME;
import static utils.DriverConfiguration.USER_PASSWORD;

public class LoginPageTest extends BaseTest {
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected HomePage homePage;
    protected BasePage basePage;
    protected SettingsPage settingsPage;
    protected MyParcelsPage myParcelsPage;

    public LoginPageTest() {
        super();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);
        settingsPage = new SettingsPage(driver);
        myParcelsPage = new MyParcelsPage(driver);

    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    /**
     * Test verify that all elements on LoginPage are displayed
     */
    @Test
    public void findElements() {

        SoftAssertions softAssertions = new SoftAssertions();
        homePage.clkMenuBtn()
                .clkLoginBtn();

        softAssertions.assertThat(loginPage.isLogInYourAccountTxtDsp())
                .withFailMessage("Log in your account text isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isEmailFieldBtnDsp())
                .withFailMessage("Email Field isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isPasswordFieldDsp())
                .withFailMessage("Password Field isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isLoginBtnDsp())
                .withFailMessage("Login Button isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isForgotPasswordBtnDsp())
                .withFailMessage("Forgot Password Button isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isLoginWithGoogleBtnDsp())
                .withFailMessage("Login with google Button isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isLoginWithFacebookDsp())
                .withFailMessage("Login with google facebook isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isLoginPageLogoImageDsp())
                .withFailMessage("login page image logo isn't displayed").isTrue();
        softAssertions.assertThat(loginPage.isDontHaveAnAccountTxtDsp())
                .withFailMessage("Don't have an account text isn't displayed").isTrue();

    }

    /**
     * Test to verify that all buttons is clickable
     */
    @Test
    public void isEmailFieldIsDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn();
        assertTrue(loginPage.isEmailFieldBtnDsp(), "Email Field isn't displayed");
    }

    @Test
    public void isPasswordFieldDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn();
        assertTrue(loginPage.isPasswordFieldDsp(), "Password Field isn't displayed");
    }

    @Test
    public void isFindLoginBtnDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn();
        assertTrue(loginPage.isLoginBtnDsp(), "Login Button isn't displayed");
    }

    @Test
    public void isdForgotPasswordBtnDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn();
        assertTrue(loginPage.isForgotPasswordBtnDsp(), "Forgot Password Button isn't displayed");
    }

    @Test
    public void isLoginWithGoogleBtnDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn();
        assertTrue(loginPage.isLoginWithGoogleBtnDsp(), "Login with google Button isn't displayed");
    }

    @Test
    public void isLoginWithFacebookBtnDsp() {
        homePage.clkMenuBtn()
                .clkLoginBtn();
        assertTrue(loginPage.isLoginWithFacebookDsp(), "Login with google facebook isn't displayed");
    }

    /**
     * User login and find the "Track number" field
     */
    @Test
    public void loginTestClkTrckNbrFld() {
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld(USER_NAME, USER_PASSWORD)
                .clkSubmitLogin();
        assertTrue(myParcelsPage.isTrckNbrFldDisplayed(), "The Track Number fluid isn't displayed when the user is logged in");
        homePage.clkMenuBtn().clkUserLogOutBtn();
    }

    /**
     * TThe user goes to the forgot password page, click on Email Fld
     */
    //    @Test
//    public void clkForgotPasswordBnt(){
//        homePage.clkMenuBtn()
//                .clkLoginBtn().
//                clkForgotPasswordBnt();
//        assertTrue(, "T");
//    }
}