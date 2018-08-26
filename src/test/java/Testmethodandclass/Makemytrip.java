package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Makemytrip {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.makemytrip.com/cabs/");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        // source from
        driver.findElement(By.id("hp-widget__sfrom")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("hp-widget__sfrom")).sendKeys("banagalore");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Bangalore, Karnataka, India')]")).click();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        // to destination
        driver.findElement(By.id("hp-widget__sTo")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("hp-widget__sTo")).sendKeys("Mysuru");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Mysuru, Karnataka, India')]")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        Thread.sleep(5000);
        //depart date
        driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]/tbody/tr[3]/td[3]/a")).click();
        driver.findElement(By.id("hp-widget__return")).click();
        Thread.sleep(5000);

        // return date
        driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[3]/tbody/tr[3]/td[7]/a")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        WebElement time = driver.findElement(By.xpath("//div[@class='hp-widget__advSearch']/div/select"));
        Select intime = new Select(time);
        intime.selectByVisibleText("6:00 AM");
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("aClose")).click();
        List<WebElement> carprice = driver.findElements(By.xpath("//span[@mt-id='car_price']"));
        int count = 0;
        List<Integer> leastprice = new ArrayList<Integer>();
        for (int i = 0; i <carprice.size() ; i++) {
            System.out.println(carprice.get(i).getText());
                String xpath = "//span[@mt-id='car_price']";
                String rate = driver.findElement(By.xpath(xpath)).getText();
                int carrent = Integer.parseInt(rate);
                leastprice.add(carrent);
            }
        for (int i = 0; i <leastprice.size() ; i++) {
            if (leastprice.get(i)>count){
                count = leastprice.get(i);
            }
        }
        System.out.println("least price"+count);
        WebElement carmodel = driver.findElement(By.xpath("(//span[@mt-id='car_price'])[1]/../../../div/p[3]/span"));
        System.out.println(carmodel.getText());
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'SELECT CAB')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("txtPickupLocation")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.id("txtPickupLocation")).sendKeys("Marthahalli bridge");
        driver.findElement(By.id("txtFirstName")).sendKeys("Mohan");
        driver.findElement(By.id("txtLastName")).sendKeys("reddy");
        driver.findElement(By.id("txtPhoneNumber")).sendKeys("9949134851");
        driver.findElement(By.id("txtEmail")).sendKeys("mohanreddy@gmail.com");
        driver.findElement(By.xpath("//label[@class='radio']")).click();
        // checking rate equal or not
        String finalrate = "((//div[@mt-view='list_view'])[3]/p/span[2]/span[2])[2]";
        if (finalrate.equals(count)){
            System.out.println( " count equals to final rate");
        }else {
            System.out.println("not equal to final rate");
        }
        driver.findElement(By.id("aPay100")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@id='EWLT_tab']/a/span[2]")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Airtel Money')]")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.id("widgetPayBtn")).click();
        driver.findElement(By.id("usernameInput")).click();
        driver.findElement(By.id("usernameInput")).sendKeys("9949134851");
    }
}
