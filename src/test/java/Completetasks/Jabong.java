package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Jabong {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.jabong.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("signin-model-wishlist")).click();

//        driver.findElement(By.xpath("//span[contains(text(),'sign in with facebook')]")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
//        driver.findElement(By.id("moe-push-div")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("login-email")).sendKeys("ramganti18@hotmail.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("login-pwd")).sendKeys("R79797979");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("btn-login")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement text = driver.findElement(By.id("mainTopNav"));
        System.out.println(text.getText());
        Thread.sleep(8000);
        // moving to the element of men

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//ul[@id='mainTopNav']/li[2]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

        Thread.sleep(5000);
        // click on sneakers
        driver.findElement(By.xpath("(//a[contains(text(),'Sneakers')])[2]")).click();
        Thread.sleep(3000);
        // click on view all filters
        driver.findElement(By.xpath("//div[@id='allFilterPopupTop']/span[2]")).click();
        Thread.sleep(5000);

//        driver.findElement(By.id("Brand")).click();

//        String parentwindow = driver.getWindowHandle();
//        String subwindowhandler = null;
//        Set<String> pop = driver.getWindowHandles();
//        Iterator<String> itr = pop.iterator();
//        while (itr.hasNext()){
//            subwindowhandler = itr.next();
//        }
//        driver.switchTo().window(subwindowhandler);
//        driver.close();
//        driver.switchTo().window(parentwindow);

//        WebElement element1 = driver.findElement(By.xpath("//iframe[contains(@src,'<//www.googletagmanager.com/ns.html?id=GTM-T37P6Z>')"));
//        driver.switchTo().frame(element1);
//        Thread.sleep(5000);
//      JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,1500)","");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("(//input[@value='Roadster'])[2]")).click();
////        driver.findElement(By.xpath("(//a[contains(text(),'Roadster')])[2]")).click();
//        //clcik on appply
//        driver.findElement(By.id("applyFIlters")).click();

//        Set<String> window = driver.getWindowHandles();
//        Iterator<String> itr = window.iterator();
//        String parentwindow = itr.next();
//        String childwindow = itr.next();
//        driver.switchTo().window(childwindow);
//        List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
        //Console.WriteLine("frame count on webpage" + frameCount.c)
//        for (int i = 0; i < frameCount.size(); i++) {
//           // driver.switchTo().frame(i);
//            //WebElement road = driver.findElement(By.xpath("(//a[contains(text(),'Roadster')])[2])"));
//           // if (road.isDisplayed() == true){
//                //iselementpresent = true;
//               // road.click();
//           // }
//            System.out.println(frameCount.get(i));
//        }
       // System.out.println(frameCount);
//        WebElement raj = (WebElement) driver.switchTo().frame(1);

 //       System.out.println(raj.getText());
        Thread.sleep(1000);

              WebElement rodstar =  driver.findElement(By.xpath("(//input[@value='Roadster'])[2]"));
              Actions action1 = new Actions(driver);
              action1.moveToElement(rodstar).perform();
              action1.click(rodstar).perform();
              Thread.sleep(2000);
            driver.findElement(By.id("applyFIlters")).click();
            WebElement element1 = driver.findElement(By.xpath("(//div[@class='price'])/span[@class='standard-price']"));
            System.out.println(element1.getText());

//            List<WebElement> rates = driver.findElements(By.xpath("(//div[@class='price'])/span[@class='standard-price']"));
//        for (int i = 0; i < rates.size() ; i++) {
//
//           System.out.println( rates.get(i).getText());
//
//        }
//            TreeSet<Integer> sortedrates = new TreeSet<Integer>();
//        for (int i = 0; i < rates.size() ; i++) {
//
//            sortedrates.add(Integer.parseInt(rates.get(i).getText()));
//
//        }
//
//        System.out.println(sortedrates);
//        System.out.println(sortedrates.last());

//        List<WebElement> val = driver.findElements(By.xpath("(//div[@class='price'])/span[@class='standard-price']"));
//        for (int i = 0; i < val.size() ; i++) {
//            //action1.moveToElement(val.get(i)).perform();
//            Thread.sleep(2000);
//            System.out.println("list of elements "+val.get(i).getText());
//        }
//        TreeSet<Integer> sortedrates = new TreeSet<Integer>();
//        for (int i = 1; i <= 52 ; i++) {
//            String xpath = "(//div[@class='price'])/span[@class='standard-price']["+i+"]";
//            Thread.sleep(3000);
//            String values = driver.findElement(By.xpath(xpath)).getText();
//            Thread.sleep(1000);
//            int value = Integer.parseInt(values);
//            Thread.sleep(2000);
//            System.out.println(value);
//            sortedrates.add(value);
//        }
//        System.out.println(sortedrates.last());

        List<WebElement> text1 = (List<WebElement>) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",
                driver.findElements(By.xpath("(//div[@class='price'])/span[@class='standard-price']")));

        for (int i = 0; i < text1.size() ; i++) {
            System.out.println(text1.get(i).getText());
            String text2 = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",
                    driver.findElements(By.xpath("(//div[@class='price'])/span[@class='standard-price']")));
        }
    }
}
