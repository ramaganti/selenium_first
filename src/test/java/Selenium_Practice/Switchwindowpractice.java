package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Switchwindowpractice {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        String ram = driver.findElement(By.xpath("//div[@class='wf-container-main']/div/h2")).getText();
        if (ram.equals("1) Browser Windows")){
            System.out.println("1) Browser Windows is found");
        }else {
            System.out.println("2) Browser Windows not found");
        }
        driver.findElement(By.xpath("//div[@class='content']/p[2]/button")).click();
        //fluent wait

        Set<String> ram1 = driver.getWindowHandles();
        Iterator<String> rama1 = ram1.iterator();
        String parentwindow = rama1.next();
        String childwindow = rama1.next();
        System.out.println();
        driver.switchTo().window(childwindow);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.close();
        driver.switchTo().window(parentwindow);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='content']/p[3]/button")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//Implicit wait
        Set<String> nanda = driver.getWindowHandles();
        Iterator<String> satya = nanda.iterator();
        String currentwindow = satya.next();
        String newwindow = satya.next();
        System.out.println(nanda);
        driver.switchTo().window(newwindow);
        driver.manage().window().maximize();
        driver.close();

       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       // driver.switchTo().window(currentwindow);






    }
}