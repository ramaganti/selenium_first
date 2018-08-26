package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yourlogo {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        WebElement image = driver.findElement(By.className("img-responsive"));
        Thread.sleep(1000);
        if (image.isDisplayed()){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
        WebElement call = driver.findElement(By.className("icon-phone"));
        if (call.isDisplayed()){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        Thread.sleep(2000);
        driver.findElement(By.id("contact-link")).click();
        Thread.sleep(1000);
        WebElement wom = driver.findElement(By.linkText("Women"));
        Actions ram = new Actions(driver);
        ram.moveToElement(wom).build().perform();
        Thread.sleep(2000);
        WebElement drees = driver.findElement(By.className("sf-with-ul"));
        Actions dres = new Actions(driver);
        dres.moveToElement(drees).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.className("sf-with-ul")).click();
        Thread.sleep(1000);
        WebElement abc = driver.findElement(By.className("category-name"));
        if (abc.isDisplayed()){
            System.out.println("dress avialble");
        }else {
            System.out.println("dress is not available");
        }


    }
}
