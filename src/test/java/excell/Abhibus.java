package excell;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Abhibus {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("source")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("source")).sendKeys("Bangalore");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.findElement(By.x
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("destination")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("destination")).sendKeys("Ravulapalem");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("destination")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("datepicker1")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[1]/td[7]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String color = driver.findElement(By.xpath("//div[@class='searchFields clearfix']/div[3]/a")).getCssValue("background-color:");
        System.out.println(color);
        driver.findElement(By.xpath("//div[@class='searchFields clearfix']/div[3]/a")).click();


    }
}
