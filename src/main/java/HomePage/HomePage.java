package HomePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.sql.rowset.spi.SyncFactory;


public class HomePage {
    public static final Logger log=Logger.getLogger(HomePage.class.getName());
    @FindBy(xpath = "html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]")
    WebElement searchButton;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public boolean HomePageSearchButton() {
        try {
            searchButton.isDisplayed();
            log.info("Search Button Is Displayed"+searchButton.toString());
            return true;
        }
        catch (Exception e) {
            log.info("Search Button Is Not Displayed"+searchButton.toString());



            return false;
        }
    }
    public void HomepageCatalog(WebDriver driver,String catagory,String dresses) throws InterruptedException {
        Actions builder=new Actions(driver);
        WebElement element=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a[contains(text(),'"+catagory+"')]"));
        builder.moveToElement(element).build().perform();
        Thread.sleep(1000);
        WebElement element2=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul//a[contains(text(),'"+dresses+"')]"));
        Assert.assertTrue(true,element2.getText());
                element2.click();


    }

    public void HomepageWomenCatalog(WebDriver driver,String women,String tshirt) throws InterruptedException {
        Actions builder=new Actions(driver);
        WebElement element3=driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a[contains(text(),'"+women+"')]"));
        Assert.assertTrue(true,element3.getText());
        //element3.click();
        Thread.sleep(1000);
        WebElement element4=driver.findElement(By.xpath("//*[@id='block_top_menu']//li[1]/ul/li[1]/ul/li[1]/a[@title='"+tshirt+"']"));
        Assert.assertTrue(true,element4.getText());
        element4.click();
        Thread.sleep(1000);


    }
}
