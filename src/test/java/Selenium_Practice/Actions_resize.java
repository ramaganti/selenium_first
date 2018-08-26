package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_resize{

    static WebDriver driver;

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(9000);
            driver.get("http://demoqa.com/resizable/");
            WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

            Actions ram_Action = new Actions(driver);

            ram_Action.clickAndHold(resize).moveByOffset(345,100).release().build().perform();
}



}
