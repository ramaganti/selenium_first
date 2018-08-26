package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class2 {

    static WebDriver driver;

    public  void movetoelement (WebDriver driver,WebElement elementlocation){

        Actions action = new Actions(driver);
        action.moveToElement(elementlocation).perform();

    }

    public void click (WebDriver driver, WebElement element){

       element.click();

    }
    public void  sendKeys(WebDriver driver,WebElement element,String text){
        element.sendKeys(text);
    }

    public static void main(String[] args) throws InterruptedException {

        Actions_Class2 ac2 = new Actions_Class2();
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cartrade.com/");
        Thread.sleep(1000);
        WebElement usedcar = driver.findElement(By.xpath("//div[@class='red_mdl_mnu']/ul/li[2]/a"));
//        Actions action = new Actions(driver);
//        action.moveToElement(usedcar).perform();
        ac2.movetoelement(driver,usedcar);

        Thread.sleep(2000);
        WebElement Brand = driver.findElement(By.xpath("//div//a[contains(text(),' BY BRAND ')]"));
//        action.moveToElement(Brand).perform();
        ac2.movetoelement(driver,Brand);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Volkswagen")).click();
        driver.findElement(By.linkText("Volkswagen Polo")).click();
        driver.findElement(By.id("city_select1")).click();
        driver.findElement(By.id("serachtext")).sendKeys("bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='cty_dp_down ht_150']/ul/li")).click();
        driver.close();







    }

}
