package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class Selectmultiplecheckbox {

    static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-form/");

        List<WebElement> check = driver.findElements(By.xpath("(//div[@class='control-group'])[7]/input"));
        Iterator<WebElement> box = check.iterator();
        while (box.hasNext())
        {
            box.next().click();
        }
        List<WebElement> check1 = driver.findElements(By.xpath("(//div[@class='control-group'])[14]/input"));
//        Iterator<WebElement> box1 = check1.iterator();
//        while (box1.hasNext()){
//            box1.next().click();
//        }
        for (int i = 0; i < 2 ; i++) {
            check1.get(i).click();
        }

    }
}
