package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyParcelsPageWithoutLogOutTest extends AuthorizedTest {

    public MyParcelsPageWithoutLogOutTest() {
        super();
    }

    /**
     * Verify That Authorized User Is Able To Change Language On Page
     * Change English to Ukrainian
     */
    @Test
    public void verifyThatChangingEngToUaIsPossible() {
        headerPage.clkListBoxBtn()
                .clkUaBtn();
        assertTrue(myParcelsPage.isUaStatusDsp(), "Language isn't correct");
    }

    /**
     * Verify That Authorized User Is Able To Log out by Log out button
     */
    @Test
    public void verifyThatUserIsAbleToLogOutByLogoutBtn() {
        headerPage.clkMenuBtn()
                .clkUserLogOutBtn();
        assertTrue(homePage.isHdngFindYourParcelDsp(), "Log Out Button doesn't work correctly");
    }

    @AfterEach
    public void tearDown() {
        driver.manage().deleteAllCookies();
        super.tearDown();
    }
}
