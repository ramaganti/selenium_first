package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sedraganddrop {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
//        Thread.sleep(5000);
//
//        WebElement drag = driver.findElement(By.xpath("//div[@id='todrag']/span[2]"));
//        WebElement drop = driver.findElement(By.id("mydropzone"));
//
//        Actions seasy = new Actions(driver);
//        seasy.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
//        //seasy.dragAndDrop(drag,drop).build().perform();


        Random ram = new Random();
        char[] rama = {'a','b','c','d','1','2','3'};
        String s = "";
        for (int i = 0; i < 10; i++) {

            int j = ram.nextInt((rama.length-1) + 1);
            s = s+rama[j];
            //System.out.println(i);
        }
        System.out.println(s);




    }
}
