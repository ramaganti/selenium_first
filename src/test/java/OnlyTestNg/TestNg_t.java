package OnlyTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNg_t {

    public WebDriver driver;



   @AfterClass
    public void afterclass(){
       // driver.quit();
        System.out.println("This is afterclass");
   }
   @BeforeClass
    public void beforeclass() {
       System.out.println("before class");

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");

       driver = new ChromeDriver();

       driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);
       PageFactory.initElements(factory,this);

       driver.get("https://www.redbus.in/");

   }

    @Test()
    public void main2() {
       //driver.findElement(By.id("onward_cal")).click();
        driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']/div/label")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody//tr[6]/td[5]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("search_btn")).click();
    }

    @Test(priority =2)
    public void main() {
        System.out.println("main method");
        driver.findElement(By.id("src")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("src")).sendKeys("Bangalore");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 3)
    public void main1() {
        WebElement bname = driver.findElement(By.xpath("//ul[@class='autoFill']/li[1]"));
        bname.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("dest")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("dest")).sendKeys("Tanuku");
        WebElement dname = driver.findElement(By.xpath("//ul[@class='autoFill']/li[1]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dname.click();
    }

}
