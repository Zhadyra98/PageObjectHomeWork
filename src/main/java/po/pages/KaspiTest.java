package po.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KaspiTest {
    private WebDriver driver;

    @BeforeClass(description = "Start browser")
    private void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test(description = "Change the city at Maps tab")
    public void changeCityOfSystemTest() {
        MapsPage mapsPage = new HomePage(driver).open().startMapsPage();
    }

    @AfterClass(description = "close browser")
    public void kill(){
        driver.close();
    }
}
