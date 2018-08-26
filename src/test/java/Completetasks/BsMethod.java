package Completetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BsMethod {

    static List<WebElement> list( WebDriver driver,String xpath ){

        List<WebElement> city = driver.findElements(By.xpath(xpath));
        for (int i = 0; i <city.size() ; i++) {
            System.out.println(city.get(i).getText());
            }
            return city;
    }
     public void click(WebDriver driver, String xpath){

        driver.findElement(By.xpath(xpath)).click();
    }
    static void scrolldown( WebDriver driver, String xpath){
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript(xpath);
    }
    static void id(WebDriver driver, String id){
        driver.findElement(By.id(id)).click();
    }
    static void select(WebDriver driver,String xpath, String text){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select s = new Select(element);
        s.selectByVisibleText(text);

    }
}
