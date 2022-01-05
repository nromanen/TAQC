package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import static common.constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        Properties properties = new Properties();
        try {
            InputStream input = new FileInputStream("src//test//resources//app.properties");
            properties.load(input);
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
