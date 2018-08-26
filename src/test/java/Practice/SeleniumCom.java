package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCom {

    public static WebElement findXpath(WebDriver driver,String xpath){

        WebElement Locator = null;

        Locator = driver.findElement(By.xpath(xpath));



        return Locator;
    }


}
