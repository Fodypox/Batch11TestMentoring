package LIDLProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverClass {
    public static WebDriver driver;

    static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.lidl.com/");
        MyMethods.myWait(2);
    }

    public static void quitMethod(){
        MyMethods.myWait(2);
        driver.quit();
    }
}
