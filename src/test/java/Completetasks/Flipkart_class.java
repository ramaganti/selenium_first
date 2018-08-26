package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Flipkart_class extends Flipkart_method {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");
        click(driver,"//div[@class='ch__clearfix ch__navigation']/ul/li[3]/a");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        id(driver,"hp-widget__sfrom");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Bangalore");
        Thread.sleep(3000);
        click(driver,"//li[@id='ui-id-486']/div/p/span");





    }
}
