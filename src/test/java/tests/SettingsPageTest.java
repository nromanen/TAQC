package tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.DriverConfiguration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsPageTest extends BaseTest {
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected HomePage homePage;
    protected BasePage basePage;
    protected SettingsPage settingsPage;

    public SettingsPageTest() {
        super();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        menuPage = new MenuPage(driver);
        settingsPage = new SettingsPage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        homePage.open(DriverConfiguration.BASE_URL);
    }

    /**
     * Test verify that all elements on LoginPage are displayed
     */

    @Test
    public void isPhoneFieldNumberCleared() {
        homePage.clkMenuBtn()
                .clkLoginBtn()
                .insertLoginFld("shymkov.yuriy@chnu.edu.ua","843hy8dh3698dhg")
                .clkSubmitLogin()
                .clkMenuBtn()
                .clkUserSetingsBtn()
                .editPhoneNumber();
        assertTrue(settingsPage.isPhoneFieldNumberCleared(), "Phone Field is cleared");
    }

}