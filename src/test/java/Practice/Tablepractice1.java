package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Tablepractice1 {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.goodreturns.in/gold-rates/bangalore.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        List<String> date = new ArrayList<String>();
//        for (int i = 2; i <12 ; i++) {
//            String xpath = "(//div[@class='gold_silver_table'])[3]/table/tbody/tr["+i+"]/td[1]";
//            String dae = driver.findElement(By.xpath(xpath)).getText();
//            date.add(dae);
//        }
//        System.out.println("Adding dates into list : "+ date);
//
//        List<Integer> rates = new ArrayList<Integer>();
//        for (int i = 2; i <12 ; i++) {
//            String xpath =  "(//div[@class='gold_silver_table'])[3]/table/tbody/tr["+i+"]/td[3]";
//            String values = driver.findElement(By.xpath(xpath)).getText();
//            String[] split = values.split(" ");
//            String finaltext = split[1].replaceAll(",","");
//            int ram = Integer.parseInt(finaltext);
//            rates.add(ram);
//        }
//        System.out.println("Adding rates into a list : " + rates);
//        int max = rates.get(0);
//        int min = rates.get(0);
//        for (int i = 0; i <rates.size(); i++) {
//            if (rates.get(i) > max){
//                max = rates.get(i);
//            }
//        }
//        System.out.println("maximun value of rate: "+max);
//        for (int i = 0; i <rates.size() ; i++) {
//            if (rates.get(i) < min){
//                min = rates.get(i);
//            }
//        }
//        System.out.println("Print min value in gold rates : " + min);
//
//        int index = rates.indexOf(max);
//        int index1 = rates.indexOf(min);
//        System.out.println("index of max : " + index);
//        System.out.println("index of min : " + index1);
//        System.out.println("date of max value: " + date.get(index)+" rate : "+ max);
//        System.out.println("date of min value: " + date.get(index1)+" rate : "+ min);

        Map<String, Integer> strin = new HashMap<String, Integer>();
        for (int i = 2; i < 12; i++) {
            String xp = "(//div[@class='gold_silver_table'])[3]/table/tbody/tr["+i+"]/td[1]";
            String name = driver.findElement(By.xpath(xp)).getText();
           // String sname = name.replaceAll(",", "");("no need to use replace for a string")
            String xpath1 = "(//div[@class='gold_silver_table'])[3]/table/tbody/tr["+i+"]/td[2]";
            String rama = driver.findElement(By.xpath(xpath1)).getText();
            String[] spit = rama.split(" ");
            String tect = spit[1].replaceAll(",","");
            int value = Integer.parseInt(tect);
            strin.put(name, value);
        }
        System.out.println(strin);
        TreeMap<String,Integer> jia = new TreeMap<String, Integer>(strin);
        Iterator ram = jia.keySet().iterator();
        while (ram.hasNext()){
            Object key = ram.next();
            System.out.println("key values " + key +" "+ jia.get(key));
            //System.out.print(jia.get(key));
        }
        //Set rama = strin.keySet();
        int min;
        Iterator pay = strin.keySet().iterator();
        min = strin.get(pay.next());
        System.out.println(min);
        while (pay.hasNext()){
            Object i = pay.next();
            System.out.println("**** "+i);
            if (strin.get(i)<min){
                min = strin.get(i);
            }
        }
        System.out.println(min);


        Iterator<String> i3 = strin.keySet().iterator();

        while (i3.hasNext()) {
            String date = i3.next();
            int rate = strin.get(date);
            if (min ==  rate) {
                // min = strin.get(pay.next());
                System.out.println("Expected date is " +date + "is" + min);
                break;
            }
        }

    }
}
