package TEST1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


    public class TEST_Swag_Labs_Page {
        private WebDriver DRIVER;
        private Swag_Labs_Page SWAGLABSPAGE;

        @Before
        public void setUp() {
            System.setProperty("WebDriver.chrome.driver",
                    "/Users/adik/Downloads/Selenium instal.zip/Chromedriver-mac-arm64/116.0.5845.96/chromedriver");
            DRIVER = new ChromeDriver();
            DRIVER.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            DRIVER.manage().window().maximize();
            DRIVER.get("https://www.saucedemo.com/");
            SWAGLABSPAGE = new Swag_Labs_Page(DRIVER);
            Swag_Labs_Page swaglabspage = SWAGLABSPAGE.
                    ToSignIn("standard_user","secret_sauce");


        }

        @Test
        public void SwagLabs() {
            Swag_Labs_Page swagLabsPage = Swag_Labs_Page.click_product_sort_container();
//        String swag = swagLabsPage.getSwagLabs2();
//        Assert.assertEquals("Remove",swag);
        }

        @After
        public void tearDown() {
            DRIVER.quit();
        }

    }
