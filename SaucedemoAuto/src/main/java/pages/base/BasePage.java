package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    public void open (String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        WebElement element1 = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }

}
