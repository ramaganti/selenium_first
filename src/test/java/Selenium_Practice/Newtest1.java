package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtest1 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.seleniumeasy.com/test/");
        Thread.sleep(1000);
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='list-group']/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Simple Form Demo")).click();
        String sif = driver.findElement(By.xpath("(//div[@class='panel-heading'])[2]")).getText();
        if (sif.equals("Single Input Field")){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }driver.findElement(By.id("user-message")).sendKeys("Ram");


    }
}
