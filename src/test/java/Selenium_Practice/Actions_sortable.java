package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_sortable {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/sortable/");
        Thread.sleep(5000);

        WebElement s1 = driver.findElement(By.xpath("//ul[@id='sortable']/li"));
        WebElement s4 = driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));

        Point s4class = s4.getLocation();
        int s4x = s4class.getX();
        int s4y = s4class.getY();

        System.out.println(s4x + " "+s4y);

        Actions ram_actions = new Actions(driver);
        ram_actions.clickAndHold(s1).perform();
        ram_actions.moveByOffset(s4x,s4y+20).perform();
        Thread.sleep(4000);
        ram_actions.release(s4).perform();





    }




}
