package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import pages.CheckoutPage.CheckOutPage;
import pages.InventoryPage.InventoryPage;
import pages.ShopLoginPage.ShopLoginPage;
import pages.base.BasePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ShopLoginPage shopLoginPage = new ShopLoginPage(driver);
    protected InventoryPage inventoryPage = new InventoryPage(driver);
    protected CheckOutPage checkOutPage = new CheckOutPage(driver);


    public WebElement waitElementIsVisible(WebElement element) {
        WebElement element1 = new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    @AfterTest (alwaysRun = true)
    public void quite () {driver.quit();}




}
