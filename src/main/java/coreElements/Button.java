package coreElements;

import org.openqa.selenium.By;

public class Button extends Element {
    public Button(By locator) {
        super(locator);
    }
    public void getText(){
        driver.findElement(elementLocator).getText();
    }
}
