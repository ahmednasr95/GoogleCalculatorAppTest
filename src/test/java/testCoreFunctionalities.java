import org.testng.annotations.Test;
import pages.DriverManager;

import static pages.P01_Calculator.*;

public class testCoreFunctionalities extends DriverManager {
    @Test
    public void addition(){
        two.click();
        plus.click();
        five.click();
        result.validateCriticalField("7");
    }
    @Test
    public void subtraction(){
        clear.click();
        one.click();
        five.click();
        minus.click();
        two.click();
        result.validateCriticalField("13");

    }
    @Test
    public void multiplication(){
        clear.click();
        five.click();
        times.click();
        four.click();
        result.validateCriticalField("20");
    }
    @Test
    public void division(){
        clear.click();
        one.click();
        over.click();
        two.click();
        result.validateCriticalField("0.5");
    }
}
