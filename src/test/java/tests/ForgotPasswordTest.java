package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.DriverConfiguration.USER_NAME;
import static utils.DriverConfiguration.USER_PASSWORD;

public class ForgotPasswordTest extends BaseTest {

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordTest() {
        super();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    /**
     * Test verify that all elements on Forgot Password page is displayed
     */
    @Test
    public void findElements() {

        SoftAssertions softAssertions = new SoftAssertions();
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .clkForgotPasswordBnt();

        softAssertions.assertThat(forgotPasswordPage.isForgotPasswordLogoImgDsp())
                .withFailMessage("Forgot Password Logo Img isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isTroubleLoggingInTxtDsp())
                .withFailMessage("Trouble Logging In Txt isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isEnterYourEmailTxtDsp())
                .withFailMessage("Enter Your Email Txt isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isUserEmailFldDsp())
                .withFailMessage("User Email Fld isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isSendLinkBtnDsp())
                .withFailMessage("Send Link Btn isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isSignUpBtnDsp())
                .withFailMessage("Sign Up Btn isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isBackToLogInBtnDsp())
                .withFailMessage("Back To Log In Btn isn't displayed").isTrue();
        softAssertions.assertThat(forgotPasswordPage.isDontHaveAnAccountTxtDsp())
                .withFailMessage("Don't Have An Account Txt isn't displayed").isTrue();

    }

    @Test
    public void submitFrgotPassword() {
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .clkForgotPasswordBnt()
                .clkUserEmailFld()
                .insertLoginFld(USER_NAME)
                .clkSubmitLogin();

        assertTrue(forgotPasswordPage.isBackToLogInBtnDsp(), "The Search button isn't displayed when the user is logged in");
        homePage.clkMenuBtn().clkUserLogOutBtn();

    }

}