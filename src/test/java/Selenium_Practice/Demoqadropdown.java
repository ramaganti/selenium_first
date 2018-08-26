package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demoqadropdown {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // no need to click on dropdown obx to select value
       // driver.findElement(By.id("dropdown_7")).click();
        Thread.sleep(1000);
        Select ram = new Select(driver.findElement(By.id("dropdown_7")));
        ram.selectByVisibleText("Argentina");
        Thread.sleep(2000);
        List<WebElement> option = ram.getOptions();
        ram.selectByIndex(option.size()-2);
        //to get size of dropdown
//        System.out.println(option.get(option.size()-1).getText());
//        System.out.println("-------------------");
//
//        // to print values in dropdown
//        for (int i = 0; i <option.size(); i++) {
//            System.out.println(option.get(i).getText());


        }
    }


