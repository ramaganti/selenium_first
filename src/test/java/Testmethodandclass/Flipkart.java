package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Flipkart {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Entering user name
        driver.findElement(By.className("_2zrpKA")).sendKeys("8179717979");
        //clcik om password
        WebElement tab = driver.findElement(By.className("_2zrpKA"));
        tab.sendKeys(Keys.TAB);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']/div/form/div[2]/input")).sendKeys("Ram@1318");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // click on login
        driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']/div/form/div[3]/button")).click();
        Thread.sleep(3000);
        // click on search button
        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // sending keys to search button
        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Redmi Note 5");
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);
        // after passsing the key click on search button
        driver.findElement(By.xpath("//div[@class='col-1-12']")).click();
        // To click on mobile
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<String> items = new ArrayList<String>();
        Thread.sleep(8000);
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Redmi Note 5 (Gold, 64 GB)')]"));
        items.add(element.getText());
        element.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* switch between tabs */
        Set<String> ctrltab = driver.getWindowHandles();
        Iterator<String> itr = ctrltab.iterator();
        String parent =  itr.next();
        String child =itr.next();
        // switch to child
        driver.switchTo().window(child);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //to click on add to cart
        driver.findElement(By.xpath("//ul[@class='row']/li/button")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click for continue shopping
       WebElement continue1 = driver.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc mrmU5i']/span"));
       continue1.click();
       //closing the tab
      driver.close();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.switchTo().window(parent);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        // to go back to the last page
        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("oppo f7");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='col-1-12']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(8000);
        //Adding another mobile
        WebElement element1 = driver.findElement(By.xpath("(//a[@title='OPPO F7 (Red, 64 GB)'])[1]"));
        items.add(element1.getText());
        element1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /* switch between tabs */
        Set<String> ctrltab1 = driver.getWindowHandles();
        Iterator<String> itr1 = ctrltab1.iterator();
        String parent1 =  itr1.next();
        String child1 =itr1.next();
        // switch to child
        driver.switchTo().window(child1);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //to click on add to cart
        driver.findElement(By.xpath("//ul[@class='row']/li/button")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click for continue shopping
        driver.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc mrmU5i']/span")).click();
        driver.switchTo().window(parent1);
        // to go back to the last page
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(items);
        // click on cart
        driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[1]")).click();

        //adding cart elements into list
        List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_1Ox9a7']"));

        for (int i =0; i < mobiles.size();i++){
            System.out.println(mobiles.get(i).getText());
            if(items.contains(mobiles.get(i).getText())){
                System.out.println("ok");
            }
            else {
                System.out.println("not");
            }
        }
    }
}