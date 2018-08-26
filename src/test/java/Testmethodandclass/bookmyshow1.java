package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class bookmyshow1 {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://in.bookmyshow.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='__top-cities']/ul/li/a/span"));
        for (int i = 0; i <elements.size() ; i++) {
            System.out.println(elements.get(i).getText());
        }

        driver.findElement(By.xpath("//div[@class='__top-cities']/ul/li[1]/a/span")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("wzrk-cancel")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> shownames = driver.findElements(By.xpath("//div[@class='inner-nav left-nav']/ul/li/a"));
        for (int i = 0; i <shownames.size() ; i++) {
            System.out.println(shownames.get(i).getText());
        }
        driver.findElement(By.xpath("//div[@class='inner-nav left-nav']/ul/li[5]/a")).click();


    }
}
