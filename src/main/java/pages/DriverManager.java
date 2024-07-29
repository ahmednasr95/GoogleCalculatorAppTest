package pages;

import coreElements.Element;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Properties;

import static utils.PROPERTIESReader.getConfigs;
import static utils.ReportManager.initialize;
import static utils.ReportManager.printReport;

public class DriverManager {
    public static AndroidDriver driver;
    public Properties config;
    @BeforeClass
    public void setup() throws MalformedURLException {
        // Extract configurations
        try
        {
            config = getConfigs("src/main/java/config.properties");
        }
        catch(IOException e){
            System.out.println("Config File not found!!!");
        }
        // Initialize the report manager
        initialize(config.getProperty("reportOutputPath"));
        // Load desired capabilities
        DesiredCapabilities desCap = new DesiredCapabilities();
        desCap.setCapability("platformName",config.getProperty("operatingSystem"));
        desCap.setCapability("appium:platformVersion",config.getProperty("operatingSystemVersion"));
        desCap.setCapability("appium:automationName",config.getProperty("automationName"));
        desCap.setCapability("appium:deviceName",config.getProperty("deviceName"));
        desCap.setCapability("appium:app", System.getProperty("user.dir")+'/'+config.getProperty("appLocation"));
        URI link = URI.create(config.getProperty("serverURL"));
        // Create new driver object
        driver = new AndroidDriver(link.toURL(),desCap);
        // Pass the driver to the core elements
        Element.setDriver(driver);
    }
    @AfterClass
    public void tearDown(){
        // Quit the WebDriver instance
        driver.quit();
        printReport();
    }
}
