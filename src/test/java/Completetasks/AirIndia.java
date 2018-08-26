package Completetasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AirIndia extends Airindiamethod {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("http://www.airindia.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        findby(driver,"xpath=//li[@class='bookFlight']").click();
        //driver.findElement(By.xpath("//li[@class='bookFlight']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         Thread.sleep(5000);
         findby(driver,"id=from").sendKeys("Mumbai");
        //driver.findElement(By.id("from")).sendKeys("mumbai");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);
        findby(driver,"xpath=//a[contains(text(),'Mumbai, Chhatrapati Shivaji International Airport, BOM, India')]").click();
        //driver.findElement(By.xpath("//a[contains(text(),'Mumbai, Chhatrapati Shivaji International Airport, BOM, India')]")).click();
        Thread.sleep(5000);
        findby(driver,"id=to").sendKeys("bengaluru");
       // driver.findElement(By.id("to")).sendKeys("bengaluru");
        Thread.sleep(5000);
        findby(driver,"xpath=//a[contains(text(),'Bengaluru, Kempegowda International Airport, BLR, India')]").click();
      // driver.findElement(By.xpath("//a[contains(text(),'Bengaluru, Kempegowda International Airport, BLR, India')]")).click();
        Thread.sleep(5000);
        findby(driver,"xpath=(//img[@class='ui-datepicker-trigger'])[1]").click();
        Thread.sleep(5000);
        findby(driver,"xpath=(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[2]/td[3]").click();
        Thread.sleep(5000);
        findby(driver,"xpath=//label[@for='rdrules1']").click();
        Thread.sleep(5000);
        select(driver,"//div[@id='divconcessionaryType']/select","War Widow");
        Thread.sleep(5000);
        select1(driver,"//div[@id='divadult1']/select",3);
        Thread.sleep(5000);
        select3(driver,"(//div[@class='selectBox width55 oneline'])[1]/select","1");
        Thread.sleep(5000);
        select1(driver,"(//div[@class='selectBox width55 oneline'])[2]/select",5);


    }
}
