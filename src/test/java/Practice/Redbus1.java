package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Redbus1 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("cCare_city")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        /*WebElement phno = driver.findElement(By.xpath("//div[@class='selectOptionscc']/ul/li[3]/label"));
        Select phone = new Select(phno);
        phone.selectByValue(    "Delhi  - 1860 200 9999");*/

        Select ram = new Select(driver.findElement(By.id("cCare_city")));
        List <WebElement> rama = ram.getOptions();
        System.out.println(rama.size());


    }
}
