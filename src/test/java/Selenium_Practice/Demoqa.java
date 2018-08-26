package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("http://demoqa.com/registration/");
        Thread.sleep(1000);
        String Rehistration = driver.findElement(By.className("entry-title")).getText();
        if (Rehistration.equals("Registration")){
            System.out.println("web element registration is found");
        }String form = driver.findElement(By.id("piereg_pie_form_heading")).getText();
        if (form.equals("Registration")){
            System.out.println("registration form is found");

        }else {
            System.out.println("registration form is not found");
        } String firstname = driver.findElement(By.xpath("//div[@class='fieldset']/label")).getText();
        if (firstname.equals("First Name")){
            System.out.println("first name is found");
        }else{
            System.out.println("first name is not found ");
            Thread.sleep(1000);
        } driver.findElement(By.id("name_3_firstname")).sendKeys("ram");
        String lastname = driver.findElement(By.xpath("//div[@class='fieldset_child']/label")).getText();
        if (lastname.equals("Last Name")){
            System.out.println("lastname is found");
        }else {
            System.out.println("last name is not found");
        } driver.findElement(By.id("name_3_lastname")).sendKeys("ganti");
       // lastname wait = new ra(driver) .withTimeout(30, SECONDS.pollingEvery(5, SECONDS);
        String marital = driver.findElement(By.xpath("//li[@class='fields pageFields_1 '][2]/div/label")).getText();
        if (marital.equals("Marital Status")){
            System.out.println("marital status is found");
        }else {
            System.out.println("marital status is not found");
        String sing = driver.findElement(By.linkText("Single")).getText();
        if (sing.equals("single")){
            System.out.println("singel is found");
        } else {
            System.out.println("single is not found");
        }

        }


    }
}
