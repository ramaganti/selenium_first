package OnlyTestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {

    @BeforeClass
    public void bf(){



        System.out.println("Before class");
    }
    @Test (priority = 1)
    public void t1(){
        System.out.println("T1");
    }
    @Test(priority = 3)
    public void t2(){
        System.out.println("T2");
    }
    @Test(priority = 4)
    public void t3(){
        System.out.println("T3");
    }
    @Test(priority = 2)
    public void t4(){
        System.out.println("T4");
    }

}
