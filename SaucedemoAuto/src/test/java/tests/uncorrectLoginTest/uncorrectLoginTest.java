package tests.uncorrectLoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class uncorrectLoginTest extends BaseTest {
    @Test
    public void uncorrectLogIn() {
        basePage.open("https://www.saucedemo.com/");
        shopLoginPage.uncorrectLoginByUser();
        boolean check = driver.getPageSource().contains("Epic sadface: Username and password do not match any user in this service");
        Assert.assertTrue(check == true);
    }
}
