package pages.InventoryPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class InventoryPage extends BasePage {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }


    public InventoryPage buyFirstCard(){
        WebElement addCart = driver.findElement(By.xpath("//html//div[1]/div[2]/div[2]/button"));
        addCart.click();
        WebElement goToCart = driver.findElement(By.cssSelector("#shopping_cart_container"));
        goToCart.click();
        return this;
    }

}
