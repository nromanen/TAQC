package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends BaseTest {
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected HomePage homePage;
    protected BasePage basePage;

    public LoginPageTest() {
        super();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);

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

//    @Test
//    public void siLoginPageLogoImageDsp() {
//        homePage.clkMenuBtn()
//                .clkLoginBtn();
//        assertTrue(loginPage.isLoginPageLogoImageDsp(), "The login page image logo isn't displayed");
//    }

    @Test
    public void Login() {

    }

}