package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Tours_tc extends Redbus_methods {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        Tours_tc tc = new Tours_tc();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/index.php");
        WebElement ram = Redbus_methods.findBy(driver,"name=userName");
        ram.sendKeys("mercury");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement pwd = Redbus_methods.findBy(driver,"name=password");
        pwd.sendKeys("mercury");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sigin = Redbus_methods.findBy(driver,"name=login");
        sigin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement radio = Redbus_methods.findBy(driver,"xpath=//form[@name='findflight']/table/tbody/tr[2]/td[2]/b/font/input[2]");
        radio.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement pass = Redbus_methods.findBy(driver,"name=passCount");
        //Select ramdd = new Select(pass);
        //ramdd.selectByIndex(3);
           // tc.Select(pass,driver);
        WebElement from = Redbus_methods.findBy(driver,"name=fromPort");
//        Select promt = new Select(from);
//        promt.selectByVisibleText("London");
       // tc.Select1(from,driver);
        WebElement month = Redbus_methods.findBy(driver,"name=fromMonth");
//        Select monthDD = new Select(month);
//        monthDD.selectByValue("6");
       // tc.Select2(month,driver);
        WebElement date = Redbus_methods.findBy(driver,"name=fromDay");
        Select DateDD = new Select(date);
        DateDD.selectByVisibleText("8");
        WebElement arraiv = Redbus_methods.findBy(driver,"name=toPort");
        Select arravDD = new Select(arraiv);
        arravDD.selectByVisibleText("New York");
        WebElement retuen = Redbus_methods.findBy(driver,"name=toMonth");
        Select returnDD = new Select(retuen);
        returnDD.selectByIndex(2);
        WebElement returnday = Redbus_methods.findBy(driver,"name=toDay");
        Select returndayDD = new Select(returnday);
        returndayDD.selectByIndex(5);
        WebElement cass = Redbus_methods.findBy(driver,"xpath=//form[@name='findflight']/table/tbody/tr[9]/td[2]/font/font/input[2]");
        cass.click();
        WebElement airline = driver.findElement(By.name("airline"));
        Select airdd = new Select(airline);
        airdd.selectByVisibleText("No Preference");
        Thread.sleep(1000);
        WebElement contin = driver.findElement(By.name("findFlights"));
        contin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ticket = driver.findElement(By.name("reserveFlights"));
        ticket.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement name = Redbus_methods.findBy(driver,"name=passFirst0");
        name.sendKeys("riya");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement lname = Redbus_methods.findBy(driver,"name=passLast0");
        lname.sendKeys("choudary");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement meal = driver.findElement(By.name("pass.0.meal"));
        Select meall = new Select(meal);
        meall.selectByVisibleText("KSML");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cc = driver.findElement(By.name("creditCard"));
        Select credit = new Select(cc);
        credit.selectByValue("Discover");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement number = driver.findElement(By.name("creditnumber"));
        number.sendKeys("939393939393");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement no = driver.findElement(By.name("cc_exp_dt_mn"));
        Select numbe = new Select(no);
        numbe.selectByIndex(06);
        WebElement year = driver.findElement(By.name("cc_exp_dt_yr"));
        Select yea = new Select(year);
        yea.selectByIndex(2016);
    }
    }
