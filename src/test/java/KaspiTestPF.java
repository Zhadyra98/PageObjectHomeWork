import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pf.pages.GuidePagePF;
import pf.pages.HomePagePF;
import pf.pages.ItemPagePF;
import pf.pages.MapsPagePF;

import java.util.concurrent.TimeUnit;

public class KaspiTestPF {
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
        MapsPagePF mapsPage = new HomePagePF(driver).open().startMapsPage().selectSemeyAsCity();
        Assert.assertEquals(mapsPage.getCity(),"Семей");
    }
    @Test(description = "Select one item and show sellers list")
    public void selectOneItemTest(){
        ItemPagePF itemPage = new HomePagePF(driver).open().startShopPage().fillSearchInput("iphone 12").searchEnteredQuery().openFirstIem().showSellersList();
    }
    @Test(description = "check that corresponding to entered data in Guide tap are displayed")
    public void searchingWordInGuideTabTest() {
        GuidePagePF guidePage = new HomePagePF(driver).open().startGuidePage().enterQueryToSearchBox("депозит").searchButtonClick();
        Assert.assertTrue(guidePage.getTextOfInputSearchSpan().contains("депозит"));
    }


}

