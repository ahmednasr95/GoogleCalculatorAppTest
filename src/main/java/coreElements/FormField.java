package coreElements;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.text.Normalizer;

import static utils.ReportManager.logFailedAssertion;
import static utils.ReportManager.logPassedAssertion;

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
    public void validateCriticalField(String assertionMessage, String expectedValue){
        String actualValue = driver.findElement(elementLocator).getText();
        try {
            Assert.assertEquals(actualValue,expectedValue);
            logPassedAssertion(assertionMessage,expectedValue, actualValue);
        } catch (AssertionError e) {
            logFailedAssertion(e,assertionMessage,expectedValue,actualValue);
        }
    }

    public void validateNonCriticalField(String assertionMessage, String expectedValue){
        String actualValue = driver.findElement(elementLocator).getText();
        SoftAssert verify = new SoftAssert();
        try {
            verify.assertEquals(actualValue,expectedValue);
            logPassedAssertion(assertionMessage,expectedValue, actualValue);
        } catch (AssertionError e) {
            logFailedAssertion(e,assertionMessage,expectedValue,actualValue);
        }
    }
}
