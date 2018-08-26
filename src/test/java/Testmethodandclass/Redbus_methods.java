package Testmethodandclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Redbus_methods {

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


    public void sendkeys(WebElement element,String text){

        element.sendKeys(text);

    }
    public void click(WebElement element,String text){
        element.click();
    }

    public int Highvalue_in_array(int[] array){

        int max =0;
        for (int i = 0; i < array.length  ; i++) {

            if(array[i] > max){
                max = array[i];
            }

        }
        return max;
    }
    public void setMonth (WebDriver driver,String SelectBytext) {

        WebElement element = null;

        String xpath = "xpath=//li[@class='rb-next active']/img[1]";

        for (int i = 0; i < 12; i++) {

            String monthxpath = "(//span[@id='rb-month'])[2]";

            element = driver.findElement(By.xpath(monthxpath));

            if (monthxpath.equalsIgnoreCase(SelectBytext)) {

                break;
            }
            element = driver.findElement(By.xpath(xpath));

            element.click();
        }
    }
    public WebElement  selectDate(WebDriver driver,String month,String date){
        WebElement element;
        String xpath = "(//span[text()='"+month+"']/../../../../following-sibling::ul[2]/li[@data-date='"+date+"'])[1]";
       element= driver.findElement(By.xpath(xpath));
       return element;
    }
    public void Select(WebElement element, WebDriver driver,int index)
    {

        Select s = new Select(element);
        s.selectByIndex(index);
    }
    public void SelectbyVisText(WebElement element,String visbText) {

        Select s1 = new Select(element);
        s1.selectByVisibleText(visbText);
    }
    public void SelectByValue(WebElement element,String value) {

        Select s = new Select(element);
        s.selectByValue(value);
    }
}
