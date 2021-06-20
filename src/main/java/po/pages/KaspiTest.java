package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class KaspiTest {
    private WebDriver driver;

    @BeforeTest(description = "Start browser")
    private void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest(description = "close browser")
    public void kill(){
        driver.close();
    }

    @Test(description = "Change the city at Maps tab")
    public void changeCityOfSystemTest() {
        MapsPage mapsPage = new HomePage(driver).open().startMapsPage().selectSemeyAsCity();
        Assert.assertEquals(mapsPage.getCity(),"Семей");
    }
    @Test(description = "Select one item and show sellers list")
    public void selectOneItem(){
        ItemPage itemPage = new HomePage(driver).open().startShopPage().fillSearchInput("iphone 12").searchEnteredQuery().openFirstIem().showSellersList();
    }

}

