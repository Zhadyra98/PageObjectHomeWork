package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends AbstractPage {
    private static final By FIRST_ELEMENT_LOCATOR = By.xpath("//div[@data-product-id='100658112']");
    public SearchResultPage(WebDriver driver){
        super(driver);
    }
    public ItemPage openFirstIem(){
        driver.findElement(FIRST_ELEMENT_LOCATOR).click();
        return new ItemPage(driver);
    }

}
