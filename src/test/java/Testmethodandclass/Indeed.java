package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Indeed {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.indeed.co.in/?r=us");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("userOptionsLabel")).click();
        driver.findElement(By.xpath("(//div[@class='linkItem-title'])[1]")).click();
        driver.findElement(By.id("register_email")).sendKeys("innovative999@gmail.com");
        driver.findElement(By.id("register_retype_email")).sendKeys("innovative999@gmail.com");
        driver.findElement(By.id("register_password")).sendKeys("innovative");
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();

    }
}
