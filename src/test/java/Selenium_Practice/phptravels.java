package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class phptravels
{
    static WebDriver driver;

     public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://phptravels.org/clientarea.php");
         Thread.sleep(1000);

         WebElement Phptravels = driver.findElement(By.xpath("//div[@class=\"container\"]/ul/li[3]/a"));

         Actions ram = new Actions(driver);

         ram.click(Phptravels).perform();
         WebElement name = driver.findElement(By.id("inputFirstName"));
         ram.click(name).sendKeys("ram").build().perform();
         Thread.sleep(2000);
         WebElement lname = driver.findElement(By.name("lastname"));
         ram.click(lname).sendKeys("reshma").sendKeys(Keys.ENTER).build().perform();
         WebElement mail = driver.findElement(By.name("email"));
         ram.click(mail).sendKeys("phptravels@gmail.com").sendKeys(Keys.ENTER).build().perform();
         Thread.sleep(1000);
         WebElement std = driver.findElement(By.className("flag-container"));
         ram.click(std).perform();
         Thread.sleep(1000);
         ram.click(driver.findElement(By.xpath("//span[contains(text(),'+91')]"))).perform();
         Thread.sleep(1000);
         WebElement no =driver.findElement(By.id("inputPhone"));
         ram.click(no).sendKeys("8179717979").build().perform();
         Thread.sleep(1000);
         WebElement optional = driver.findElement(By.id("inputCompanyName"));
         ram.click(optional).sendKeys("romeo factory").build().perform();
         Thread.sleep(1000);
         WebElement address = driver.findElement(By.id("inputAddress1"));
         ram.click(address).sendKeys("banglore").build().perform();
         Thread.sleep(1000);
         WebElement address2 = driver.findElement(By.id("inputAddress2"));
         ram.click(address2).sendKeys("karnataka").build().perform();
         Thread.sleep(1000);
         WebElement city = driver.findElement(By.id("inputCity"));
         ram.click(city).sendKeys("banglore").build().perform();
         Thread.sleep(1000);
         WebElement state = driver.findElement(By.id("stateinput"));
         ram.click(state).sendKeys("karnataka").build().perform();
         Thread.sleep(1000);
         WebElement pin = driver.findElement(By.id("inputPostcode"));
         ram.click(pin).sendKeys("560037").build().perform();
         Thread.sleep(1000);
         WebElement country = driver.findElement(By.id("inputCountry"));
         Select ramselect2 = new Select(country);
         ramselect2.selectByIndex(6);
         Thread.sleep(1000);
         WebElement find = driver.findElement(By.id("customfield1"));
         Select reshu = new Select(find);
         reshu.selectByValue("Bing");
         Thread.sleep(1000);
         WebElement phone = driver.findElement(By.id("customfield2"));
         ram.click(phone).sendKeys("9898068680").build().perform();
         Thread.sleep(1000);
         WebElement pwd = driver.findElement(By.id("inputNewPassword1"));
         ram.click(pwd).sendKeys("1234").build().perform();
         Thread.sleep(1000);
         WebElement pwd2 = driver.findElement(By.id("inputNewPassword2"));
         ram.click(pwd2).sendKeys("1234").build().perform();





     }
}
