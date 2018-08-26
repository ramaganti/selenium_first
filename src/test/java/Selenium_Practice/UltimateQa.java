package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UltimateQa
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ultimateqa.com/automation/");
        WebElement login =driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/ul/li/a"));
        login.click();

        Actions vivek = new Actions(driver);
        vivek.click(login).perform();
        WebElement signup = driver.findElement(By.xpath("//div[@class='col-sm-12.modal-s-bottom__link']/a"));
        signup.click();
        vivek.click(signup).perform();
        WebElement name = driver.findElement(By.id("user_first_name"));
        vivek.click(name).sendKeys("ram").perform();
    }
}
