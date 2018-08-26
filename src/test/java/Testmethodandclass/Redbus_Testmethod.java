package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Redbus_Testmethod {

    public void click(WebDriver driver , WebElement element){

        element.click();
    }
    public void sendkeys(WebDriver driver,WebElement element,String id){



        element.sendKeys(id);
    }



}
