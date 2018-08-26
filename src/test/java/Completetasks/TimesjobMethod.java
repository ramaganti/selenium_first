package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TimesjobMethod {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.timesjobs.com/employer/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//ul[@class='nav-before-login']/li[2]")).click();
        driver.findElement(By.id("emailAdd")).sendKeys("ramreshu1318@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("R79797979");
        driver.findElement(By.id("retypePassword")).sendKeys("R79797979");
        driver.findElement(By.id("mobNumber")).sendKeys("9394333345");
        driver.findElement(By.id("defLabelSpnId")).click();
        //sending domain name
        driver.findElement(By.xpath("//div[@class='ui-multiselect-filter']/input")).sendKeys("it software");
        // select domain
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),' IT Software - Quality Management/ Testing')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        element.click();
        // Experience year
        driver.findElement(By.id("cboWorkExpYear")).sendKeys("2");
        // month
        driver.findElement(By.id("cboWorkExpMonth")).sendKeys("5");
        Thread.sleep(2000);
        // location
        WebElement element1 = driver.findElement(By.xpath("(//div[@class='rhs_inptcol'])[4]/select"));
        Select s1 = new Select(element1);
        s1.selectByVisibleText("Bengaluru/ Bangalore");
        Thread.sleep(5000);
        WebElement element3 = driver.findElement(By.name("resumeFile_basic"));
        Thread.sleep(5000);
        element3.sendKeys("C:\\Users\\RAM\\Downloads\\ramselenium.doc");
        Thread.sleep(5000);
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0,1000)","");
        //driver.findElement(By.id("basicSubmit")).click();
        Thread.sleep(5000);

            WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Continue >>')]"));
//        Actions act = new Actions(driver);
//        act.moveToElement(button).perform();
//        button.click();
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", button);
            Thread.sleep(2000);
            driver.findElement(By.id("name")).click();
        driver.findElement(By.id("defLabelSpnId")).click();
        //sending domain name
        driver.findElement(By.xpath("//div[@class='ui-multiselect-filter']/input")).sendKeys("it software");
        // select domain
        Thread.sleep(5000);
        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),' IT Software - Quality Management/ Testing')]"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(element2).perform();
        element2.click();
        // salary
        driver.findElement(By.id("lacSalary")).sendKeys("2");
        driver.findElement(By.id("thousandSalary")).sendKeys("3");
        driver.findElement(By.id("curEmpName")).sendKeys("Hp Inc.");
        driver.findElement(By.id("resumeTitle")).sendKeys("ramselenium");
        driver.findElement(By.xpath("//div[@class='clearfix']/ul/li")).sendKeys("selenium");
        driver.findElement(By.xpath("//a[contains(text(),'Selenium')]")).click();


    }
}
