package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Inrdeals {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://inrdeals.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
        driver.findElement(By.xpath("//div[@class='login-text']/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("login")).sendKeys("ramganti18@hotmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("R79797979");
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        driver.findElement(By.id("jpwClose")).click();

   }
}
