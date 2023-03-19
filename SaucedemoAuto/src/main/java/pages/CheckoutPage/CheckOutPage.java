package pages.CheckoutPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CheckOutPage extends BasePage {
    public CheckOutPage(WebDriver driver){
        super(driver);
    }
    By FirstName = By.id("first-name");
    By LastName = By.id("last-name");
    By ZipPostCode = By.id("postal-code");
    By CheckoutBtn = By.id("checkout");
    By ContinueBtn = By.id("continue");

    By FinishBtn = By.id("finish");

    By expectation = By.cssSelector("#complete-header");



    public CheckOutPage acceptBuy (){
        driver.findElement(CheckoutBtn).click();
        driver.findElement(FirstName).sendKeys("test");
        driver.findElement(LastName).sendKeys("test");
        driver.findElement(ZipPostCode).sendKeys("test");
        driver.findElement(ContinueBtn).click();
        driver.findElement(FinishBtn).click();
        return this;
    }

}
