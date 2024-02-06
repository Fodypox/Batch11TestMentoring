package TestCodes;

import Utilities.DriverClass;
import Utilities.Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC103 {
    Page page = new Page();
    @Test
    public void actionsTC003(){
        DriverClass.getDriver().get("http://webdriveruniversity.com/Actions");
        page.waitUntilVisible(page.hoverMeFirst);
        Actions actions = new Actions(DriverClass.getDriver());
        actions.moveToElement(page.hoverMeFirst).build().perform();

        page.clickMethod(page.link1);

        Alert alert = DriverClass.getDriver().switchTo().alert();
        System.out.println(alert.getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
        DriverClass.getDriver().switchTo().defaultContent();

        page.waitUntilClickable(page.clickAndHold);
        actions.moveToElement(page.clickAndHold).clickAndHold().build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.release().build().perform();

        DriverClass.quitDriver();



    }
}
