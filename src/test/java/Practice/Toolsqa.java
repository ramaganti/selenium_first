package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/selenium-tutorial/");
        Thread.sleep(1000);
        driver.findElement(By.className("menu-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='wpb_wrapper'])[9]/p/a/img")).click();


    }
}
