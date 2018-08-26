package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tours
{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/index.php");
        WebElement ram = driver.findElement(By.name("userName"));
        ram.sendKeys("mercury");
        Thread.sleep(1000);
        WebElement pwd = driver.findElement(By.name("password"));
        pwd.sendKeys("mercury");
        Thread.sleep(1000);
        WebElement sigin  = driver.findElement(By.name("login"));
        sigin.click();
        WebElement radio = driver.findElement(By.xpath("//form[@name='findflight']/table/tbody/tr[2]/td[2]/b/font/input[2]"));
        radio.click();
        WebElement pass = driver.findElement(By.name("passCount"));
        Select ramdd = new Select(pass);
        ramdd.selectByIndex(3);
        WebElement from = driver.findElement(By.name("fromPort"));
        Select promt = new Select(from);
        promt.selectByVisibleText("London");
        WebElement month = driver.findElement(By.name("fromMonth"));
        Select monthDD = new Select(month);
        monthDD.selectByValue("6");
        WebElement date = driver.findElement(By.name("fromDay"));
        Select DateDD = new Select(date);
        DateDD.selectByVisibleText("8");
        WebElement arraiv = driver.findElement(By.name("toPort"));
        Select arravDD = new Select(arraiv);
        arravDD.selectByVisibleText("New York");
        WebElement retuen = driver.findElement(By.name("toMonth"));
        Select returnDD = new Select(retuen);
        returnDD.selectByIndex(2);
        WebElement returnday = driver.findElement(By.name("toDay"));
        Select returndayDD = new Select(returnday);
        returndayDD.selectByIndex(5);
        WebElement cass = driver.findElement(By.xpath("//form[@name='findflight']/table/tbody/tr[9]/td[2]/font/font/input[2]"));
        cass.click();
        WebElement airline = driver.findElement(By.name("airline"));
        Select airdd = new Select(airline);
        airdd.selectByVisibleText("No Preference");
        Thread.sleep(1000);
        WebElement contin = driver.findElement(By.name("findFlights"));
        contin.click();
        Thread.sleep(1000);
        WebElement ticket = driver.findElement(By.name("reserveFlights"));
        ticket.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.name("passFirst0"));
        name.sendKeys("riya");
        Thread.sleep(1000);
        WebElement lname = driver.findElement(By.name("passLast0"));
        lname.sendKeys("choudary");
        Thread.sleep(1000);
        WebElement meal = driver.findElement(By.name("pass.0.meal"));
        Select meall = new Select(meal);
        meall.selectByVisibleText("KSML");
        Thread.sleep(1000);
        WebElement cc = driver.findElement(By.name("creditCard"));
        Select credit = new Select(cc);
        credit.selectByValue("Discover");
        Thread.sleep(1000);
        WebElement number = driver.findElement(By.name("creditnumber"));
        number.sendKeys("939393939393");
        Thread.sleep(1000);
        WebElement no = driver.findElement(By.name("cc_exp_dt_mn"));
        Select numbe = new Select(no);
        numbe.selectByIndex(06);
        WebElement year = driver.findElement(By.name("cc_exp_dt_yr"));
        Select yea = new Select(year);
        yea.selectByIndex(2016);



    }
}
