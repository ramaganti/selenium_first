package Testmethodandclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Redbus_TC extends Redbus_methods {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        Redbus_TC redbus = new Redbus_TC();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/bus-tickets/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement bus = Redbus_methods.findBy(driver,"id=txtSource");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text = "bangalore";
        bus.sendKeys(text);
        bus.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement bus1 = Redbus_methods.findBy(driver,"id=txtDestination");
        String text1 = "ravulapalem";
        bus1.sendKeys(text1);
        bus1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement date = Redbus_methods.findBy(driver,"id=txtOnwardCalendar");
        date.click();
        Thread.sleep(200);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement date1 = redbus.setMonth(driver,moth.);
        WebElement next = Redbus_methods.findBy(driver,"xpath=//li[@class='rb-next active']/img[1]");
        for (int i = 0; i <12 ; i++) {
            String monthxpath = "(//span[@id='rb-month'])[2]";
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String month = driver.findElement(By.xpath(monthxpath)).getText();
            System.out.println(month);
            if (month.equalsIgnoreCase("Apr")) {
                WebElement todate = redbus.selectDate(driver,"Apr","28");
                todate.click();
                break;

            }
        }
    }
}
