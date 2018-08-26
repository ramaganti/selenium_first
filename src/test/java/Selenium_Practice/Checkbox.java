package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkbox {
    static WebDriver driver;
    public static void main(String[] args){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.cartrade.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.findElement(By.id("ucity")).click();
        Select rama = new Select( driver.findElement(By.id("ucity")));
        rama.selectByValue("chennai");
        List<WebElement> car = rama.getOptions();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        rama.selectByIndex(car.size()-1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        car.size();
        car.contains("Banglore");
       // car.get(Banglore);



    }
}
