package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Monster2 {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/");
        //source
        driver.findElement(By.id("src")).sendKeys("ravulapalem");
        driver.findElement(By.xpath("//ul[@class='autoFill']/li[1]")).click();
        //destination
        driver.findElement(By.id("dest")).sendKeys("bangalore");
        driver.findElement(By.xpath("//ul[@class='autoFill']/li[1]")).click();

        Thread.sleep(5000);
        // to click on date
        driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
        WebElement datebox = driver.findElement(By.xpath("//div[@class='rb-calendar']/table/tbody/tr[4]/td[1]"));
        datebox.click();
        driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
        // clicking on search
       driver.findElement(By.id("search_btn")).click();
       // to get date
        WebElement date = driver.findElement(By.xpath("//input[@class='searchDate']"));
        String dateDay1 = date.getAttribute("value");
       // sorting fare
       driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
       // lowest rate
        //WebElement fare = driver.findElement(By.xpath("(//div[contains(text(),'INR 1300')])[1]"));
        //System.out.println(fare.getText());
         String date7 = "(//div[@class='fare'])[1]";
         String tdate = driver.findElement(By.xpath(date7)).getText();
         String[] Adate = tdate.split(" ");
         String idate = Adate[1];
         int ram = Integer.parseInt(idate);
         System.out.println(ram);

         Thread.sleep(3000);
         // click on next
         driver.findElement(By.xpath("//span[@class='next']")).click();
         //get date
        WebElement date1 = driver.findElement(By.xpath("//input[@class='searchDate']"));
        String dateDay2 = date1.getAttribute("value");
        // sorting fare
        driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
        // lowest rate
        //WebElement fare1 = driver.findElement(By.xpath("//div[contains(text(),'INR 1250')]"));
        //System.out.println(fare1.getText());
        String date8 = "(//div[@class='fare'])[1]";
        String t1date = driver.findElement(By.xpath(date8)).getText();
        String[] A1date = t1date.split(" ");
        String i1date = A1date[1];
        int ram1 = Integer.parseInt(i1date);
        System.out.println(ram1);

        Thread.sleep(3000);
        // click on next
        driver.findElement(By.xpath("//span[@class='next']")).click();
        //get date
        WebElement date2 = driver.findElement(By.id("searchDate_onward"));
       // System.out.println(date2.getAttribute("value"));
        String dateDay3 = date2.getAttribute("value");
        // sorting fare
        driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
        //lowest rate
        //WebElement fare2 = driver.findElement(By.xpath("//div[contains(text(),'INR 1250')]"));
        //System.out.println(fare2.getText());
        String date9 = "(//div[@class='fare'])[1]";
        String t2date = driver.findElement(By.xpath(date9)).getText();
        String[] A2date = t2date.split(" ");
        String i2date = A2date[1];
        int ram2 = Integer.parseInt(i2date);
        System.out.println(ram2);

        Thread.sleep(3000);
        // click on next
        driver.findElement(By.xpath("//span[@class='next']")).click();
        //get date
        WebElement date3 = driver.findElement(By.id("searchDate_onward"));
        String dateDay4 = date3.getAttribute("value");
        // sorting fare
        driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
        //lowest rate
        //WebElement fare3 = driver.findElement(By.xpath("//div[contains(text(),'INR 1299')]"));
        //System.out.println(fare3.getText());
        String date10 = "(//div[@class='fare'])[1]";
        String t3date = driver.findElement(By.xpath(date10)).getText();
        String[] A3date = t3date.split(" ");
        String i3date = A3date[1];
        int ram3 = Integer.parseInt(i3date);
        System.out.println(ram3);

        Thread.sleep(3000);
        // click on next
        driver.findElement(By.xpath("//span[@class='next']")).click();
        //get date
        WebElement date4 = driver.findElement(By.id("searchDate_onward"));
        String dateDay5 = date4.getAttribute("value");
        // sorting fare
        driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
        //lowest rate
        //WebElement fare4 = driver.findElement(By.xpath("(//div[contains(text(),'INR 1300')])[1]"));
        //System.out.println(fare4.getText());
        String date11 = "(//div[@class='fare'])[1]";
        String t4date = driver.findElement(By.xpath(date11)).getText();
        String[] A4date = t4date.split(" ");
        String i4date = A4date[1];
        int ram4 = Integer.parseInt(i4date);
        System.out.println(ram4);

        Thread.sleep(3000);
        // click on next
        driver.findElement(By.xpath("//span[@class='next']")).click();
        //get date
        WebElement date5 = driver.findElement(By.id("searchDate_onward"));
        String dateDay6 = date5.getAttribute("value");
        // sorting fare
        driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
        //lowest rate
        //WebElement fare5 = driver.findElement(By.xpath("(//div[contains(text(),'INR 1300')])[1]"));
        //System.out.println(fare5.getText());
        String date12 = "(//div[@class='fare'])[1]";
        String t5date = driver.findElement(By.xpath(date12)).getText();
        String[] A5date = t5date.split(" ");
        String i5date = A5date[1];
        int ram5 = Integer.parseInt(i5date);
        System.out.println(ram5);

        Thread.sleep(3000);
        // click on next
        driver.findElement(By.xpath("//span[@class='next']")).click();
        //get date
        WebElement date6 = driver.findElement(By.id("searchDate_onward"));
        String dateDay7 = date6.getAttribute("value");
        // sorting fare
        driver.findElement(By.xpath("//a[contains(text(),'Fare')]")).click();
        //lowest rate
        //WebElement fare6 = driver.findElement(By.xpath("//div[contains(text(),'INR 1500')]"));
        //System.out.println(fare6.getText());
        String date13 = "(//div[@class='fare'])[1]";
        String t6date = driver.findElement(By.xpath(date13)).getText();
        String[] A6date = t6date.split(" ");
        String i6date = A6date[1];
        int ram6 = Integer.parseInt(i6date);
        System.out.println(ram6);

        List<Integer> rates = new ArrayList<Integer>();
        rates.add(ram);
        rates.add(ram1);
        rates.add(ram2);
        rates.add(ram3);
        rates.add(ram4);
        rates.add(ram5);
        rates.add(ram6);
        int min = rates.get(0) ;
        for (int i = 0; i <rates.size() ; i++) {
            if (rates.get(i) < min){
                min = rates.get(i);
            }
        }
        System.out.println("least value of bus is"+min);
        Map<String,Integer> busdates = new HashMap<String, Integer>();
        busdates.put(dateDay1,ram);
        busdates.put(dateDay2,ram1);
        busdates.put(dateDay3,ram2);
        busdates.put(dateDay4,ram3);
        busdates.put(dateDay5,ram4);
        busdates.put(dateDay6,ram5);
        busdates.put(dateDay7,ram6);

        System.out.println(busdates.size());
        for (Map.Entry<String,Integer> dateentry : busdates.entrySet()){
            System.out.println(dateentry.getKey()+ " " + dateentry.getValue() );
        }
       Set<String> keys = busdates.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            if (busdates.get(itr.next()) == min) {
                System.out.println("yes" + dateDay1);
                break;
            }
//        else if (busdates.get(dateDay2) == min){
//            System.out.println("yes" + dateDay2);
//        }
//        else if (busdates.get(dateDay3) == min) {
//            System.out.println("yes " + dateDay3);
//        }
//        else if (busdates.get(dateDay4) == min) {
//            System.out.println("yes" + dateDay4);
//        }
//        else if (busdates.get(dateDay5) == min) {
//            System.out.println("yes" + dateDay5);
//        }
//        else if (busdates.get(dateDay6) == min) {
//            System.out.println("yes" + dateDay6);
//        }
//        else if (busdates.get(dateDay7) == min) {
//            System.out.println("yes" + dateDay7);
//        }
            else {
                System.out.println(" price not compared to list ");
            }
        }
    }
}
