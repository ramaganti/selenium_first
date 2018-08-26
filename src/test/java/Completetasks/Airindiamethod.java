package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Airindiamethod {

    public static WebElement findby(WebDriver driver , String locatorpath){

        WebElement locator = null;

        if (locatorpath.startsWith("id")){
            String id = locatorpath.replace("id=","");
            locator = driver.findElement(By.id(id));
        }
        else if (locatorpath.startsWith("xpath")) {
            String xpth = locatorpath.replace("xpath=","");
            locator = driver.findElement(By.xpath(xpth));
        }
        else if (locatorpath.startsWith("name")) {
            String name = locatorpath.replace("name=","");
            locator = driver.findElement(By.name(name));
        }else if (locatorpath.startsWith("css")) {
            String css = locatorpath.replace("css=","");
            locator = driver.findElement(By.cssSelector(css));
        }
        return locator ;
    }
    static void select(WebDriver driver, String xpath, String text){

        WebElement element = driver.findElement(By.xpath(xpath));
        Select s = new Select(element);
        s.selectByVisibleText(text);
    }
    static void select1(WebDriver driver ,String xpath ,int text){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select s = new Select(element);
        s.selectByIndex(text);
    }
    static void select3(WebDriver driver, String xpath ,String text){

        WebElement element = driver.findElement(By.xpath(xpath));
        Select s = new Select(element);
        s.selectByValue(text);
    }

}
