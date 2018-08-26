package Selenium_Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Onlydropdowns {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.cartrade.com/compare-cars");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select s1= new Select(driver.findElement(By.xpath("//div[@class='pull-left']/div/select")));
        s1.selectByValue("BMW");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select s2 = new Select(driver.findElement(By.xpath("//div[@class='pull-left']/div/select[2]")));
        s2.selectByVisibleText("i8");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select s3 = new Select(driver.findElement(By.xpath("//div[@class='pull-left']/div/select[3]")));
        s3.selectByValue("3183");

        WebElement dd = driver.findElement(By.xpath("//div[@class='pull-left']/div/select[3]"));
        Point location = dd.getLocation();
        int x = location.getY();
        System.out.println(x);

        WebElement dd1 = driver.findElement(By.xpath("//div[@class='pull-left']/div/select[1]"));
        Point location1 = dd.getLocation();
        int x1 = location1.getY();
        System.out.println(x1);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        Long value = (Long) executor.executeScript("return window.pageYOffset");
        System.out.println(value);

        //executor.executeScript("window.scrollTo(0,document.body.scrollHight)");

        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        Long value1 = (Long) executor.executeScript("return window.pageYOffset");
        System.out.println(value1);










    }
}
