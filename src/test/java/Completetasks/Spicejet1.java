package Completetasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Spicejet1 extends Spicejetmethod{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        Spicejet1 element = new Spicejet1();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("http://www.spicejet.com/default.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element.id(driver,"ctl00_mainContent_ddl_originStation1_CTXT");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click on source
        element.xpath(driver,"//a[contains(text(),' Hyderabad (HYD)')]");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // click on destination
       element.id(driver,"ctl00_mainContent_ddl_destinationStation1_CTXT");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element.xpath(driver,"(//a[contains(text(),' Bengaluru (BLR)')])[2]");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // click on date
        element.xpath(driver,"(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[2]/td[3]");
        Thread.sleep(3000);
        // click on passengers
        element.id(driver,"divpaxinfo");
        Thread.sleep(3000);
        element.xpath(driver,"//div[@id='divpaxOptions']/div/div[2]/span[3]");
        Thread.sleep(3000);
        element.xpath(driver,"//div[@id='divChild']/div[2]/span[3]");
        Thread.sleep(3000);
        element.xpath(driver,"//div[@id='divInfant']/div[2]/span[3]");
        Thread.sleep(3000);
        element.id(driver,"btnclosepaxoption");
        Thread.sleep(3000);
        element.id(driver,"ctl00_mainContent_btn_FindFlights");




    }

}
