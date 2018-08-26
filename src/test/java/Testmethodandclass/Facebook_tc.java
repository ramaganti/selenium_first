package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_tc extends Redbus_methods {

    static WebDriver driver;

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.Monsterindia.com/");
        WebElement login = Redbus_methods.findBy(driver,"id=email");
        login.sendKeys("8179717979");
        WebElement password =Redbus_methods.findBy(driver,"id=pass");
        password.sendKeys("ramrshu");
        WebElement loginbutton = Redbus_methods.findBy(driver,"id=u_0_2");
        loginbutton.click();
        String color = driver.findElement(By.id("pass")).getCssValue("colour");
        System.out.println(color);

    }
}
