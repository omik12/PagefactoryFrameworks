package TestBase;

import HomePage.HomePage;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CatalogTest extends ScriptBase {
    public static final Logger log = Logger.getLogger(CatalogTest.class.getName());
    HomePage HomePage;

    @BeforeTest
    public void init() {
        beforetest();
    }

    @Test(priority = 1)
    public void VerifyCatalogDressSelectable() throws InterruptedException {
        log.info("###VerifyCatalogDressSelectable Test Start####");
        HomePage = new HomePage(driver);
        HomePage.HomepageCatalog(driver, "Dresses", "Evening Dresses");
        log.info("###VerifyCatalogDressSelectable Test Finish####");
    }

    @Test(priority = 2)
    public void VerifyCatalogDressSelectablCeasualDresses() throws InterruptedException {
        log.info("###VerifyCatalogDressSelectable Test Start####");
        HomePage = new HomePage(driver);
        HomePage.HomepageCatalog(driver, "Dresses","Casual Dresses");
        log.info("###VerifyCatalogDressSelectable Test Finish####");
    }

    @Test(priority = 3)
    public void VerifyCatalogDressSelectablCeasualDressesSummerDresses() throws InterruptedException {
        log.info("###VerifyCatalogDressSelectable Test Start####");
        HomePage = new HomePage(driver);
        HomePage.HomepageWomenCatalog(driver,"Women","T-shirts");
        log.info("###VerifyCatalogDressSelectable Test Finish####");
    }
    @Test(priority =4)
    public void VerifyCatalogWomenSelectable() throws InterruptedException {
        log.info("###VerifyCatalogWomenSelectable Test Start");
        HomePage = new HomePage(driver);
        HomePage.HomepageWomenCatalog(driver,"Women","Blouses");
        log.info("###VerifyCatalogWomenSelectable Test finish");
    }

    @AfterTest
    public void jobClose() {

        //driver.close();
    }
}
