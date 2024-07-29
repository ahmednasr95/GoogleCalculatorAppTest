import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.DriverManager;

import static pages.P01_Calculator.*;
import static utils.ReportManager.createTest;
import static utils.ReportManager.logMessage;

public class testCoreFunctionalities extends DriverManager {
    @Test
    public void addition(){
        createTest("addition");
        logMessage(Status.INFO,"Testing addition of two numbers...");
        two.click();
        plus.click();
        five.click();
        result.validateCriticalField("The sum of 2 and 5","7");
        logMessage(Status.INFO,"Addition test completed!");
    }
    @Test
    public void subtraction(){
        createTest("subtraction");
        logMessage(Status.INFO,"Testing subtraction between two numbers...");
        clear.click();
        one.click();
        five.click();
        minus.click();
        two.click();
        result.validateCriticalField("The difference between 15 and 2","13");
        logMessage(Status.INFO,"Subtraction test completed!");
    }
    @Test
    public void multiplication(){
        createTest("multiplication");
        logMessage(Status.INFO,"Testing multiplication of two numbers...");
        clear.click();
        five.click();
        times.click();
        four.click();
        result.validateCriticalField("The product of 5 and 4","20");
        logMessage(Status.INFO,"Multiplication test completed!");
    }
    @Test
    public void division(){
        createTest("division");
        logMessage(Status.INFO,"Testing division of two numbers...");
        clear.click();
        one.click();
        over.click();
        two.click();
        result.validateCriticalField("The quotient of one and two","0.5");
        logMessage(Status.INFO,"Division test completed!");
    }
}
