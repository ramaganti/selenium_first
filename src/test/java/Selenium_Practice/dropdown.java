package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class dropdown
    {
        static WebDriver driver;
        public static void main(String[] args)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demoqa.com/");

            WebElement r = driver.findElement(By.xpath("//div[@class='menu-widget-container']/ul/li[3]/a"));

            Actions action = new Actions(driver);

            action.click(r).perform();

            WebElement s = driver.findElement(By.xpath("//div[@id='tabs-1']/div/p"));
            action.click(s).perform();

           // WebElement p= driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e"));
            WebElement next = driver.findElement(By.linkText("Next"));
            action.click(next).perform();



        }



    }
