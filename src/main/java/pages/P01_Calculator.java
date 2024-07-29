package pages;

import coreElements.*;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class P01_Calculator {
  public static Button one = new Button(new AppiumBy.ByAccessibilityId("1"));
  public static Button two = new Button(new AppiumBy.ByAccessibilityId("2"));
  public static Button three = new Button(new AppiumBy.ByAccessibilityId("3"));
  public static Button four = new Button(new AppiumBy.ByAccessibilityId("4"));
  public static Button five = new Button(new AppiumBy.ByAccessibilityId("5"));
  public static Button plus = new Button(new AppiumBy.ByAccessibilityId("plus"));
  public static Button minus = new Button(new AppiumBy.ByAccessibilityId("minus"));
  public static Button times = new Button(new AppiumBy.ByAccessibilityId("multiply"));
  public static Button over = new Button(new AppiumBy.ByAccessibilityId("divide"));
  public static Button clear = new Button(new AppiumBy.ByAccessibilityId("clear"));
  public static FormField result = new FormField(By.id("com.google.android.calculator:id/result_preview"));
}