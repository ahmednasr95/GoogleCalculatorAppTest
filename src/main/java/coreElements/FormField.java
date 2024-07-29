package coreElements;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FormField extends Element{

    public FormField(By locator) {
        super(locator);
    }

    public void enterText(String text){
        driver.findElement(elementLocator).sendKeys(text);
    }
    public String getText(){
        return driver.findElement(elementLocator).getText();
    }
    public void validateCriticalField(String expectedValue){
        String actualValue = driver.findElement(elementLocator).getText();
        Assert.assertEquals(actualValue,expectedValue);
    }

    public void validateNonCriticalField(String expectedValue){
        String actualValue = driver.findElement(elementLocator).getText();
        SoftAssert verify = new SoftAssert();
        verify.assertEquals(actualValue,expectedValue);
    }
}
