package pf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapsPagePF extends AbstractPagePF {
    @FindBy(xpath = "//a[contains(text(), 'Семей')]")
    WebElement citySemeyChoice;
    @FindBy(xpath ="//*[@id=\"headerRegionSelection\"]/span")
    WebElement cityIcon;
    public MapsPagePF(WebDriver driver) {
        super(driver);
    }
    public MapsPagePF selectSemeyAsCity(){
        citySemeyChoice.click();
        return this;
    }
    public String getCity(){
        return cityIcon.getText();
    }


}
