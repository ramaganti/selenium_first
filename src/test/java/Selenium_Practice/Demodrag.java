package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demodrag {
    static WebDriver driver;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/draggable/");
        WebElement ram = driver.findElement(By.id("draggable"));
        WebElement resh = driver.findElement(By.className("inside_contain"));
        Actions raj = new Actions(driver);
        raj.clickAndHold(ram).dragAndDrop(ram,resh).build().perform();

    }
}
