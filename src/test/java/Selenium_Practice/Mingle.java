package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mingle {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.thoughtworks.com/mingle/?utm_campaign=agile_pm&utm_medium=quaro_ads&utm_source=quaro&utm_content=mingle_home&utm_term=");
        WebElement ram = driver.findElement(By.xpath("//div[@class='navigation-wrapper']/a"));
        System.out.println(ram);
        if (ram.isDisplayed()){
            System.out.println("its present");
        }else {
            System.out.println("its not present");
        }String link = driver.findElement(By.linkText("Features")).getText();
    if (link.equals("Features")){
        System.out.println("feature is available");
    }else {
        System.out.println("feature is not available");
    }
        driver.findElement(By.linkText("Features")).click();
        Thread.sleep(3000);
        String ram1 = driver.findElement(By.linkText("Program Management")).getText();
        if (ram1.contains("Program Management")){
            System.out.println("contains PM");
        }else{
            System.out.println("not contains pm");
        }driver.findElement(By.id("product-trial--mingle-body-trial-cta")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("admin_full_name")).sendKeys("siva");
        Thread.sleep(1000);
        driver.findElement(By.id("admin_email")).sendKeys("siva@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("admin_phone")).sendKeys("9999988888");
        Thread.sleep(1000);
        driver.findElement(By.id("company")).sendKeys("sivam kothari");
        Thread.sleep(1000);
        driver.findElement(By.id("site")).sendKeys("https//:sivamkothari.com");

        //driver.navigate().back();

    }
}
