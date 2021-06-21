package pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ItemPagePF extends AbstractPagePF {
    @FindBy(xpath ="//a[contains(text(), 'Выбрать продавца')]" )
    WebElement sellersChoiceButton;
    @FindBy(xpath = "//*[@id=\"page\"]/div[5]/div[1]/div/div[2]/div/div[1]/div/h1")
    WebElement titleOfSelectedItem;
    public ItemPagePF(WebDriver driver){
        super(driver);
    }
    public ItemPagePF showSellersList(){
        sellersChoiceButton.click();
        Assert.assertTrue(titleOfSelectedItem.getText().contains("iPhone 12"));
        return this;
    }
}
