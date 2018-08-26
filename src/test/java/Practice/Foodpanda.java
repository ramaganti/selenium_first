package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Foodpanda {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.foodpanda.in/");
        driver.findElement(By.className("twitter-typeahead")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//input[@class='form-control twitter-typeahead tt-input']")).sendKeys("Hyderabad");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='form-control twitter-typeahead tt-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
       driver.findElement(By.id("area")).sendKeys("Madhava Reddy Colony");
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("area")).sendKeys(Keys.ARROW_DOWN);
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // driver.findElement()
        driver.findElement(By.id("area")).sendKeys(Keys.ENTER);






    }
}

