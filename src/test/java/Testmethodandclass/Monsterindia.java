package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Monsterindia {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.monsterindia.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Set<String> element = driver.getWindowHandles();
        Iterator<String> itr = element.iterator();
         String window1 = itr.next();
         String window2 = itr.next();
         driver.switchTo().window(window2);
         driver.getCurrentUrl();
         driver.close();
         driver.switchTo().window(window1);
         driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
         WebElement colour = driver.findElement(By.id("firstName_id"));
        System.out.println(colour.getCssValue("color"));
         driver.findElement(By.id("firstName_id")).sendKeys("innovative");
        driver.findElement(By.id("lastName_id")).click();
        WebElement cloure = driver.findElement(By.id("lastName_id"));
        System.out.println(cloure.getCssValue("color"));
        driver.findElement(By.id("lastName_id")).sendKeys("complex");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("innovative99@gmail.com");
        driver.findElement(By.id("passwd_id")).sendKeys("innovative");
        WebElement element1 = driver.findElement(By.xpath("(//div[@class='innr'])[5]"));
        System.out.println("warning class" + element1.getText());
        driver.findElement(By.id("s2id_location")).click();
        driver.findElement(By.id("s2id_autogen1_search")).sendKeys("bengaluru");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("s2id_autogen1_search")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.id("mobile2")).sendKeys("9949134851");
        driver.findElement(By.id("expYrMonth")).click();
        driver.findElement(By.xpath("//label[@for='exp_year2']")).click();
        driver.findElement(By.xpath("//label[@for='exp_month4']")).click();
        driver.findElement(By.id("expYrMonth")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("skills")).sendKeys("Auto");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[contains(text(),'Automation Tester')]")).click();
        driver.findElement(By.id("ind_value")).click();
        driver.findElement(By.id("ind_typeahead")).sendKeys("it");
        driver.findElement(By.xpath("//div[contains(text(),'IT/ Computers - Software')]")).click();
        driver.findElement(By.id("ind_value")).click();
        driver.findElement(By.id("cat_value")).click();
        driver.findElement(By.id("cat_typeahead")).sendKeys("it");
        driver.findElement(By.id("other_cat_22_check")).click();
        driver.findElement(By.id("cat_value")).click();
        driver.findElement(By.id("continue")).click();







    }
}
