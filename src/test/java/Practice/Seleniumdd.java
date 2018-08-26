package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Seleniumdd {

    public static WebElement findxpath(WebDriver driver , String xpath){

        WebElement Location = null  ;

        Location = driver.findElement(By.xpath(xpath));

        return Location;
    }
}
