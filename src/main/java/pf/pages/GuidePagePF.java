package pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuidePagePF extends AbstractPagePF {
    @FindBy(id="search-block-items_help-input")
    WebElement inputSearchBox;
    @FindBy(xpath = "//button[contains(text(),'Искать')]")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class='search-block-option'][.//span[contains(text(), 'Найдено')]]")
    WebElement inputSearchResultSpan;
    public GuidePagePF(WebDriver driver){
        super(driver);
    }
    public GuidePagePF enterQueryToSearchBox(String query){
        //TODO:add waiter
        inputSearchBox.sendKeys(query);
        return this;
    }
    public GuidePagePF searchButtonClick(){
        searchButton.click();
        return this;
    }
    public String getTextOfInputSearchSpan(){
        return inputSearchResultSpan.getText();
    }
}
