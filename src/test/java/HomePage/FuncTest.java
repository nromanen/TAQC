package HomePage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FuncTest {

    private static WebDriver driver;
    private static String baseUrl;
    private static String findUrl;

    @BeforeAll
    public static void setUp() {
        Properties properties = new Properties();
        try {
            InputStream input = new FileInputStream("src//test//resources//app.properties");
            properties.load(input);
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            baseUrl = properties.getProperty("base.url");
            findUrl = properties.getProperty("find.url");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void beforeEach() {
        driver.get(baseUrl);
    }

    @Test
    public void testTitle() {
        String title = driver.getTitle();
        String expect = "Trackster";
        assertEquals(expect, title);
    }

    @Test
    public void testMenu() {

        WebElement menu = driver.findElement(By.cssSelector("div.MuiPaper-root.MuiDrawer-paper.jss7.MuiDrawer-paperAnchorLeft.MuiDrawer-paperAnchorDockedLeft.MuiPaper-elevation0"));
        WebElement buton = driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.jss2.MuiIconButton-colorInherit.MuiIconButton-edgeStart"));
        buton.click();

        assertTrue(menu.isDisplayed(), "The menu does not work properly");
    }

    @Test
    public void testNotFoundDelivery() {

        WebElement input = driver.findElement(By.cssSelector("input.MuiInputBase-input"));
        input.sendKeys("1234567890");

        WebElement buton = driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.jss23"));
        buton.click();

        WebElement notf = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.not-found p")));

        String actual = notf.getText();
        String expected = "Nothing found...";

        assertEquals(actual, expected, "The result of an empty search is incorrect");
    }

    @Test
    public void testMainButton() {

        driver.get(findUrl);

        WebElement butonMenu = driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.jss2.MuiIconButton-colorInherit.MuiIconButton-edgeStart"));
        butonMenu.click();

        WebElement butonMain = driver.findElement(By.cssSelector("span.MuiTypography-root.MuiListItemText-primary.MuiTypography-body1.MuiTypography-displayBlock"));
        butonMain.click();

        driver.getCurrentUrl();

        WebElement backToHome = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.jss19")));

        String actual = backToHome.getText();
        String expected = "Find your parcel just in one moment";

        assertEquals(actual, expected, "Returning to the home page does not work correctly");
    }

    @Test
    public void testLoInButton() {

        WebElement butonMenu = driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.jss2.MuiIconButton-colorInherit.MuiIconButton-edgeStart"));
        butonMenu.click();

        WebElement butonLogIn = driver.findElement(By.xpath("//span[contains(.,'Log In')]"));
        butonLogIn.click();

        WebElement backToHome = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'login')]")));

        String actual = backToHome.getText();
        String expected = "LOGIN";

        assertEquals(actual, expected, "Going to the login page is incorrect");
    }

    @Test
    public void testSingUpButton() {

        WebElement butonMenu = driver.findElement(By.cssSelector("button.MuiButtonBase-root.MuiIconButton-root.jss2.MuiIconButton-colorInherit.MuiIconButton-edgeStart"));
        butonMenu.click();

        WebElement butonSingUp = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Sign Up')]")));
        butonSingUp.click();

        WebElement backToHome = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(.,'Sign Up')]")));

        String actual = backToHome.getText();
        String expected = "Sign Up";

        assertEquals(actual, expected, "Going to the login page is incorrect");
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }

}
