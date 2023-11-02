package TEST1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucelabs {
    private static WebDriver driver;
    public Saucelabs (WebDriver driver){
        this.driver=driver;
    }
//                                              OLD
    private By Username = By.xpath("//input[@type='text']");
    private By Password = By.xpath("//input[@id='password']");
    private By LoginButton = By.xpath("//input[@id='login-button']");

    //                                          NEW

    private By OpenMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    private By AboutMenu = By.xpath("//a[text()='About']");
    private By ProductsMenu = By.xpath("//span[text()='Products']");
    private By Click_PlatformForTest = By.xpath("//span[@class='MuiTypography-root MuiTypography-buttonLabel css-3nj0wx']");
    private By HeadUnifiedPlatform = By.xpath("//h2[text()='The unified platform for automated testing and error monitoring']");
    private By StartedFree_BUTTON = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedDark MuiButton-sizeMedium " +
                    "MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedDark MuiButton-sizeMedium" +
                    " MuiButton-containedSizeMedium MuiButton-disableElevation css-lsi1wp']");
    private By FOR_ASERT_StartTestingInMinutes =
            By.xpath("//h1[@id='title']");



    //                                                  OLD
    public Saucelabs TypeUsername (String username) {
        driver.findElement(Username).sendKeys(username);
        return this;
    }
    public Saucelabs TypePassword (String password) {
        driver.findElement(Password).sendKeys(password);
        return this;
    }
    //                                   Метод для входа вписанный в один код
    public Saucelabs ToSignIn (String USER_NAME, String PASSWORD){
        this.TypeUsername(USER_NAME);
        this.TypePassword(PASSWORD);
        driver.findElement(LoginButton).click();
        return new Saucelabs(driver);
    }

//                                                      NEW

//    public Saucelabs OPEN_MENU () {
//        driver.findElement(OpenMenu).click();
//        return this;
//    }
//
//    public Saucelabs ABOUT_MENU () {
//        driver.findElement(AboutMenu).click();
//        return this;
//    }
//    public Saucelabs PRODUCT_MENU () {
//        driver.findElement(ProductsMenu).click();
//        return this;
//    }
//    public Saucelabs CLICK_PLATFORM_FOR_TEST () {
//        driver.findElement(Click_PlatformForTest).click();
//        return this;
//    }
    public Saucelabs CLICK_Saucelabs (){
        driver.findElement(OpenMenu).click();
        driver.findElement(AboutMenu).click();
        driver.findElement(ProductsMenu).click();
        driver.findElement(Click_PlatformForTest).click();
        return new Saucelabs(driver);
    }


    public String getHeadUnifiedPlatform () {
        return driver.findElement(HeadUnifiedPlatform).getText();
    }
    public Saucelabs ClickStartedFree_BUTTON () {
        driver.findElement(StartedFree_BUTTON).click();
        return this;
    }
    public String getFOR_ASERT_StartTestingInMinutes () {
        return driver.findElement(FOR_ASERT_StartTestingInMinutes).getText();
    }
}
