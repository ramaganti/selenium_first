package Completetasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bookmyshow extends BsMethod {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");

        Bookmyshow gn = new Bookmyshow();
        driver = new ChromeDriver();
        driver.get("https://in.bookmyshow.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("=====current cities=====");
        // get current cities
         List<WebElement> raml = list(driver,"//div[@class='__top-cities']/ul/li");
        // click on bangalore
        raml.get(1).click();
        //click(driver,"//div[@class='__top-cities']/ul/li[3]");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // clcik on not now
        id(driver,"wzrk-cancel");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("*****header coloumn elements*****");
        // header coloumn elements
        List<WebElement> ram2 = list(driver,"//div[@class='inner-nav left-nav']/ul/li");
        // click on events
        ram2.get(1).click();
        //gn.click(driver,"//div[@class='inner-nav left-nav']/ul/li[2]");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // scrolldown the webpage
        scrolldown(driver,"window.scrollBy(0,700)");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        System.out.println(" ///// types of events ///////");
        // primary filters
        List<WebElement> ram3 = list(driver,"//div[@class='primary-filters']/span");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // clcik on comedy
        ram3.get(1).click();
        //gn.click(driver,"//div[@class='primary-filters']/span[2]");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // scrolldown the webpage
        scrolldown(driver,"window.scrollBy(0,700)");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // click on standupcomedy
        id(driver,"standupcomedy");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // pick a date
        id(driver,"calendar-filter");
        //date list
        List<WebElement> ram4 = list(driver,"//div[@class='ranges']/ul/li");
        // click on tomorrow
        ram4.get(2).click();

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // clik on tomorrow
       // gn.click(driver,"//div[@class='ranges']/ul/li[2]");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // click on price filter
        gn.click(driver,"//p[@class='CaptionCont SlectBox']");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //price list
        List<WebElement> ram5 = list(driver,"//div[@class='optWrapper open']/ul/li");
        // click on rate
        ram5.get(4).click();
        //gn.click(driver,"//label[text()='1501 - 2000']");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // click on price filter
        gn.click(driver,"//p[@class='CaptionCont SlectBox']");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // click on rate
        gn.click(driver,"//label[text()='0 - 500']");

    }
}
