package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class redbus {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://www.redbus.in/");
        Thread.sleep(1000);
        driver.findElement(By.id("src")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("src")).sendKeys("Delhi");
        //To Print Number of Options.
        Thread.sleep(2000);
        List<WebElement> DDsize = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        System.out.println(DDsize.size());
        //To Print Options
        for (int i = 0; i < DDsize.size(); i++) {

            System.out.println(DDsize.get(i).getText());
        }
        //Actions delhi = new Actions(driver);
        driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
        System.out.println("----------------------------");
        Thread.sleep(2000);
        driver.findElement(By.id("dest")).sendKeys("Hyderabad");
        Thread.sleep(1000);
        List<WebElement> DDtime = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        System.out.println(DDtime.size());
        //To print optons
        for (int i = 0; i < DDtime.size(); i++) {

            System.out.println("loacation " + DDtime.get(i).getText());

        }
        Thread.sleep(1000);
        Actions stop = new Actions(driver);
        driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
//        //driver.findElement(By.xpath("//div[contains(@id,'rb-calendar_onward_cal')]/table/tbody/tr[7]/td[3]")).click();
//        driver.findElement(By.xpath("(//td[contains(@class,'current day')])[2]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-returnCalendar']/div/label")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td[3]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr[6]/td[5]")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("search_btn")).click();
//        driver.navigate().back();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        // To take screen shot for a testcase
//       // File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        //com.sun.jna.platform.FileUtils.copyFile(ss,new File("c:\\tmp\\screenshot.png"));
//        //FileUtils.copyFile(ss, new File("c:\\tmp\\screenshot.png"));
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.id("i-icon-profile")).click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.id("signInLink")).click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        // Switching to frame
//        // when ever we are trying to clicking signin, that sign button is inn frame
//        // so we have to write switch to frame code  for this signin option
//        WebElement frame = driver.findElement(By.xpath("(   //iframe[@class='modalIframe'])"));
//        driver.switchTo().frame(frame);
//        driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[3]/div[8]/span[2]/a")).click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.navigate().back();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div[@class='modalFrame']/div[2]/i")).click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.id("geolocation_chosen")).click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[contains(text(),'Andhra Pradesh')]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("support-options")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("chat-with-us-option")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //driver.findElement(By.xpath(By.cssSelector("[type='customername'].input").
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("emailid")).sendKeys("sarath767@gmail.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("phonenumber")).sendKeys("9206522554");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select sara = new Select(driver.findElement(By.id("parent")));
        sara.selectByVisibleText("Wallet");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("childDropDown")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("discription")).sendKeys("hi this is sarath please call me to my number  i lost lot of money in your red bus");








    }
}
