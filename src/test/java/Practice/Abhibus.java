package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
        Thread.sleep(1000);
        driver.findElement(By.className("open")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Getnew_click")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("reg_FName")).sendKeys("siva");
        Thread.sleep(1000);
        driver.findElement(By.id("reg_LName")).sendKeys("adabaa" );
        Thread.sleep(1000);
        driver.findElement(By.id("reg_EmailID")).sendKeys("siva@gmail.com" + Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("reg_Mobile")).sendKeys("9191913333" + Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("")).sendKeys("j1414" + Keys.TAB);
        Thread.sleep(1000);
        driver.findElement(By.id("conf_LoginPassword")).sendKeys("j1414" + Keys.TAB);
        Thread.sleep(5000);
        driver.findElement(By.linkText("Back to Sign in ")).click();
        //Thread.sleep(1000);
    }

}
