package Testmethodandclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class myntr_tc extends myntra_method {

    static WebDriver driver;

//    public myntr_tc() {
//        super(driver);
//    }

//    public myntr_tc(WebDriver driver) {
//
//    }

    public static void main(String[] args) throws InterruptedException {

        myntra_method testcase = new myntra_method();

        // if we use constructor in method
        //myntra_method testcase = new myntra_method(driver);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.myntra.com/");
        WebElement moveto = myntra_method.findby(driver,"xpath=//div[@class='desktop-user']/div/span[1]");
        //Actions move = new Actions(driver);
        //move.moveToElement(moveto).perform();
        testcase.action(moveto,driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"xpath=//div[@class='desktop-getUserInLinks desktop-getInLinks']/a[2]").click();
//        myntra_method.findby(driver,"id=gPlusLogin").click();
//        testcase.windowhandles(driver,true);
//        driver.manage().window().maximize();
//        myntra_method.findby(driver,"name=identifier").sendKeys("ramganti18");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        myntra_method.findby(driver,"xpath=//span[contains(text(),'Next')]").click();
//        myntra_method.findby(driver,"name=password").sendKeys("Ram@1318");
        Thread.sleep(2000);
//        myntra_method.findby(driver,"xpath=//span[text()='Next']").click();
        myntra_method.findby(driver,"xpath=//div[@class='login-button-container']/button").click();
//        WebElement colour = myntra_method.findby(driver,"xpath=//div[@class='login-button-container']/button/span");
//        System.out.println(" colour of Monsterindia logo : " + colour.getCssValue("color"));
//        WebElement colour1 = myntra_method.findby(driver,"xpath=//div[@class='login-button-container']/button[2]/span");
//        System.out.println(" colour of google logo : " + colour1.getCssValue("color"));
//        Set<String> window1 = driver.getWindowHandles();
//        Iterator<String> itr = window1.iterator();
//        String parentwindow = itr.next();
//        String childwindow = itr.next();
//        driver.switchTo().window(childwindow);
//        System.out.println(window1);
        testcase.windowhandles(driver,true);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"id=email").sendKeys("8179717979");
        myntra_method.findby(driver,"id=pass").sendKeys("797979");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"id=offline_access").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"name=login").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        testcase.windowhandles(driver,true);
//        myntra_method.findby(driver,"name=email").click();
//        myntra_method.findby(driver,"name=__CONFIRM__").click();

//        WebElement bordercolor = myntra_method.findby(driver,"name=email");
//        String border =bordercolor.getCssValue("border-bottom-color");
//        System.out.println("bordercolorofloginbox : " +bordercolor.getCssValue("border-bottom-color"));
//        String color = "rgba(40, 44, 63, 1)";
//        if (color.contains(border)){
//            System.out.println("the border contains color");
//        }else {
//            System.out.println("border doesnt contains color");
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        myntra_method.findby(driver,"name=email").sendKeys("ramganti18");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        myntra_method.findby(driver,"name=password").sendKeys("9879777");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        myntra_method.findby(driver,"xpath=//button[contains(text(),'Log in')]").click();
//        testcase.windowhandles(driver,false);
//        myntra_method.findby(driver,"id=gPlusLogin").click();
       //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"xpath=(//img[@class='image-image undefined image-hand'])[1]").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement Roadster = myntra_method.findby(driver,"xpath=//div[text()='Home Sparkle']/following-sibling::h4[text()='Wall Painting']");
        JavascriptExecutor ja = (JavascriptExecutor)driver;
        ja.executeScript("arguments[0].click();",Roadster);
        myntra_method.findby(driver,"xpath=//div[@class='size-buttons-size-buttons']/button[3]/p").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"xpath=//span[contains(text(),'ADD TO BAG')]").click();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Highlander = myntra_method.findby(driver,"xpath=//ul[@class='results-base']/li[7]/a/img");
        System.out.println(Highlander.getText());
        Highlander.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"xpath=//div[@class='size-buttons-size-buttons']/button[2]/p").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"xpath=//span[contains(text(),'ADD TO BAG')]").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myntra_method.findby(driver,"xpath=//a[@class='desktop-cart']/span[1]").click();
    }
}
