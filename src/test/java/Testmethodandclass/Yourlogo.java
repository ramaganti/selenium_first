package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Yourlogo {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //adding = title='Faded Short Sleeve T-shirts
        List<String> items = new ArrayList<String>();
        WebElement dress1 = driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]/img"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        items.add(dress1.getAttribute("title"));
        //System.out.println(items);
        dress1.click();
        //choosing size of the dress
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
        WebElement size = driver.findElement(By.name("group_1"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //size.click();
        Select option = new Select(size);
        option.selectByVisibleText("L");
        driver.findElement(By.xpath("//button[@name='Submit']/span")).click();
        //adding = blouse
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='clearfix']/div[2]/div[4]/span/span")).click();

        WebElement dress2 = driver.findElement(By.xpath("(//a[@class='product_img_link'])[2]/img"));
        //adding elements into items list
        items.add(dress2.getAttribute("title"));
        //System.out.println(items);
        dress2.click();
        //chooisng size of the list
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
        Thread.sleep(2000);
        WebElement size1 = driver.findElement(By.name("group_1"));
       // size1.click();
        Select option1 = new Select(size1);
        option1.selectByVisibleText("L");
        driver.findElement(By.xpath("//button[@name='Submit']/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='clearfix']/div[2]/div[4]/span/span")).click();
        Thread.sleep(3000);

        //Adding = Printed dress
        WebElement dress3 = driver.findElement(By.xpath("(//a[@class='product_img_link'])[4]/img"));
        items.add(dress3.getAttribute("title"));
        System.out.println(items);
        Thread.sleep(2000);
        dress3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
        Thread.sleep(2000);
        WebElement size2 = driver.findElement(By.id("group_1"));
        //size2.click();
        Select option2 = new Select(size2);
        option2.selectByVisibleText("L");
        driver.findElement(By.xpath("//button[@name='Submit']/span")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='clearfix']/div[2]/div[4]/span/span")).click();

        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("(//a[@rel='nofollow'])[7]/span")).click();

        //click on logo
        //driver.findElement(By.xpath("//img[@alt='My Store']")).click();
        //action on cart
        WebElement movetoeement = driver.findElement(By.xpath("//div[@class='shopping_cart']/a"));
        Actions action = new Actions(driver);
        action.moveToElement(movetoeement).perform();

        //Adding cart elements into list
        driver.findElement(By.xpath("//b[text()='Cart']")).click();
        List<WebElement> car = driver.findElements(By.xpath("//td[@class='cart_description']/p"));
        for (int i =0; i < car.size();i++){
            System.out.println(car.get(i).getText());
            if(items.contains(car.get(i).getText())){
                System.out.println("ok");
            }
            else {
                System.out.println("not");
            }
        }




    }
}
