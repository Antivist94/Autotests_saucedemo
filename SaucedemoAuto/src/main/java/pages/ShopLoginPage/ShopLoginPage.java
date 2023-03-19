package pages.ShopLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ShopLoginPage extends BasePage {

    public ShopLoginPage(WebDriver driver) {
        super(driver);
    }
    By UserName = By.id("user-name");//корректный юзер
    By UserPass = By.id("password"); //корректный пароль
    By btnLogIn = By.id("login-button"); //кнопка "войти"


    public ShopLoginPage loginByUser() {
        driver.findElement(UserName).sendKeys("standard_user");
        driver.findElement(UserPass).sendKeys("secret_sauce");
        driver.findElement(btnLogIn).click();
        return this;
    }
    public ShopLoginPage uncorrectLoginByUser() {
        driver.findElement(UserName).sendKeys("test");
        driver.findElement(UserPass).sendKeys("test");
        driver.findElement(btnLogIn).click();
        return this;
    }



}
