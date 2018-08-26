package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Randomselect {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/registration/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//select[@id='dropdown_7']"));
        Select select = new Select(element);
        List<WebElement> country = select.getOptions();
        Random random = new Random();
        int randomelement = random.nextInt(country.size());
        Thread.sleep(3000);
        select.selectByIndex(randomelement);

        EventFiringWebDriver eventhandler = new EventFiringWebDriver(driver);


    }
}
