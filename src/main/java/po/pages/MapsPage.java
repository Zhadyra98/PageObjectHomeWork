package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MapsPage extends AbstractPage {
    private static final By SEMEY_CITY_CHOICE_LOCATOR= By.xpath("//a[contains(text(), 'Семей')]");
    private static final By CITY_ICON_LOCATOR = By.xpath("//*[@id=\"headerRegionSelection\"]/span");
    private static final By ON_MAPS_LOCATOR = By.xpath("//button[@class='button button-on-map js-on-map']");
    public MapsPage(WebDriver driver) {
        super(driver);
    }
    public MapsPage selectSemeyAsCity(){
        driver.findElement(SEMEY_CITY_CHOICE_LOCATOR).click();
        return this;
    }
    public String getCity(){
        return driver.findElement(CITY_ICON_LOCATOR).getText();
    }


}
