package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActions {
    static WebDriver driver;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/droppable/");
        WebElement drag = driver.findElement(By.id("draggableview"));
        WebElement drop = driver.findElement(By.id("droppableview"));
        Actions ram = new Actions(driver);
        ram.clickAndHold(drag).dragAndDrop(drag,drop).build().perform();

    }
}
