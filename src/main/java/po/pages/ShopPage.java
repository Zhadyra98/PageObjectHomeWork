package po.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ShopPage extends AbstractPage{
    private static  final By SELECT_ALMATY_CITY_LOCATOR =By.xpath("//a[contains(text(), 'Алматы')]");
    private static final By INPUT_SEARCH_ELEMENT_LOCATOR=By.xpath("//input[@class='search-bar__input']");
    private static final By SEARCH_BUTTON_LOCATOR = By.xpath("//button[@class='search-bar__submit button']");
    public ShopPage(WebDriver driver){
        super(driver);
    }
    public ShopPage selectAlmatyAsCity(){
        driver.findElement(SELECT_ALMATY_CITY_LOCATOR).click();
        return this;
    }
    public ShopPage fillSearchInput(String query){
        driver.findElement(INPUT_SEARCH_ELEMENT_LOCATOR).sendKeys(query);
        return this;
    }
    public SearchResultPage searchEnteredQuery(){
        driver.findElement(SEARCH_BUTTON_LOCATOR).click();
        return new SearchResultPage(driver);
    }


}
