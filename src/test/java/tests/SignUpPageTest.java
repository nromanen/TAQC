package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.*;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;
    public class SignUpPageTest extends BaseTest {
        protected LoginPage loginPage;
        protected MenuPage menuPage;
        protected HomePage homePage;
        protected BasePage basePage;
        protected SettingsPage settingsPage;
        protected SignupPage signupPage;
        protected HeaderPage headerPage;

        public SignUpPageTest() {
            super();
            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);
            menuPage = new MenuPage(driver);
            settingsPage = new SettingsPage(driver);
            basePage = new BasePage(driver);
            signupPage = new SignupPage(driver);
            headerPage = new HeaderPage(driver);

        }

        @BeforeEach
        public void beforeEach() {

            //homePage.open(DriverConfiguration.BASE_URL);
            headerPage.clkMenuBtn()
                    .clkSignupBtn();
        }
            @Test
            public void VerifyThatUserInputsValidEmail() {
                signupPage.inputNewEmail("user1gmail.com","123456","123456" );
                assertTrue(signupPage.findMassageInvalidEmail(), "Email is invalid");
            }
    }

