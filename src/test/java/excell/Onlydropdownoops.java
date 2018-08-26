package excell;


import Practice.Seleniumdd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class Onlydropdownoops extends Seleniumdd{

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-form/");
        String s1 = "//select[@id='continents']";
        WebElement dd = Seleniumdd.findxpath(driver,s1);

        Select s = new Select(dd);
        s.selectByVisibleText("Africa");
        List<WebElement> dop = s.getOptions();
        Iterator<WebElement> itr = dop.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getText());
        }
    }
}
