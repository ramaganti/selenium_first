package Testmethodandclass;

import Selenium_Practice.PILGRIMAGESTC;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Redbushotels {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        PILGRIMAGESTC buses = new PILGRIMAGESTC();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/hotels/");
        driver.findElement(By.id("search_key")).click();
        driver.findElement(By.xpath("(//small[@class='location'])[1]")).click();
        driver.findElement(By.xpath("(//table[@class='rb-monthTable first last'])[2]/tbody/tr[4]/td[6]")).click();
        driver.findElement(By.xpath("(//table[@class='rb-monthTable first last'])[2]/tbody/tr[5]/td[1]")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//label[text()='Rooms']/following-sibling::select"));
        Select select= new Select(element);
        select.selectByIndex(0);
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//label[text()='Adults']/following-sibling::select"));
        Select select1= new Select(element1);
        select1.selectByIndex(1);
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//label[text()='Children']/following-sibling::select"));
        Select select2 = new Select(element2);
        select2.selectByIndex(0);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("search_hotel")).click();
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.xpath("//span[@class='mnp-price']"));
        System.out.println(text.getText());

        Thread.sleep(1000);
        driver.findElement(By.id("h_search")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[contains(text(),'Rs 1001 - 3000')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("h_search")).click();
        List<Integer> rates = new ArrayList<Integer>();
        for (int i = 1; i < 21; i++) {
            String xpath = "(//span[@class='mnp-price'])[" + i + "]";
            Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,300)");
            String xpath1 = driver.findElement(By.xpath(xpath)).getText();
            int ram = Integer.parseInt(xpath1);
            System.out.println(ram);
            rates.add(ram);
        }
            int count = rates.get(0);
        for (int i = 0; i <rates.size() ; i++) {
            if (rates.get(i)<count){
                count = rates.get(i);
            }
        }
        System.out.println("Lowest rate in thsi date is : " + count);
        WebElement element3 = driver.findElement(By.xpath("(//span[@class='pric'])[11]/../../../../div/div/div/a"));
        System.out.println(element3.getText());

        List<WebElement> hotels = driver.findElements(By.xpath("(//a[@class='gtm-hotel-name'])"));
        System.out.println(hotels.size());
        for (int i=0;i<hotels.size();i++){
           System.out.println( hotels.get(i).getText());
        }


            }
        }