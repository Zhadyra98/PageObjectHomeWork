package pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePF extends AbstractPagePF {
    @FindBy(xpath="//a[contains(text(),'Maps')]")
    WebElement mapsTap;
    @FindBy(xpath ="//a[contains(text(), 'Магазин')]" )
    WebElement shopTap;
    @FindBy(xpath = "//div[@id='headerMenu']//a[contains(text(), 'Гид')]")
    WebElement guideTap;
    @FindBy(xpath = "//div[@class='headerRegionConfirm__wrapper']")
    WebElement cityConfirmButton;
    @FindBy(xpath = "headerRegionConfirm__ConfirmButton")
    WebElement cityConfirmYesButton;
    public HomePagePF(WebDriver driver) {
        super(driver);
    }

    public MapsPagePF startMapsPage(){
        mapsTap.click();
        return new MapsPagePF(driver);
    }
    public ShopPagePF startShopPage(){
        shopTap.click();
        return new ShopPagePF(driver);
    }
    public GuidePagePF startGuidePage(){
        guideTap.click();
        return new GuidePagePF(driver);
    }
    public HomePagePF open() {
        driver.get("https://kaspi.kz/");
        if(cityConfirmButton.isDisplayed()){
            cityConfirmYesButton.click();
        }
        return this;
    }
}
