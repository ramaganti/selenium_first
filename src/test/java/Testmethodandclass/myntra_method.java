package Testmethodandclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class myntra_method {

 //------------------------------------------------------------------------------------
    // if we want to use constructor method then only it will be usefull
//    WebDriver driver;


//    public myntra_method(WebDriver driver){
//        this.driver = driver;
//
//       // driver = yyyy;
//    }

//    public myntra_method() {
//
//    }

//-------------------------------------------------------------------------------------
    public static WebElement findby(WebDriver driver, String locatorxpath){
        WebElement locator = null;

        if (locatorxpath.startsWith("xpath")){
            String xpath = locatorxpath.replace("xpath=","");
            locator = driver.findElement(By.xpath(xpath));
        }
        if (locatorxpath.startsWith("id")){
            String id = locatorxpath.replace("id=","");
            locator = driver.findElement(By.id(id));
        }
        if (locatorxpath.startsWith("name")){
            String name = locatorxpath.replace("name=","");
            locator = driver.findElement(By.name(name));
        }
        if (locatorxpath.startsWith("linktext")){
            String linktext = locatorxpath.replace("linktext=","");
            locator = driver.findElement(By.linkText(linktext));
        }
    return locator;
    }
    public void action(WebElement element,WebDriver driver){

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }
    public void windowhandles(WebDriver driver,Boolean SwithtoChaild) {
        Set<String> window1 = driver.getWindowHandles();
        System.out.println(window1);
        if (window1.size() > 1) {
            Iterator<String> itr1 = window1.iterator();
            String parentwindow = itr1.next();
            String childwindow = itr1.next();
            if (SwithtoChaild) {
                driver.switchTo().window(childwindow);
            } else {
                driver.switchTo().window(parentwindow);
            }
        }
        else {
            Iterator<String> itr1 = window1.iterator();
            String parentwindow = itr1.next();
            driver.switchTo().window(parentwindow);
        }
    }

}
