package tests;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.YAMLDeserializer;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignUpPageTest extends BaseTest {
    protected SignupPage signupPage;
    protected HeaderPage headerPage;

    public SignUpPageTest() {
        super();
        signupPage = new SignupPage(driver);
        headerPage = new HeaderPage(driver);
    }

    @Test
    public void verifyThatUserCantUseEmailWhichIsAlreadyBusy(){
        headerPage.clkMenuBtn()
                .clkSignupBtn();
        String newEmail = YAMLDeserializer.fromFileToMap("user_data").get("email");
        String password = YAMLDeserializer.fromFileToMap("user_data").get("password");
        String confirmPassword = YAMLDeserializer.fromFileToMap("user_data").get("confirm_password");
        signupPage.inputNewEmail(newEmail, password, confirmPassword);
        assertTrue(signupPage.findMassageEmailIsBusy(), "Email is already busy");
    }

    @Test
    public void verifyThatUserInputsValidEmail() {
        headerPage.clkMenuBtn()
                .clkSignupBtn();
        String newEmail = YAMLDeserializer.fromFileToMap("user_data").get("invalid_email");
        String password = YAMLDeserializer.fromFileToMap("user_data").get("password");
        String confirmPassword = YAMLDeserializer.fromFileToMap("user_data").get("confirm_password");
        signupPage.inputNewEmail(newEmail, password, confirmPassword);
        assertTrue(signupPage.findMassageInvalidEmail(), "Email is invalid");
    }
    @Test
    public void verifyThatUserIsAbleToCreateNewAccount(){
        headerPage.clkMenuBtn()
                .clkSignupBtn();
        String name = RandomStringUtils.randomAlphabetic( 8 ) + "@gmail.com";
        String password = YAMLDeserializer.fromFileToMap("user_data").get("password");
        String confirmPassword = YAMLDeserializer.fromFileToMap("user_data").get("confirm_password");
        signupPage.inputNewEmail(name, password, confirmPassword);
        assertTrue(signupPage.findRegistrationMassage(), "We've sent an email to your address. Open it up to activate your account");
    }

    @Test
    public void verifyThatAllElementsAreDisplayed() {
        headerPage.clkMenuBtn()
                .clkSignupBtn();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(signupPage.findCreateYourAcc())
                .withFailMessage("CreateYourAcc isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findEmailFld())
                .withFailMessage("FldEmail isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findPasswordFld())
                .withFailMessage("FldPassword isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findConfirmPasswordFld())
                .withFailMessage("FldConfirmPassword isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findSignUpBtn())
                .withFailMessage("BtnSighUp isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findLoginWithGoogle())
                .withFailMessage("LoginWithGoogle isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findLoginWithFacebook())
                .withFailMessage("LoginWithFacebook isn't displayed").isTrue();
        softAssertions.assertThat(signupPage.findLogInUrl())
                .withFailMessage("LogInUrl isn't displayed").isTrue();
    }
}
