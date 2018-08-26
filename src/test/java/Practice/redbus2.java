package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class redbus2 {

    static WebDriver driver;

        public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/search?fromCityName=Bangalore&fromCityId=122&toCityName=Tanuku&toCityId=321&onward=25-Mar-2018&opId=0&busType=Any");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("viewGPSBuses")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<Integer> str = new ArrayList<Integer>();
        for (int i = 1; i <= 6 ; i++) {
            String xpath = "(//div[@class='fare'])[" + i + "]";

            String name = driver.findElement(By.xpath(xpath)).getText();
            String[] bus = name.split(" ");
            String value = bus[1];
            int ram = Integer.parseInt(value);
            System.out.println(ram);
            str.add(ram);
        }

        int min = str.get(0);
        for (int i = 0; i <str.size() ; i++) {
            if (str.get(i)<min){
                min = str.get(0);
            }
        }
        System.out.println("Least value is : " + min);


//        }
        System.out.println("--------------------------");
        List<String> bname = new ArrayList<String>();
       // List<WebElement> Tname = driver.findElements(By.xpath("//div[@class='service-name']"));
        for (int i = 1; i <= 6 ; i++) {
            String name = "(//div[@class='service-name'])["+i+"]";
            String buss = driver.findElement(By.xpath(name)).getText();
            bname.add(buss);
        }
        System.out.println(bname);
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.id("viewGPSBuses")).click();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.className("modify")).click();+

        int ram = str.indexOf(min);
        System.out.println("index of min is : " + ram);
        System.out.println("Date if of min : " + bname.get(ram) + "rate is : " + min);

    }
}

