package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FindElements {


    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.phptravels.net/");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        List<WebElement> ram = driver.findElements(By.xpath("//li[@class='main-lnk']/a/span[2]"));
//
//        Iterator<WebElement> it = ram.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next().getText());
//        }
//
//        Select s = new Select(driver.findElement(By.id("adults")));
//        List<WebElement> listram = s.getOptions();
//        s.selectByIndex(listram.size()-3);
//        System.out.println("number of options are "+listram.size());
//
//        Select s1 = new Select(driver.findElement(By.id("child")));
//        List<WebElement> ram1 = s1.getOptions();
//        s1.selectByIndex(ram1.size()-1);
//        System.out.println(ram1.size());
//        System.out.println("---------------------------------------");
//
//        Select p = new Select(driver.findElement(By.id("hidden-xs")));
//        List<WebElement> satya = p.getOptions();
//        p.selectByVisibleText("Hotels");
//        System.out.println(satya.size());
//
//
//        Set<String> rama = driver.getWindowHandles();
//        for (String raj : rama)
//        {
//          String parentwindow = raj;
//          String childwindow = rama;
//
//        }

        Set<String> ram = new HashSet<String>();
        ram.add("ram");
        ram.add("durga");
        ram.add("mani");
        String one;
        String two;
        String thr;

        for (String raj : ram) {
            System.out.println(raj);
        }
        System.out.println(ram);




    }

}
