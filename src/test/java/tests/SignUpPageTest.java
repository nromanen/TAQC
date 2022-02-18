package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.*;
import utils.DriverConfiguration;
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
    public void VerifyThatUserInputsValidEmail() {
        headerPage.clkMenuBtn()
                .clkSignupBtn();
        String newEmail = YAMLDeserializer.fromFileToMap("user_data").get("email");
        String password = YAMLDeserializer.fromFileToMap("user_data").get("password");
        String confirmPassword = YAMLDeserializer.fromFileToMap("user_data").get("confirm_password");
        signupPage.inputNewEmail(newEmail, password, confirmPassword);
        assertTrue(signupPage.findMassageInvalidEmail(), "Email is invalid");
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
