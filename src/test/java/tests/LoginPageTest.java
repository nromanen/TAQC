package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.DriverConfiguration;
import utils.YAMLDeserializer;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginPageTest extends BaseTest {
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected HomePage homePage;
    protected BasePage basePage;
    protected SettingsPage settingsPage;
    protected MyParcelsPage myParcelsPage;

    public static String USER_NAME;
    public static String USER_PASSWORD;
    public static String INVALID_USER_NAME;
    public static String INVALID_USER_PASSWORD;

    public LoginPageTest() {
        super();
//        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        basePage = new BasePage(driver);
        menuPage = new MenuPage(driver);
        settingsPage = new SettingsPage(driver);
        myParcelsPage = new MyParcelsPage(driver);

    }

    @BeforeAll
    public static void beforeAll() {
        USER_NAME = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("user_name");
        USER_PASSWORD = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("user_password");
        INVALID_USER_NAME = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("invalid_user_name");
        INVALID_USER_PASSWORD = YAMLDeserializer.fromFileToMap("login_test_data.yaml").get("invalid_user_password");
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
        loginPage = homePage.clkMenuBtn()
                .clkLoginBtn();
    }

    /**
     * Test verify that all elements on LoginPage are displayed
     */
    @Test
    public void verifyThatAllElementsAreDisplayed() {

        SoftAssertions softAssertions = new SoftAssertions();
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
     * Login with invalid email
     */
    @Test
    public void loginTestWhenTheEmailInvalid() {
        loginPage.invalidLogin(INVALID_USER_NAME, USER_PASSWORD);
        assertTrue(loginPage.isErrorTextEmailIsntValidDispl(), "Error Text Email Isn't Valid isn't displayed when the user is logged in");
    }

    /**
     * Login with invalid password
     */
    @Test
    public void loginTestWhenThePasswordInvalid() {
        loginPage.invalidLogin(USER_NAME, INVALID_USER_PASSWORD);
        assertTrue(loginPage.isErrorMessageIncorrectEmailOrPasswordDispl(), "Incorrect email or password Isn't Vali isn't displayed when the user is logged in");
    }
    
    
//    @ParameterizedTest
//    @MethodSource("invalidCredentials")
//    public void loginTestInvalidCredentials(String name, String password, String errorMessage) {
//        homePage.clkMenuBtn()
//                .clkLoginBtn()
//                .insertLoginFld(name, password)
//                .clkSubmitLogin();
//        assertTrue(loginPage.isErrorMessageIncorrectEmailOrPasswordDispl(), errorMessage);
//    }
//
//    private static Stream<Arguments> invalidCredentials() {
//        return Stream.of(
//                Arguments.of(INVALID_USER_NAME, USER_PASSWORD, "Error Text Email Isn't Valid isn't displayed when the user is logged in"),
//                Arguments.of(USER_NAME, INVALID_USER_PASSWORD, "Incorrect email or password Isn't Vali isn't displayed when the user is logged in")
//        );
//    }


//    /**
////     * TThe user goes to the forgot password page, click on Email Fld
////     */
    //    @Test
//    public void clkForgotPasswordBnt(){
//        homePage.clkMenuBtn()
//                .clkLoginBtn().
//                clkForgotPasswordBnt();
//        assertTrue(, "T");
//    }

}