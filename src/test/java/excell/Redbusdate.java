package excell;

import Practice.SeleniumCom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Redbusdate extends SeleniumCom {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/search?fromCityName=Bangalore&fromCityId=122&" +
                "toCityName=Tanuku&toCityId=321&onward=06-Apr-2018&opId=0&busType=Any");
//        WebElement date = driver.findElement(By.xpath("//input[@id='searchDate_onward']"));
////        System.out.println(date.getAttribute("value"));
//      //  System.out.println("------------------------------------------------------");
        List<String> Toursname = new ArrayList<String>();
        for (int i = 1 ; i < 13 ; i++) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String xpath = "(//div[@class='service-name'])[" +i+ "]";
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //String travels = driver.findElement(By.xpath(xpath)).getText();
            String travels = SeleniumCom.findXpath(driver,xpath).getText();
            System.out.println(travels);
            Toursname.add(travels);
        }
//       // System.out.println(Toursname);
//        Map<String, Integer> travelname = new HashMap<String, Integer>();
//        for (int i = 1; i < Toursname.size(); i++) {
//            if (travelname.containsKey(Toursname.get(i))) {
//                travelname.put(Toursname.get(i), travelname.get(Toursname.get(i)) + 1);
//            }else {
//                travelname.put(Toursname.get(i),1);
//            }
//        }System.out.println(travelname);
       // WebElement date = driver.findElement(By.xpath(""))

        WebElement ram = driver.findElement(By.xpath("//div[@class='fl seats']"));
      //  System.out.println(ram.getText());

        List<Integer> seats = new ArrayList<Integer>();
        for (int i = 1; i <13 ; i++) {
            String xpath = "(//div[@class='fl seats'])["+i+"]";
            String path = SeleniumCom.findXpath(driver,xpath).getText();
           // System.out.println("getting strings : "+path);
            String[] noofs = path.split(" ");
            String s = noofs[0];
            //System.out.println("split of index 0 :" + s);
            int rama = Integer.parseInt(s);
            seats.add(rama);
        }
         System.out.println("adding elements to emptylist : "+seats);
        int min = seats.get(0);
        for (int i = 0; i <seats.size() ; i++) {

            if (seats.get(i) < min) {
                min = seats.get(i);
            }

        }System.out.println("least seats : " + min  + "index of min : " + seats.indexOf(min)  );
        System.out.println("least seats available in bus is : " + Toursname.get(seats.indexOf(min)) + ", No.of seats : " + min);
 }
}
