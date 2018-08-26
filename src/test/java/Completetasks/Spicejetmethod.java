package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Spicejetmethod {

    public void xpath(WebDriver driver, String xpath ){

        driver.findElement(By.xpath(xpath)).click();
    }
    public void id(WebDriver driver , String id){

        driver.findElement(By.id(id)).click();

    }
    static void action(WebDriver driver, String xpath){

        WebElement element = driver.findElement(By.xpath(xpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }
    static void action1(WebDriver driver, String id){

        WebElement element = driver.findElement(By.id(id));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void xpath1(WebDriver driver , String xpath){

        driver.findElement(By.xpath(xpath));
    }

}
