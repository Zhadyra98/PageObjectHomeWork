package pf.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPagePF extends AbstractPagePF {
    @FindBy(xpath = "//a[contains(text(), 'Алматы')]")
    WebElement selectAlmatyLink;
    @FindBy(xpath = "//input[@class='search-bar__input']")
    WebElement inputSearchElement;
    @FindBy(xpath = "//button[@class='search-bar__submit button']")
    WebElement searchButton;

    public ShopPagePF(WebDriver driver){
        super(driver);
    }
    public ShopPagePF selectAlmatyAsCity(){
        selectAlmatyLink.click();
        return this;
    }
    public ShopPagePF fillSearchInput(String query){
        inputSearchElement.sendKeys(query);
        return this;
    }
    public SearchResultPagePF searchEnteredQuery(){
        //TODO:add waiter
        searchButton.click();
        return new SearchResultPagePF(driver);
    }


}
