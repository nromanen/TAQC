package pages.trackster_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By toolBar = By.xpath
            ("//header[@class=\"MuiPaper-root MuiAppBar-root MuiAppBar-positionStatic MuiAppBar-colorPrimary MuiPaper-elevation0\"]");
    private final By buttonOfMenu = By.xpath
            ("//button[@class=\"MuiButtonBase-root MuiIconButton-root jss2 MuiIconButton-colorInherit MuiIconButton-edgeStart\"]");
    private final By imgLogo = By.xpath
            ("img[src=\"/static/media/cardboard-box.e6f6462e.svg\"]");
    private final By buttonFollowToLandingPage = By.xpath
            ("//h6[@class=\"MuiTypography-root jss3 MuiTypography-h6\"]");
    private final By buttonForSelectMenuOfLanguage = By.xpath
            ("//div[@aria-haspopup=\"listbox\"]");
    private final By headingFindYourParcel = By.xpath
            ("//h5[@class=\"MuiTypography-root jss13 MuiTypography-h5\"]");
    private final By inputFold = By.xpath
            ("//input[@class=\"MuiInputBase-input\"]");
    private final By buttonForInputSearch = By.xpath
            ("//button[@type=\"submit\"]");
    private final By buttonForSearchByPhoto = By.xpath
            ("(//button[@class=\"MuiButtonBase-root MuiIconButton-root jss23\"])[2]");
    private final By imgLabelFastTracking = By.xpath
            ("(//div[@class=\"jss15\"]/*[name()='svg'])[1]");
    private final By labelFastTracking = By.xpath
            ("//div[@class=\"jss15\"][1]");
    private final By labelIntuitiveInterface = By.xpath
            ("//div[@class=\"jss15\"][2]");
    private final By imgLabelIntuitiveInterface = By.xpath
            ("(//div[@class=\"jss15\"]/*[name()='svg'])[2]");
    private final By labelArchiveParcels = By.xpath
            ("//div[@class=\"jss15\"][3]");
    private final By imgLabelArchiveParcels = By.xpath
            ("(//div[@class=\"jss15\"]/*[name()='svg'])[3]");
    private final By headingOurPartners = By.xpath
            ("//h4[@class=\"MuiTypography-root jss13 MuiTypography-h4\"]");
    private final By imgNovaPoshta = By.cssSelector
            ("img[src=\"/static/media/nova-poshta.7e612a5d.png\"]");
    private final By imgJustin = By.cssSelector
            ("img[src=\"/static/media/justin.112383fd.svg\"]");
    private final By imgDhl = By.cssSelector
            ("img[src=\"/static/media/dhl.eda3e6a1.png\"]");
}
