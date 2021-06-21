package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuidePage extends AbstractPage {
    private static final By INPUT_SEARCH_BOX_LOCATOR=By.id("search-block-items_help-input");
    private static final By SEARCH_BUTTON_LOCATOR =By.xpath("//button[contains(text(),'Искать')]");
    private static final By INPUT_SEARCH_RESULT_SPAN_LOCATOR =By.xpath("//div[@class='search-block-option'][.//span[contains(text(), 'Найдено')]]");
    public GuidePage(WebDriver driver){
        super(driver);
    }
    public GuidePage enterQueryToSearchBox(String query){
        //TODO:add waiter
        driver.findElement(INPUT_SEARCH_BOX_LOCATOR).sendKeys(query);
        return this;
    }
    public GuidePage searchButtonClick(){
        driver.findElement(SEARCH_BUTTON_LOCATOR).click();
        return this;
    }
    public String getTextOfInputSearchSpan(){
        return driver.findElement(INPUT_SEARCH_RESULT_SPAN_LOCATOR).getText();
    }
}
