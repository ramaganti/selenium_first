package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class wolksvagen

    {
        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.volkswagen.co.in/en.html");
            Thread.sleep(1000);

            driver.findElement(By.id("vw_m501_logo_img")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("_Pfad_")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("selStates")).click();
            Thread.sleep(1000);
            WebElement stete = driver.findElement(By.id("selStates"));
            Select state = new Select(stete);
            state.selectByVisibleText("Andhra Pradesh");
            Thread.sleep(1000);
            driver.findElement(By.id("selCities")).click();
            Thread.sleep(1000);
            WebElement cety =driver.findElement(By.id("selCities"));
            Select city = new Select(cety);
            city.selectByValue("8");
            Thread.sleep(1000);
            driver.findElement(By.id("selFormat")).click();
            WebElement salformat = driver.findElement(By.id("selFormat"));
            Select silformat = new Select(salformat);
            silformat.selectByValue("1");
            Thread.sleep(1000);
            //driver.findElement(By.xpath("//div[@class='main_warper']/div/a")).click();
            //Thread.sleep(2000);
           // driver.findElement(By.id("view_map_btn view_map_btn1")).click();
            //Thread.sleep(1000);
            driver.findElement(By.className("vw_m502_icon")).click();
            driver.findElement(By.id("bddb51e4404468f4ca5542266b1568ca")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@class='vw_m511_nav col-sm-12']/ul/li/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.className("vw_m158_icon_holder ")).click();
            //driver.findElement(By.className("vw_m410_pagination vw_pagination_arrow__right")).click();
            Thread.sleep(2000);
            for (int i = 0;i <= 5; i++) {


                driver.findElement(By.xpath("//a[contains(@class,'vw_pagination_arrow__right')]")).click();
                Thread.sleep(1000);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@id='powerLayer']/div/a/div")).click();
            driver.findElement(By.xpath("//div[@class='vw_m511_menu_content']/div/ul/li[2]/a")).click();
            //driver.findElement(By.xpath("//div//a[contains(text(),'vw_m410_pagination vw_pagination_arrow__right')]")).click();

        }
}
