package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Yaatra {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js= (JavascriptExecutor)driver;
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("BE_flight_origin_city")).click();
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("B");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("a");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("n");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("g");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("a");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("l");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("o");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("r");
        driver.findElement(By.id("BE_flight_origin_city")).sendKeys("e");
    Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ac_airport']")).click();
        driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Delhi");
        driver.findElement(By.id("BE_flight_origin_date")).click();
        driver.findElement(By.id("10/05/2018")).click();
        driver.findElement(By.id("BE_flight_paxInfoBox")).click();
        driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='ripple-parent search-height']/input")).click();
        Thread.sleep(3000);
        for (int i = 1; i < 25; i++) {
            String xpath = "(//span[@class='time-color normal'])["+i+"]";
            Thread.sleep(2000);
            String xpath1 = driver.findElement(By.xpath(xpath)).getText();
            System.out.println(xpath1);
            String time = ""+xpath1.charAt(0)+xpath1.charAt(1)+'.'+xpath1.charAt(4)+xpath1.charAt(5);
            System.out.println(time);

        }
    }
}
