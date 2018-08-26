package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart_method {

    static void click(WebDriver driver,String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    static void id(WebDriver driver, String id){
        driver.findElement(By.id(id)).click();
    }
    static void sendkeys(WebDriver driver, String id,String text){

        driver.findElement(By.xpath(id)).sendKeys(text);

    }

}
