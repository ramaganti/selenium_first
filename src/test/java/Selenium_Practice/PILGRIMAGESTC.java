package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PILGRIMAGESTC extends PILGRIMAGESMETHOD {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        PILGRIMAGESTC buses = new PILGRIMAGESTC();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");
        PILGRIMAGESMETHOD.findBy(driver,"xpath=//a[contains(text(),'PILGRIMAGES ')]").click();
        // sending keys in source
        PILGRIMAGESMETHOD.findBy(driver,"id=source_city").sendKeys("Bangalore");
        // clicking on source name
        PILGRIMAGESMETHOD.findBy(driver,"xpath=//li[contains(text(),'Bangalore')]").click();
        Thread.sleep(3000);
        // sending keys in destination
        PILGRIMAGESMETHOD.findBy(driver,"id=dest_city").sendKeys("Tirupati");
        //clicking on destination
        PILGRIMAGESMETHOD.findBy(driver,"xpath=//li[contains(text(),'Tirupati')]").click();
        Thread.sleep(2000);
        //select date on date box
        PILGRIMAGESMETHOD.findBy(driver,"xpath=//div[@id='rb-calmiddle']/ul[2]/li[9]").click();
        Thread.sleep(2000);
        //click for no.of guests
        PILGRIMAGESMETHOD.findBy(driver,"id=guest_count").click();
        Thread.sleep(2000);
        //click no of rooms
        WebElement element = PILGRIMAGESMETHOD.findBy(driver,"xpath=//div[@class='ilbl selectbox a control']/select");
        //element.click();
        buses.select(element,0);
//        Select s = new Select(element);
//        s.selectByIndex(0);
        Thread.sleep(2000);
        //click for no of adults
        WebElement element1 = PILGRIMAGESMETHOD.findBy(driver,"xpath=(//div[@class='ilbl selectbox undefined'])[1]/select");
        //element1.click();
        buses.select(element1,1);
//        Select s1 = new Select(element1);
//        s1.selectByIndex(1);
        Thread.sleep(2000);
        // click for no of childrens
        WebElement element2 = PILGRIMAGESMETHOD.findBy(driver,"xpath=(//div[@class='ilbl selectbox undefined'])[2]/select");
        //element1.click();
        buses.select(element2,1);
//        Select s2 = new Select(element2);
//        s2.selectByIndex(1);
        //click for childrens age
        WebElement element3 = PILGRIMAGESMETHOD.findBy(driver,"xpath=//label[text()='Child 1 Age']/following-sibling::select");
        buses.select(element3,1);
//        Select s3 = new Select(element3);
//        s3.selectByIndex(1);
        PILGRIMAGESMETHOD.findBy(driver,"id=search_packages").click();
        // using action class
        WebElement action = PILGRIMAGESMETHOD.findBy(driver,"xpath=(//div[@class='dsn-name']/following-sibling::div/div[2]/button)[1]");
        buses.moveto(driver,action);
        Thread.sleep(1000);
        action.click();
        Thread.sleep(2000);
//        WebElement icon = PILGRIMAGESMETHOD.findBy(driver,"xpath=//i[@class='icon-i icon']");
//        if (icon.isDisplayed()){
//            System.out.println(" icon is displayed");
//        }else {
//            System.out.println("icon is not displayed");
//        }
        // to click on proceed
        Thread.sleep(3000);
        PILGRIMAGESMETHOD.findBy(driver,"xpath=//div[@class='info']/following-sibling::div/div[3]/button").click();
        // to click on name
        Thread.sleep(3000);
        PILGRIMAGESMETHOD.findBy(driver,"id=name_0").sendKeys("jaisreeram");

        // to clcik on age
        PILGRIMAGESMETHOD.findBy(driver,"age_0").sendKeys("age 34");
        // to get colour code of image
        WebElement colour = PILGRIMAGESMETHOD.findBy(driver,"xpath=(//div[@class='cust-header'])[1]");
        System.out.println(colour.getCssValue("color"));
        // to click on gender
        PILGRIMAGESMETHOD.findBy(driver,"xpath=(//label[@class='custom-radio'])[2]").click();
        // to get colour code of image
        WebElement clour2 = PILGRIMAGESMETHOD.findBy(driver,"xpath=(//div[@class='cust-header'])[2]");
        System.out.println(clour2.getCssValue("color"));
        // enter email
        PILGRIMAGESMETHOD.findBy(driver,"id=email").sendKeys("rajarja@gmail.com");
        // enter contact number
        PILGRIMAGESMETHOD.findBy(driver,"id=ph_num").sendKeys("989889889898");
        WebElement phonecolour = PILGRIMAGESMETHOD.findBy(driver,"xpath=//label[text()='Mobile Number']");
        phonecolour.getCssValue("color");


    }


}
