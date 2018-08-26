package Selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tablepractice {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAM\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.goodreturns.in/gold-rates/bangalore.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        List<WebElement> tr = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr"));
//        System.out.println("No.of rows are ------> " + tr.size());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement tds = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[2]/td"));
        System.out.println(tds.getText());
        WebElement tdi = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[2]/td[2]"));
        System.out.println(tdi.getText());
        // table rows
        WebElement tr1 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[3]/td"));
//        System.out.println(tr1.getText());
//        WebElement tr2 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[4]/td"));
//        System.out.println(tr2.getText());
//        WebElement tr3 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[5]/td"));
//        System.out.println(tr3.getText());
//        WebElement tr4 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[6]/td"));
//        System.out.println(tr4.getText());
//        WebElement tr5 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[7]/td"));
//        System.out.println(tr5.getText());
//        WebElement tr6 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[8]/td"));
//        System.out.println(tr6.getText());
//        WebElement tr7 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[9]/td"));
//        System.out.println(tr7.getText());
//        WebElement tr8 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[10]/td"));
//        System.out.println(tr8.getText());
//        WebElement tr9 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[11]/td"));
//        System.out.println(tr9.getText());
//        System.out.println("----------------------------------------------------------------------------------------");
//        //Table column each element x path :

//        List<Integer> ratelist = new ArrayList<Integer>();
//        List<WebElement> rows = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[2]/td[2]"));
//        for (int i = 0; i < rows.size() ; i++) {
//            String s = rows.get(i).getText();
//            String[] sa = s.split(" ");
//            int j = Integer.valueOf(sa[1].replaceAll(",",""));
//            ratelist.add(j);
//        }
//        System.out.println(ratelist);
//
//        List<Integer> ta = new ArrayList<Integer>();
//       List <WebElement> td1 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[3]/td[2]"));
//        for (int i = 0; i < td1.size() ; i++) {
//            String s = td1.get(i).getText();
//            String[] sb = s.split(" ");
//            int j = Integer.valueOf(sb[1].replaceAll(",",""));
//            ta.add(j);
//        }
//        System.out.println(ta);
//        List<Integer> tb = new ArrayList<Integer>();
//        List<WebElement> td2 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[4]/td[2]"));
//        for (int i = 0; i <td2.size() ; i++) {
//            String s = td2.get(i).getText();
//            String[] sc = s.split(" ");
//            int j = Integer.parseInt(sc[1].replaceAll(",",""));
//            tb.add(j);
//        }
//            System.out.println(tb);
//        List<Integer> tc = new ArrayList<Integer>();
//        List<WebElement> td3 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[5]/td[2]"));
//        for (int i = 0; i <td3.size() ; i++) {
//        String c = td3.get(i).getText();
//        String[] ca = c.split(" ");
//        int k = Integer.parseInt(ca[1].replaceAll(",",""));
//        tc.add(k);
//        }
//        System.out.println(tc);
//
//        List<Integer> td = new ArrayList<Integer>();
//        List<WebElement> td4 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[6]/td[2]"));
//        for (int i = 0; i <td4.size() ; i++) {
//            String d = td4.get(i).getText();
//            String[] cb = d.split(" ");
//            int l = Integer.parseInt(cb[1].replaceAll(",",""));
//            td.add(l);
//        }
//        System.out.println(td);
//
//        List<Integer> te = new ArrayList<Integer>();
//        List<WebElement> td5 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[7]/td[2]"));
//        for (int i = 0; i <td5.size() ; i++) {
//            String e = td5.get(i).getText();
//            String[] cd = e.split(" ");
//            int m = Integer.parseInt(cd[1].replaceAll(",",""));
//            te.add(m);
//        }
//        System.out.println(te);
//
//        List<Integer> tf = new ArrayList<Integer>();
//        List<WebElement> td6 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[8]/td[2]"));
//        for (int i = 0; i <td6.size() ; i++) {
//            String f = td6.get(i).getText();
//            String[] ce = f.split(" ");
//            int n = Integer.parseInt(ce[1].replaceAll(",",""));
//            tf.add(n);
//        }
//        System.out.println(tf);
//        List<Integer> tg = new ArrayList<Integer>();
//        List<WebElement> td7 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[9]/td[2]"));
//        for (int i = 0; i <td7.size() ; i++) {
//            String g = td7.get(i).getText();
//            String[] cf = g.split(" ");
//            int n = Integer.parseInt(cf[1].replaceAll(",",""));
//            tg.add(n);
//        }
//        System.out.println(tg);
//        List<Integer> th = new ArrayList<Integer>();
//        List<WebElement> td8 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[10]/td[2]"));
//        for (int i = 0; i < td8.size() ; i++) {
//            String h = td8.get(i).getText();
//            String[] cg = h.split(" ");
//            int o = Integer.parseInt(cg[1].replaceAll(",",""));
//            th.add(o);
//        }
//        System.out.println(th);
//        List<Integer> ti = new ArrayList<Integer>();
//        List<WebElement> td9 = driver.findElements(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[11]/td[2]"));
//        for (int i = 0; i < td9.size() ; i++) {
//            String j = td9.get(i).getText();
//            String[] ch = j.split(" ");
//            int p = Integer.parseInt(ch[1].replaceAll(",",""));
//            ti.add(p);
//        }
//        System.out.println(ti);
//
//        System.out.println("----------------------------------------------------------------------------------------");
//
//        WebElement tdd1 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[2]/td[3]"));
//        System.out.println(tdd1.getText());
//        WebElement tdd2 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[3]/td[3]"));
//        System.out.println(tdd2.getText());
//        WebElement tdd3 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[4]/td[3]"));
//        System.out.println(tdd3.getText());
//        WebElement tdd4 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[5]/td[3]"));
//        System.out.println(tdd4.getText());
//        WebElement tdd5 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[6]/td[3]"));
//        System.out.println(tdd5.getText());
//        WebElement tdd6 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[7]/td[3]"));
//        System.out.println(tdd6.getText());
//        WebElement tdd7 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[8]/td[3]"));
//        System.out.println(tdd7.getText());
//        WebElement tdd8 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[9]/td[3]"));
//        System.out.println(tdd8.getText());
//        WebElement tdd9 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[10]/td[3]"));
//        System.out.println(tdd9.getText());
//        WebElement tdd10 = driver.findElement(By.xpath("(//div[@class='gold_silver_table'])[3]/table/tbody/tr[11]/td[3]"));
//        System.out.println(tdd10.getText());

//        List<WebElement> coloumns = driver.findElements(By.xpath(("//div[@class='gold_silver_table'])[3]/table/tbody/tr/td[1]")));
//
//        for (int i = 0; i < coloumns.size(); i++) {
//            System.out.println(coloumns.get(i).getText());
//        }

////        String s = "₹ 28,940";
////        String[] ram = rows.split(" ");
////        for (int i = 0; i < ram.length; i++) {
////            System.out.println(ram[i]);
////        }

        List<Integer> ram = new ArrayList<Integer>();


        for (int i = 2; i < 12;i++){
            String xpath = "(//div[@class='gold_silver_table'])[3]/table/tbody/tr["+i+"]/td[2]";

            String text = driver.findElement(By.xpath(xpath)).getText();
            String[] split = text.split(" ");

            String finalText = split[1].replaceAll(",","");
            int finalrate = Integer.parseInt(finalText);
            ram.add(finalrate);
        }
        System.out.println(ram);
        System.out.println("---------------------------");
        int min = ram.get(0);
        int max = ram.get(0);
        for (int i = 0; i <ram.size() ; i++) {
            if (ram.get(i)< min){
                min = ram.get(i);
            }
        }
        System.out.println("minimum value of ram is :"+min);
        for (int i = 0; i <ram.size() ; i++) {
            if (ram.size() > max){
                max = ram.get(i);
            }
        }
        System.out.println("max value of ram is :" + max);
        System.out.println("---------------------------");
        List<String> tit = new ArrayList<String>();
        for (int i = 2; i <12 ; i++) {
            String xpath = "(//div[@class='gold_silver_table'])[3]/table/tbody/tr["+i+"]/td[1]";

            String Text = driver.findElement(By.xpath(xpath)).getText();
            tit.add(Text);
        }
        System.out.println(tit);
        int index = ram.indexOf(min);
        System.out.println(index);
        System.out.println(tit.get(index));
        int index1 = ram.indexOf(max);
        System.out.println(index1);
        System.out.println(tit.get(index1));

    }
}


