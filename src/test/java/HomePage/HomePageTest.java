package HomePage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest {

    private static WebDriver driver;
    private static String baseUrl;

    @BeforeAll
    public static void setUp() {
        Properties properties = new Properties();
        try {
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            String appConfigPath = rootPath + "app.properties";
            properties.load(new FileInputStream(appConfigPath));
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            baseUrl=properties.getProperty("base.url");
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
    public void mainMenuButton() {
        try {
            boolean buttonOfMenu = driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart\"]")).isDisplayed();
            assertTrue(buttonOfMenu, "Absent");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Absent");
        }
    }

    @Test
    public void trackNumberInput() {
        boolean inputFold = driver.findElement(By.xpath("//input[@placeholder=\"Track number\"]")).isDisplayed();
        assertTrue(inputFold, "Absent");
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}
