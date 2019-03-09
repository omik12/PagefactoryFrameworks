package TestBase;

import HomePage.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageSearchTest extends ScriptBase {
    public static final Logger log = Logger.getLogger(HomePageSearchTest.class.getName());
    HomePage HomePage;

    @BeforeTest
    public void init() {
        beforetest();
    }

    @Test
    public void VerifySearchButton() {
        log.info("###Search Button Test Start####");
        HomePage = new HomePage(driver);
        HomePage.HomePageSearchButton();
        Assert.assertTrue(HomePage.HomePageSearchButton());
        log.info("###Search Button Test Finish####");


        //driver.findElement(By.xpath("//*[@id='search_query_top=']")).sendKeys("Test");
        //System.out.println(driver.findElement(By.xpath("//*[@id='search_query_top']")).getSize());
    }

    @AfterTest
    public void jobClose() {

        driver.close();
    }
}

