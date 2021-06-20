package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage{
    private static  final By MAPS_TAP_LINK_LOCATOR =By.xpath("//a[contains(text(),'Maps')]");
    private static final By CITY_CONFIRM_BUTTON_LOCATOR = By.xpath("//div[@class='headerRegionConfirm__wrapper']");
    private static final By CITY_CONFIRM_YES_BUTTON_LOCATOR = By.id("headerRegionConfirm__ConfirmButton");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MapsPage startMapsPage(){
        if(driver.findElement(CITY_CONFIRM_BUTTON_LOCATOR).isDisplayed()){
            driver.findElement(CITY_CONFIRM_YES_BUTTON_LOCATOR).click();
        }
        driver.findElement(MAPS_TAP_LINK_LOCATOR).click();
        return new MapsPage(driver);
    }
    public HomePage open() {
        driver.get("https://kaspi.kz/");
        return this;
    }
}
