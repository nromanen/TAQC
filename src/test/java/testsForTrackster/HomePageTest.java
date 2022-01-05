package testsForTrackster;

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
    public void toolBar() {
        try {
            boolean isToolBar = driver.findElement(By.xpath("//header[@class=\"MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary MuiPaper-elevation0\"]")).isDisplayed();
            assertTrue(isToolBar, "The toolBar is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The toolBar is absent");
        }
    }

    @Test
    public void mainMenuButton() {
        try {
            boolean isButtonOfMenu = driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart\"]")).isDisplayed();
            assertTrue(isButtonOfMenu, "The mainMenuButton is displayed");
        } catch (NoSuchElementException e) {
            assertTrue(false, "The mainMenuButton is absent");
        }
    }

    @Test
    public void imgLogo() {
        try {
            boolean isImgLogo = driver.findElement(By.cssSelector("img[src=\"/static/media/cardboard-box.e6f6462e.svg\"]")).isDisplayed();
            assertTrue(isImgLogo, "The imgLogo is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The imgLogo is absent");
        }
    }

    @Test
    public void buttonFollowToLandingPage() {
        try {
            boolean isButtonFollowToLandingPage = driver.findElement(By.xpath("//h6[@class=\"MuiTypography-root jss3 MuiTypography-h6\"]")).isDisplayed();
            assertTrue(isButtonFollowToLandingPage, "The buttonFollowToLandingPage is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The buttonFollowToLandingPage is absent");
        }
    }

    @Test
    public void buttonForSelectMenuOfLanguage() {
        try {
            boolean isButtonForSelectMenuOfLanguage = driver.findElement(By.xpath("//div[@aria-haspopup=\"listbox\"]")).isDisplayed();
            assertTrue(isButtonForSelectMenuOfLanguage, "The buttonForSelectMenuOfLanguage is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The buttonForSelectMenuOfLanguage is absent");
        }
    }

    @Test
    public void headingFindYourParcel() {
        try {
            boolean isHeadingFindYourParcel = driver.findElement(By.xpath("//h5[@class=\"MuiTypography-root jss13 MuiTypography-h5\"]")).isDisplayed();
            assertTrue(isHeadingFindYourParcel, "The headingFindYourParcel is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The headingFindYourParcel is absent");
        }
    }

    @Test
    public void trackNumberInput() {
        try {
            boolean isInputFold = driver.findElement(By.xpath("//input[@placeholder=\"Track number\"]")).isDisplayed();
            assertTrue(isInputFold, "The trackNumberInput is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The trackNumberInput is absent");
        }
    }

    @Test
    public void buttonForInputSearch() {
        try {
            boolean isButtonForInputSearch = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isDisplayed();
            assertTrue(isButtonForInputSearch, "The buttonForInputSearch is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The buttonForInputSearch is absent");
        }
    }

    @Test
    public void buttonForSearchByPhoto() {
        try {
            boolean isButtonForSearchByPhoto = driver.findElement(By.xpath("(//button[@class=\"MuiButtonBase-root MuiIconButton-root jss23\"])[2]")).isDisplayed();
            assertTrue(isButtonForSearchByPhoto, "The buttonForSearchByPhoto is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The buttonForSearchByPhoto is absent");
        }
    }

    @Test
    public void labelFastTracking() {
        try {
            boolean isLabelFastTracking = driver.findElement(By.xpath("//div[@class=\"jss15\"][1]")).isDisplayed();
            assertTrue(isLabelFastTracking, "The labelFastTracking is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The labelFastTracking is absent");
        }
    }

    @Test
    public void imgLabelFastTracking() {
        try {
            boolean isImgLabelFastTracking = driver.findElement(By.xpath("(//div[@class=\"jss15\"]/*[name()='svg'])[1]")).isDisplayed();
            assertTrue(isImgLabelFastTracking, "The imgLabelFastTracking is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The imgLabelFastTracking is absent");
        }
    }

    @Test
    public void labelIntuitiveInterface() {
        try {
            boolean isLabelIntuitiveInterface = driver.findElement(By.xpath("//div[@class=\"jss15\"][2]")).isDisplayed();
            assertTrue(isLabelIntuitiveInterface, "The labelIntuitiveInterface is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The labelIntuitiveInterface is absent");
        }
    }

    @Test
    public void imgLabelIntuitiveInterface() {
        try {
            boolean isImgLabelIntuitiveInterface = driver.findElement(By.xpath("(//div[@class=\"jss15\"]/*[name()='svg'])[2]")).isDisplayed();
            assertTrue(isImgLabelIntuitiveInterface, "The imgLabelIntuitiveInterface is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The imgLabelIntuitiveInterface is absent");
        }
    }

    @Test
    public void labelArchiveParcels() {
        try {
            boolean isLabelArchiveParcels = driver.findElement(By.xpath("//div[@class=\"jss15\"][3]")).isDisplayed();
            assertTrue(isLabelArchiveParcels, "The labelArchiveParcels is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The labelArchiveParcels is absent");
        }
    }

    @Test
    public void imgLabelArchiveParcels() {
        try {
            boolean isImgLabelArchiveParcels = driver.findElement(By.xpath("(//div[@class=\"jss15\"]/*[name()='svg'])[3]")).isDisplayed();
            assertTrue(isImgLabelArchiveParcels, "The imgLabelArchiveParcels is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The imgLabelArchiveParcels is absent");
        }
    }

    @Test
    public void headingOurPartners() {
        try {
            boolean isHeadingOurPartners = driver.findElement(By.xpath("//h4[@class=\"MuiTypography-root jss13 MuiTypography-h4\"]")).isDisplayed();
            assertTrue(isHeadingOurPartners, "The headingOurPartners is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The headingOurPartners is absent");
        }
    }

    @Test
    public void imgNovaPoshta() {
        try {
            boolean isImgNovaPoshta = driver.findElement(By.cssSelector("img[src=\"/static/media/nova-poshta.7e612a5d.png\"]")).isDisplayed();
            assertTrue(isImgNovaPoshta, "The imgNovaPoshta is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The imgNovaPoshta is absent");
        }
    }

    @Test
    public void imgJustin() {
        try {
            boolean isImgJustin = driver.findElement(By.cssSelector("img[src=\"/static/media/justin.112383fd.svg\"]")).isDisplayed();
            assertTrue(isImgJustin, "The imgJustin is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "the imgJustin is absent");
        }
    }

    @Test
    public void imgDhl() {
        try {
            boolean isImgDhl = driver.findElement(By.cssSelector("img[src=\"/static/media/dhl.eda3e6a1.png\"]")).isDisplayed();
            assertTrue(isImgDhl, "The imgDhl is displayed");
        } catch (NoSuchElementException exception) {
            assertTrue(false, "The imgDhl is absent");
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}
