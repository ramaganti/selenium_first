package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_selectable {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/selectable/");
        Thread.sleep(5000);

        WebElement s1 = driver.findElement(By.xpath("//ol[@id='selectable']/li"));
        WebElement s3 = driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
        WebElement s5 = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));


        Actions ram_action = new Actions(driver);
//        ram_action.keyDown(Keys.CONTROL).perform();
//        ram_action.click(s1).click(s3).click(s5).build().perform();

        ram_action.dragAndDrop(s1,s5).perform();



    }



}
