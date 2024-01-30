package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClassMethods {
    //    MoveToElement
    @Test
    public void actionsClassTest() {
        Actions actions = new Actions(DriverClass.getDriver());
        DriverClass.getDriver().get("https://demoqa.com/resizable");
        WebElement cornerPoint = DriverClass.getDriver().findElement(By.cssSelector("#resizableBoxWithRestriction>span"));
        actions.moveToElement(cornerPoint).clickAndHold().moveByOffset(50,50).release().perform();
    }

    @Test
    public void dragAndDrop(){
        Actions actions = new Actions(DriverClass.getDriver());
        DriverClass.getDriver().get("https://demoqa.com/droppable");
        WebElement draggable = DriverClass.getDriver().findElement(By.id("draggable"));
        WebElement droppable = DriverClass.getDriver().findElement(By.xpath("(//p[text()='Drop here'])[1]/.."));
        actions.dragAndDrop(draggable,droppable).perform();
    }

    /**HW
     * Navigate to Slider at point 25 drag it and drop at point 75*/


}
