package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Redbus_1 {
    static WebDriver driver;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in/search?fromCityName=Bangalore&fromCityId=122&toCityName=Rameswaram&toCityId=496&onward=30-Mar-2018&opId=0&busType=Any");
       // WebElement element = driver.findElement(By.xpath("(//div[@class='fare'])[1]"));
        //System.out.println(element.getText());
        List<Integer> red = new ArrayList<Integer>();

        for (int i = 1; i < 5 ; i++) {

            String xpath = "(//div[@class='fare'])[" + i + "]";
            String index = driver.findElement(By.xpath(xpath)).getText();
            String[] split = index.split(" ");
            String split1 = split[1];
            int convert = Integer.parseInt(split1);
            //System.out.println(convert);
            Collections.sort(red);

            red.add(convert);
            System.out.println(red);

        }
        driver.findElement(By.xpath("//li[@class='fl sort-type Fare']/a")).click();

        List<Integer> Sort = new ArrayList<Integer>();
        for (int i = 1; i < 5 ; i++) {
            String bus = "(//div[@class='fare'])[" + i + "]";
            String indexx = driver.findElement(By.xpath(bus)).getText();
            String[] array = indexx.split(" ");
            String rate = array[1];
            int sortrate = Integer.parseInt(rate);
            System.out.println("After sorting rate : " + sortrate);
            Sort.add(sortrate);
        }
    }
}
