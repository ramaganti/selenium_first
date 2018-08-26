package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dynamictavblex1 {

    static WebDriver driver;
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
        // No.of coloumns
        List<WebElement> tab = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("No.of coloumns are :" + tab.size());
        // No.of Rows
        List<WebElement> row = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println(" No.of rows ------> " + row.size()  );



    }

}
