package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Testnaukri
{
    static WebDriver driver;
    public void TestPopup()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        String parent = driver.getWindowHandle();
        Set<String>s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext())
        {
            String child_window = I1.next();
            if (!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }
                driver.switchTo().window(parent);
        }


    }
}
