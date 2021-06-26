import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import po.pages.GuidePage;
import po.pages.HomePage;
import po.pages.ItemPage;
import po.pages.MapsPage;

import java.util.concurrent.TimeUnit;

public class KaspiTestPO {
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
    public void selectOneItemTest(){
        ItemPage itemPage = new HomePage(driver).open().startShopPage().fillSearchInput("iphone 12").searchEnteredQuery().openFirstIem().showSellersList();
    }
    @Test(description = "check that corresponding to entered data in Guide tap are displayed")
    public void searchingWordInGuideTabTest() {
        GuidePage guidePage = new HomePage(driver).open().startGuidePage().enterQueryToSearchBox("депозит").searchButtonClick();
        Assert.assertTrue(guidePage.getTextOfInputSearchSpan().contains("депозит"));
    }


}

