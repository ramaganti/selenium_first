package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mongdb {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.mongodb.com/cloud/atlas/lp/general?utm_medium=PS&utm_source=quora&utm_campaign=WW_A" +
                "tlas_LA1_D_5.4&utm_content=1&utm_term=1&jmp=quora");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("swamy224@gmail.com");



    }
}
