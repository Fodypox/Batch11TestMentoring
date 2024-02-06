package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverClass {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}
