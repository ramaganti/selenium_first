package Testmethodandclass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bookmyshow {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://in.bookmyshow.com/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='__top-cities']/ul/li[3]/a/span")).click();
        List<WebElement> pecentage = driver.findElements(By.xpath("//span[@class='__percentage _active']"));
        System.out.println(pecentage.size());
//      List<Integer> values = new ArrayList<Integer>();
        for (int i = 1; i < pecentage.size() ; i++) {
        System.out.println(pecentage.get(i).getText());
        }
        WebElement filmclick = driver.findElement(By.xpath("((//div[@class='book-button'])[2]/../div[3]/div/a)[1]"));
        System.out.println(filmclick.getText());
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        jse.executeScript("window.scrollBy(0,400)", "");
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
//        Alert textbox  = driver.switchTo().alert();
        driver.findElement(By.id("wzrk-cancel")).click();
//        textbox.dismiss();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='book-button'])[2]/a/div")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[@id='showDates']/li[2]/a/div")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        // clcik option for price range
        driver.findElement(By.xpath("//div[contains(text(),'Filter Price Range')]")).click();
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[@id='filterPrice']/li[3]")).click();
        //clcik for show timings
       WebElement ww = driver.findElement(By.xpath("//div[contains(text(),'Filter Show Timings')]"));
        WebElement showtime = driver.findElement(By.xpath("//label[@for='filter-evening']"));
        Actions action = new Actions(driver);
        action.moveToElement(ww).click().build().perform();
        action.moveToElement(showtime).click().build().perform();
        //showtime.click();

        List<WebElement> timings = driver.findElements(By.xpath("//div[@class='body ']/div[2]/a"));
        for (int i = 0; i <timings.size() ; i++) {
            System.out.println(timings.get(i).getText());
        }
        List<Double> showtimings = new ArrayList<Double>();
        String xpath = "//div[@data-online='Y' and not(@class='_none')]/a";
        Thread.sleep(5000);
        String timing = "";
        List<WebElement> newtimings = driver.findElements(By.xpath(xpath));
        for (int i = 0; i <newtimings.size() ; i++) {
            timing = newtimings.get(i).getText();
            System.out.println(timing);
            String[] timesplit = timing.split(" ");
            String time = timesplit[0].replace(":", ".");
            System.out.println(time);
            double timeis = Double.valueOf(time);
            showtimings.add(timeis);
            System.out.println(timeis);
        }


    }
}
