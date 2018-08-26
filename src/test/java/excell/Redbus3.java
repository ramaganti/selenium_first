package excell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Redbus3 {
    static WebDriver driver;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("src")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("src")).sendKeys("Bangalore");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement bname = driver.findElement(By.xpath("//ul[@class='autoFill']/li[1]"));
        bname.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.id("dest")).click();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("dest")).sendKeys("Tanuku");
       WebElement dname = driver.findElement(By.xpath("//ul[@class='autoFill']/li[1]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       dname.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody//tr[4]/td[5]")).click();
        //driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr/td[3]")).click();
       // driver.findElement(By.id("onward_cal")).click();
      // WebElement dpicker = driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[4]/td"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("search_btn")).click();
//        driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody//tr[4]/td[1]")).click();
        List<String> oneweek = new ArrayList<String>();
//        for (int i = 1 ; i < 8 ; i++) {
//            driver.findElement(By.xpath("//i[@class='icon icon-right']")).click();
//            String ram = "//input[@id='searchDate_onward']";
//            String xpath = driver.findElement(By.xpath(ram)).getAttribute("value");
//            //System.out.println(xpath);
//            oneweek.add(xpath);
//
//        }
       // System.out.println(oneweek);

//        WebElement ram = driver.findElement(By.xpath("//div[text()='Komitla Travels ']/following::div[4]/following-sibling::div[3]/div/div"));
//        System.out.println(ram.getText());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<Integer> fare = new ArrayList<Integer>();
        for (int i = 1; i < 8 ; i++) {
            driver.findElement(By.xpath("//i[@class='icon icon-right']")).click();
            String rama = "//input[@id='searchDate_onward']";
            String xpath = driver.findElement(By.xpath(rama)).getAttribute("value");
            //System.out.println(xpath);
            oneweek.add(xpath);
            String fares = "//div[text()='Komitla Travels ']/following::div[4]/following-sibling::div[3]/div/div";
            String xpath1 = driver.findElement(By.xpath(fares)).getText();
           // System.out.println(xpath1);
            String[] split = xpath1.split(" ");
            String first = split[1];
           // System.out.println(first);
            int values = Integer.parseInt(first);
            //System.out.println(values);
            fare.add(values);
        }
        System.out.println(fare);

        Map<String,Integer> date = new HashMap<String, Integer>();

//        Integer put = fare.get(oneweek,fare);

//        date.put("03-April-2018",1199);
//        date.put("04-April-2018",1199);
//        date.put("05-April-2018",1199);
        for (int i = 0; i < oneweek.size(); i++){
            date.put(oneweek.get(i),fare.get(i));
        }

        System.out.println(date);


        //System.out.println("Date of redbus" + oneweek );

        //WebElement fare = driver.findElement(By.xpath("//div[text()='Komitla Travels ']/following::div[4]/following-sibling::div[3]/div/div"));
        //System.out.println(fare.getText());

    }
}
