package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PILGRIMAGESMETHOD {

    public static WebElement findBy(WebDriver driver, String locator1path) {

        WebElement locator = null;

        if (locator1path.startsWith("id")){
            String id = locator1path.replace("id=","");
            locator = driver.findElement(By.id(id));
        }
        else if (locator1path.startsWith("xpath")) {
            String xpth = locator1path.replace("xpath=","");
            locator = driver.findElement(By.xpath(xpth));
        }
        else if (locator1path.startsWith("name")) {
            String name = locator1path.replace("name=","");
            locator = driver.findElement(By.name(name));
        }else if (locator1path.startsWith("css")) {
            String css = locator1path.replace("css=","");
            locator = driver.findElement(By.cssSelector(css));
        }
        return locator;
    }
    public void select(WebElement element, Integer index){

        Select s = new Select(element);
        s.selectByIndex(index);
    }
    public void moveto(WebDriver driver,WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
}
