package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.security.Key;

public class Ethopianairlines {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.ethiopianairlines.com/AA/EN");
        driver.findElement(By.id("departCity")).sendKeys("Dubai");
        driver.findElement(By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12']/input[2])[1]")).click();




    }
}
