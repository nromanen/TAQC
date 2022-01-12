package testsForTrackster.home_page;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import pages.home.MenuPage;
import testsForTrackster.base.BaseTest;

import static common.constants.Constant.Urls.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MenuTest extends BaseTest {

    protected MenuPage menuPage;
    protected BasePage basePage;

    @BeforeEach
    public void beforeEach() {
        menuPage = new MenuPage(driver);
        basePage = new BasePage(driver);
        menuPage.open(HOME_PAGE_URL);
    }

    @Test
    public void testIsHdnMenuDsp() {

        menuPage.clkMenuBtn();
        assertTrue(menuPage.isHdnMenuDsp(), "The menuBtn does not work properly");
    }

    @Test
    public void testIsLogInDsp() {

        menuPage.clkMenuBtn();
        assertTrue(menuPage.isLogInDsp(), "There is no LogIn item in the Menu");
    }

    @Test
    public void testIsSingUpDsp() {

        menuPage.clkMenuBtn();
        assertTrue(menuPage.isSingUpDsp(), "There is no SignUp item in the Menu");
    }

    @Test
    public void testMainBtn() {
        menuPage.open(UNK_SEARCH_PAGE_URL); // FIX LATER

        menuPage.clkMenuBtn()
                .clkMainBtn();
        WebElement backToHome = basePage.waitElementIsVisible(By.cssSelector("h5.MuiTypography-root"));
        String actual = backToHome.getText();
        String expected = "Find your parcel just in one moment";
        assertEquals(actual, expected, "Returning to the home page does not work correctly");
    }

    @Test
    public void testLogInBtn() {

        menuPage.clkMenuBtn()
                .clkLoginBtn();
        WebElement backToHome = basePage.waitElementIsVisible(By.xpath("//span[contains(.,'Log In')]"));
        String actual = backToHome.getText();
        String expected = "Log In";
        assertEquals(expected, actual, "Going to the login page is incorrect");
    }

    @Test
    public void testSingUpBtn() {

        menuPage.clkMenuBtn()
                .clkSingupBtn();
        WebElement backToHome = basePage.waitElementIsVisible(By.xpath("//span[contains(.,'Sign Up')]"));
        String actual = backToHome.getText();
        String expected = "Sign Up";
        assertEquals(actual, expected, "Going to the login page is incorrect");
    }

}
