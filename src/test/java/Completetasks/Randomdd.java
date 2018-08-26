package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Randomdd {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cartrade.com/compare-cars");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> element = driver.findElements(By.xpath("(//optgroup[@label='Most Popular'])[1]/option"));
        for (int i = 0; i < element.size() ; i++) {
            System.out.println(element.get(i).getText());
        }
        Random rnumber = new Random();
        int list = rnumber.nextInt(element.size());
        Thread.sleep(3000);
        element.get(list).click();
        System.out.println();


    }
}
