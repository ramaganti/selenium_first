package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Mercury {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/mercurysignon.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("login")).click();
        WebElement check = driver.findElement(By.xpath("//input[@value='oneway']"));
        check.click();
        //driver.findElement(By.name("passCount"));
        Select paas = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
        paas.selectByIndex(3);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> pas = paas.getOptions();
        Iterator<WebElement> ran = pas.iterator();
        while (ran.hasNext()){
            System.out.println(ran.next().getText());
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("fromPort"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select lan = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        lan.selectByValue("Acapulco");
        List<WebElement> dep = lan.getOptions();
        Iterator<WebElement> itr = dep.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getText());
        }
        driver.findElement(By.name("fromMonth"));
        Select mon = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        mon.selectByVisibleText("March");
        List<WebElement> nth = mon.getOptions();
        Iterator<WebElement> tor = nth.iterator();
        while (tor.hasNext()){
            System.out.println(tor.next().getText());
        }
        driver.findElement(By.name("fromDay"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select day = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        day.selectByIndex(17);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> yad = day.getOptions();
        Iterator<WebElement> grd = yad.iterator();
        while (grd.hasNext()){
            System.out.println(grd.next().getText());
        }
        driver.findElement(By.name("toPort"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select arr = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        arr.selectByVisibleText("London");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> ari = arr.getOptions();
        Iterator<WebElement> are = ari.iterator();
        while (are.hasNext()){
            System.out.println(are.next().getText());
        }
        driver.findElement(By.name("toMonth"));
        Select s = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
        s.selectByVisibleText("November");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> sri = s.getOptions();
        Iterator<WebElement> irs = sri.iterator();
        while (irs.hasNext()){
            System.out.println(irs.next().getText());
        }

        driver.findElement(By.name("toDay"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select r = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
        r.selectByIndex(12);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> j = r.getOptions();
        Iterator<WebElement> k = j.iterator();
        while (k.hasNext()){
            System.out.println(k.next().getText());
        }
        WebElement rad = driver.findElement(By.xpath("//input[@value='Business']"));
        rad.click();
        System.out.println(rad.getText());
        driver.findElement(By.name("airline"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select li = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
        li.selectByVisibleText("Unified Airlines");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> web = li.getOptions();
        Iterator<WebElement> ele = web.iterator();
        while (ele.hasNext()){
            System.out.println(ele.next().getText());
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("findFlights")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("reserveFlights")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("passFirst0")).sendKeys("rdrjh");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("passLast0")).sendKeys("fdfa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("pass.0.meal"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select j5 = new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
        j5.selectByVisibleText("Hindu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> rana = j5.getOptions();
        Iterator<WebElement> ranak = rana.iterator();
        while (ranak.hasNext()){
            System.out.println(ranak.next().getText());
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("creditCard"));
        Select k10 = new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
        k10.selectByVisibleText("Visa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> k1 = k10.getOptions();
        Iterator<WebElement> k2 = k1.iterator();
        while (k2.hasNext()){
            System.out.println(k2.next().getText());
        }
        driver.findElement(By.name("creditnumber")).sendKeys("65465446464");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("cc_exp_dt_mn"));
        Select a1 = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
        a1.selectByIndex(11);
        List<WebElement> a2 = a1.getOptions();
        Iterator<WebElement> a3 = a2.iterator();
        while (a3.hasNext()){
            System.out.println(a3.next().getText());
        }
        driver.findElement(By.name("cc_exp_dt_yr"));
        Select q1 = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
        q1.selectByValue("2002");
        List<WebElement> z = q1.getOptions();
        Iterator <WebElement> z1 = z.iterator();
        while (z1.hasNext()){
            System.out.println(z1.next().getText());
        }
        driver.findElement(By.name("cc_frst_name"));
        driver.findElement(By.name("cc_mid_name"));
        driver.findElement(By.name("cc_last_name"));
        driver.findElement(By.name("ticketLess")).click();
        driver.findElement(By.name("billCountry"));
        Select s7 = new Select(driver.findElement(By.xpath("//select[@name='billCountry']")));
        s7.selectByVisibleText("INDIA");



    }
}
