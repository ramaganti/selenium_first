package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class abhibu1 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/bus_search/Bangalore/7/Tanuku/72/30-03-2018/O");
//        WebElement rate1 = driver.findElement(By.xpath("//div[@class='col1']/div/h2/strong"));
//        System.out.println(rate1.getText());
//        WebElement rate2 = driver.findElement(By.xpath("(//div[@class='col1'])[2]/div/h2/strong"));
//        System.out.println(rate2.getText());
//        WebElement rate3 = driver.findElement(By.xpath("(//div[@class='col1'])[3]/div/h2/strong"));
//        System.out.println(rate3.getText());
//        WebElement rate4 = driver.findElement(By.xpath("(//div[@class='col1'])[4]/div/h2/strong"));
//        System.out.println(rate4.getText());

//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        WebElement rate0 = driver.findElement(By.xpath("(//strong[contains(@class,'TickRate ng-binding')])[1]"));
//        System.out.println(rate0.getText());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        List<Integer> ram = new ArrayList<Integer>();
//        List<WebElement> rate = driver.findElements(By.xpath("//strong[contains(@class,'TickRate ng-binding')]"));
        for (int i = 0; i < 4 ; i++) {
            String xpath = "//div[@class='bus-item-fixer']//div[7]/div/div";
            String bus = driver.findElement(By.xpath(xpath)).getText();
            String[] split = bus.split(" ");
            String brate = split[1];
            System.out.println(brate);
            int ratev = Integer.parseInt(brate);
         ram.add(ratev);
        }
        System.out.println(ram);


    }

}
