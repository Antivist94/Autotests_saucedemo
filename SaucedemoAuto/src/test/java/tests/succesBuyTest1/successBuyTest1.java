package tests.succesBuyTest1;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class successBuyTest1 extends BaseTest {
        @Test
        public void takeFirstCardAndGo(){
                basePage.open("https://www.saucedemo.com/");
                shopLoginPage.loginByUser();
                inventoryPage.buyFirstCard();
                checkOutPage.acceptBuy();
                String url = driver.getCurrentUrl();
                Assert.assertTrue(url.equals("https://www.saucedemo.com/checkout-complete.html"));
        }


}
