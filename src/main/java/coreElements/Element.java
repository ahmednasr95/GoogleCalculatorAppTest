package coreElements;

import io.appium.java_client.android.AndroidDriver;
import lombok.Setter;
import org.openqa.selenium.By;

public class Element {
    @Setter
    static AndroidDriver driver;
    By elementLocator;
    public Element(By locator) {
        elementLocator = locator;
    }
    public void click(){
        driver.findElement(elementLocator).click();
    }
}
