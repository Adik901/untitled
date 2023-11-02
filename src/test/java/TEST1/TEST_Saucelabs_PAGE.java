package TEST1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TEST_Saucelabs_PAGE {

    private WebDriver DRIVER;
    private Saucelabs SAUSELABS;

    @Before
    public void setUp() {
        System.setProperty("WebDriver.chrome.driver",
                "/Users/adik/Downloads/Selenium instal.zip/Chromedriver-mac-arm64/116.0.5845.96/chromedriver");
        DRIVER = new ChromeDriver();
        DRIVER.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DRIVER.manage().window().maximize();
        DRIVER.get("https://www.saucedemo.com/");
        SAUSELABS = new Saucelabs (DRIVER);
 //  Созданный мною класс       То что создал сверху
        Saucelabs swaglabspage = SAUSELABS.
                ToSignIn("standard_user","secret_sauce");

    }
    @Test
    public void SauseLabs() {
        Saucelabs saucelabs = SAUSELABS.CLICK_Saucelabs();
        String souse = saucelabs.getHeadUnifiedPlatform();
        Assert.assertEquals("The unified platform for automated testing and error monitoring",souse);
    }
    @Test
    public void SauseLabs2() {
        Saucelabs saucelabs = SAUSELABS.CLICK_Saucelabs();
        Saucelabs StartedFree_BUTTO = SAUSELABS.ClickStartedFree_BUTTON();
//        String start = StartedFree_BUTTO.getFOR_ASERT_StartTestingInMinutes();
//        Assert.assertEquals("Start testing in minutes",start);
    }

    @After
    public void tearDown() {
        DRIVER.quit();
    }

}
