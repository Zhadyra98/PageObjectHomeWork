package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ItemPage extends AbstractPage {
    private static final By SELLERS_CHOICE_BUTTON_LOCATOR=(By.xpath("//a[contains(text(), 'Выбрать продавца')]"));
    private static final By TITLE_OF_SELLECTED_ITEM_LOCATOR=By.xpath("//*[@id=\"page\"]/div[5]/div[1]/div/div[2]/div/div[1]/div/h1");
    public ItemPage(WebDriver driver){
        super(driver);
    }
    public ItemPage showSellersList(){
        driver.findElement(SELLERS_CHOICE_BUTTON_LOCATOR).click();
        Assert.assertTrue(driver.findElement(TITLE_OF_SELLECTED_ITEM_LOCATOR).getText().contains("iPhone 12"));
        return this;
    }
}
