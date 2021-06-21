package pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPagePF extends AbstractPagePF {
    @FindBy(xpath = "//div[@data-product-id='100658112']")
    WebElement firstElement;

    public SearchResultPagePF(WebDriver driver){
        super(driver);
    }
    public ItemPagePF openFirstIem(){
        firstElement.click();
        return new ItemPagePF(driver);
    }

}
