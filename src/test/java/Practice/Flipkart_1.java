package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Flipkart_1 {
    static WebDriver driver;

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("_2zrpKA")).sendKeys("8179717979");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.className("_2zrpKA _3v41xv")).sendKeys("Ram@1318");
            driver.findElement(By.xpath("(//img[@class='_1Nyybr  _30XEf0'])[86]")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='_1Nyybr  _30XEf0'])[86]")));
            WebElement mobile = driver.findElement(By.xpath("//div[@class='_1hMRnR']/div/img"));
            if (mobile.isDisplayed()) {
                System.out.println(" is displayed ");
            } else {
                System.out.println(" is not displayed");
            }



    }

}
