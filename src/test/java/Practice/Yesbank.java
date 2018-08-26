package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Yesbank {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.yesbank.in/personal-banking");
        Thread.sleep(1000);
        driver.findElement(By.className("customDropAction")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("retail-disclaimer")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
        Set<String> yes = driver.getWindowHandles();
        Iterator<String> bank =yes.iterator();
        String parentwindowid = bank.next();
        String childwindowid = bank.next();
        System.out.println(yes);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.MILLISECONDS
        ).ignoring(NoSuchElementException.class);
        driver.switchTo().window(childwindowid);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='centerBtn']/a")).click();
        FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.MILLISECONDS
        ).ignoring(NoSuchElementException.class);
        driver.close();

    }
}
