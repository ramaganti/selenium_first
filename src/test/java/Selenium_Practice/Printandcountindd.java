package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class Printandcountindd {
    static WebDriver driver;
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etihad.com/en-in/plan-and-book/multi-city-booking/");
        driver.findElement(By.id("passengers-adults"));
        Select s = new Select(driver.findElement(By.xpath("//div[@class='controls select inline passengersAdults']/select")));
        s.selectByValue("5");
        //List<WebElement> re = driver.findElements(By.xpath("//div[@class='controls select inline passengersAdults']/select/option"));
        List<WebElement> re = s.getOptions();
        Iterator<WebElement> it = re.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getText());
        }
        System.out.println(re.size());


    }

}
