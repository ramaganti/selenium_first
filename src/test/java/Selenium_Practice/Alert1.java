package Selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("http://chercher.tech/java/custom-locators-selenium-webdriver");
        driver.findElement(By.xpath("//div[@class='row']/div/div/p/button")).click();
        Thread.sleep(3000);
        Alert ram = driver.switchTo().alert();
        System.out.println(ram.getText());
        ram.dismiss();
        driver.findElement(By.xpath("//div[@class='row']/div/div/p[2]/input")).click();
        Alert vivek = driver.switchTo().alert();
        System.out.println(vivek.getText());
        vivek.dismiss();
        driver.findElement(By.xpath("//div[@class='row']/div/div/p[3]/input")).click();
        Alert nanda = driver.switchTo().alert();
        System.out.println(nanda.getText());
        nanda.dismiss();

    }
}
