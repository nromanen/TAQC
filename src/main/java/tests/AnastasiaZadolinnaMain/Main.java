package tests.AnastasiaZadolinnaMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe"); // подключила веб-драйвер
        ChromeDriver driver = new ChromeDriver(); // создан экземпляр класса WebDriver

        driver.get("http://ttrackster.herokuapp.com/");

        WebElement toolBar = driver.findElement(By.xpath("//div[@class=\"MuiToolbar-root MuiToolbar-regular MuiToolbar-gutters\"]"));
        WebElement buttonOfMenu = driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart\"]"));
        WebElement imgLogo = driver.findElement(By.cssSelector("img[src=\"/static/media/cardboard-box.e6f6462e.svg\"]"));
        WebElement buttonFollowToLandingPage = driver.findElement(By.xpath("//h6[@class=\"MuiTypography-root jss3 MuiTypography-h6\"]"));
        WebElement buttonForSelectMenuOfLanguage = driver.findElement(By.xpath("//div[@aria-haspopup=\"listbox\"]"));

        WebElement headingFindYourParcel = driver.findElement(By.xpath("//h5[@class=\"MuiTypography-root jss13 MuiTypography-h5\"]"));
        WebElement inputFold = driver.findElement(By.xpath("//input[@placeholder=\"Track number\"]"));
        WebElement buttonForInputSearch = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        WebElement buttonForSearchByPhoto = driver.findElement(By.xpath("(//button[@class=\"MuiButtonBase-root MuiIconButton-root jss23\"])[2]"));


        WebElement imgLabelFastTracking = driver.findElement(By.xpath("(//div[@class=\"jss15\"]/*[name()='svg'])[1]"));
        WebElement labelFastTrackingText = driver.findElement(By.xpath("//span[text()=\"Fast tracking\"]"));
        WebElement labelIntuitiveInterfaceText = driver.findElement(By.xpath("//span[text()=\"Intuitive Interface\"]"));
        WebElement imgLabelIntuitiveInterface = driver.findElement(By.xpath("(//div[@class=\"jss15\"]/*[name()='svg'])[2]"));
        WebElement labelArchiveParcelsText = driver.findElement(By.xpath("//span[text()=\"Archive Parcels\"]"));
        WebElement imgLabelArchiveParcels = driver.findElement(By.xpath("(//div[@class=\"jss15\"]/*[name()='svg'])[3]"));

        WebElement headingOurPartners = driver.findElement(By.xpath("//h4[text()=\"Our Partners\"]"));
        WebElement imgNovaPoshta = driver.findElement(By.cssSelector("img[src=\"/static/media/nova-poshta.7e612a5d.png\"]"));
        WebElement imgJustin = driver.findElement(By.cssSelector("img[src=\"/static/media/justin.112383fd.svg\"]"));
        WebElement imgDhl = driver.findElement(By.cssSelector("img[src=\"/static/media/dhl.eda3e6a1.png\"]"));

    }
}
