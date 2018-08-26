package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Bigbasket {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bigbasket.com/");
        driver.findElement(By.className("ng-binding")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='dropdown-menu latest-at-bb']/div[2]/form/div[1]/div/div/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("form-group area-autocomplete city-select")).sendKeys("Chennai");


    }
}
