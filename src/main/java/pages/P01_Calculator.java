package pages;

import coreElements.*;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class P01_Calculator {
  public static Button plus = new Button(new AppiumBy.ByAccessibilityId("plus"));
  public static Button minus = new Button(new AppiumBy.ByAccessibilityId("minus"));
  public static Button times = new Button(new AppiumBy.ByAccessibilityId("multiply"));
  public static Button over = new Button(new AppiumBy.ByAccessibilityId("divide"));
  public static Button clear = new Button(new AppiumBy.ByAccessibilityId("clear"));
  public static Button equal = new Button(new AppiumBy.ByAccessibilityId("equals"));
  public static FormField result = new FormField(By.id("com.google.android.calculator:id/formula_container"));

  public static void writeNumber(int number){
    if(number/10 == 0){
      new Button(new AppiumBy.ByAccessibilityId(String.valueOf(number%10))).click();
    } else{
      writeNumber(number/10);
      new Button(new AppiumBy.ByAccessibilityId(String.valueOf(number%10))).click();
    }
  }
}