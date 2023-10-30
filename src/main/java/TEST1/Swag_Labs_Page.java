package TEST1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class Swag_Labs_Page {
        private static WebDriver driver;
        public Swag_Labs_Page(WebDriver driver){
            this.driver=driver;
        }
        private By Username = By.xpath("//input[@type='text']");
        private By Password = By.xpath("//input[@id='password']");
        private By LoginButton = By.xpath("//input[@id='login-button']");
        private By SwagLabs = By.xpath("//div[text()='Swag Labs']");

        // New

        private static By product_sort_container =
                By.xpath("//select[@class='product_sort_container']");
        private By Remove1 =
                By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory ']");


        public Swag_Labs_Page TypeUsername (String username) {
            driver.findElement(Username).sendKeys(username);
            return this;
        }
        public Swag_Labs_Page TypePassword (String password) {
            driver.findElement(Password).sendKeys(password);
            return this;
        }
        //                                   Метод для входа вписанный в один код
        public Swag_Labs_Page ToSignIn (String USER_NAME, String PASSWORD){
            this.TypeUsername(USER_NAME);
            this.TypePassword(PASSWORD);
            driver.findElement(LoginButton).click();
            return new Swag_Labs_Page(driver);
        }


        public static Swag_Labs_Page click_product_sort_container(){
            driver.findElement(product_sort_container).click();
            return new Swag_Labs_Page(driver);
        }
        public String getSwagLabs2 () {
            return driver.findElement(Remove1).getText();
        }
    }


