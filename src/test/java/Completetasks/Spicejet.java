package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Spicejet extends Spicejetmethod{
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        Spicejet elements = new Spicejet();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("http://www.spicejet.com/default.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // to move on signup
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Thread.sleep(3000);
//        js.executeScript("arguments[0].onmouseover()", signup);
       // action1(driver,"ctl00_HyperLinkLogin");
        WebElement signup = driver.findElement(By.id("ctl00_HyperLinkLogin"));
        Thread.sleep(3000);
//        Actions action = new Actions(driver);
//        action.moveToElement(signup).perform();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        action(driver,"(//li[@class='hide-mobile'])[8]/a");
        WebElement spicecash = driver.findElement(By.xpath("(//li[@class='hide-mobile'])[8]/a"));
        Thread.sleep(2500);
//        Actions actio = new Actions(driver);
//        actio.moveToElement(spicecash).perform();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        action(driver,"(//li[@class='hide-mobile'])[8]/ul/li[2]/a");
       WebElement signin = driver.findElement(By.xpath("(//li[@class='hide-mobile'])[8]/ul/li[2]/a"));
       Thread.sleep(3000);
//        Actions act = new Actions(driver);
//        act.moveToElement(signin).perform();
//        signin.click();
//        elements.xpath(driver,"(//li[@class='hide-mobile'])[8]/ul/li[2]/a");

//        Set<String> actions = new HashSet<String>();
//        actions.add("signup");
//        actions.add("spicecash");
//        actions.add("signin");
//        for(String elements : actions)    {
            Actions element = new Actions(driver) ;
//            element.moveToElement(elements).perform();
//        }
        List<WebElement> actions = new ArrayList<WebElement>();
        actions.add(signup);
        actions.add(spicecash);
        actions.add(signin);
        for (int i = 0; i < actions.size() ; i++) {

            Thread.sleep(3000);
        if(i == actions.size()-1){
            element.moveToElement(actions.get(i)).click().build().perform();
        }
        else {
            element.moveToElement(actions.get(i)).build().perform();
        }
       }

       Thread.sleep(5000);
       elements.id(driver,"CONTROLGROUPREGISTERVIEW_ButtonSubmit");
       Thread.sleep(2000);
       WebElement ram = driver.findElement(By.xpath("//label[contains(text(),'First Name:')]/../following-sibling::div/input"));
      // System.out.println(ram.getCssValue("border-bottom-color"));
        WebElement ram1 = driver.findElement(By.xpath("//label[contains(text(),'Last Name:')]/../following-sibling::div/input"));
        WebElement ram2 = driver.findElement(By.xpath("//label[contains(text(),'User ID (Mobile Number):')]/../following-sibling::div/span/input"));
        WebElement ram3 = driver.findElement(By.xpath("(//label[contains(text(),'Password:')]/../following-sibling::div/input)[1]"));
        WebElement ram4 = driver.findElement(By.xpath("(//label[contains(text(),'Password:')]/../following-sibling::div/input)[2]"));
        WebElement ram5 = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth:')]/following-sibling::select[1]"));
        WebElement ram6 = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth:')]/following-sibling::select[2]"));
        WebElement ram7 = driver.findElement(By.xpath("//label[contains(text(),'Date of Birth:')]/following-sibling::select[3]"));
        WebElement ram8 = driver.findElement(By.xpath("//label[contains(text(),'Email Address:')]/../following-sibling::div/input"));

        List<WebElement> colour = new ArrayList<WebElement>();
        colour.add(ram);
        colour.add(ram1);
        colour.add(ram2);
        colour.add(ram3);
        colour.add(ram5);
        colour.add(ram6);
        colour.add(ram7);
        colour.add(ram8);

        String raj = "rgba(221, 0, 0, 1)";

        for (int i = 0; i < colour.size() ; i++) {
            if (raj.equals(colour.get(i).getCssValue("border-bottom-color"))) {

                System.out.println(colour.get(i).getCssValue("border-bottom-color"));
                System.out.println("all the mandatory fields colours are same");
            }else {
                System.out.println("all filed colours are not same");
            }

            //  if (colour.containsAll(Collections.singleton(raj)))

            // driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).click();

//        Thread.sleep(5000);
//       elements.xpath(driver,"//li[@id='header-book']/a");
//        Thread.sleep(3000);
            //driver.findElement(By.xpath("//li[@id='header-book']/a")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
            // driver.switchTo().defaultContent();
//        Thread.sleep(5000);
            //elements.id(driver,"ctl00_mainContent_ddl_originStation1_CTXT");
//       driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();


        }

    }
}
