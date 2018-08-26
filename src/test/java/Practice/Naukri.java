package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Naukri {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        System.out.println(driver.getCurrentUrl());
        Set<String> window = driver.getWindowHandles();
        Iterator<String> itr = window.iterator();
        String parent = itr.next();
        String child = itr.next();
        driver.switchTo().window(child);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.close();
        driver.switchTo().window(parent);
        Thread.sleep(5000);
        WebElement move = driver.findElement(By.xpath("//ul[@class='midSec menu']/li[6]"));
        move.click();
        driver.findElement(By.id("eLogin")).sendKeys("ramganti18@gmail.com");
        driver.findElement(By.id("pLogin")).sendKeys("Ram@1318");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            WebElement element = driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element);
        Thread.sleep(3000);
        driver.getCurrentUrl();

       // driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]")).click();

    }
}
