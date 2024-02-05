package TestCodes;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderElement {
    public void waitMethod(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void sliderTest1(){
        DriverClass.getDriver().get("https://demoqa.com/slider");
        waitMethod(3);
        WebElement slider = DriverClass.getDriver().findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
        Actions actions = new Actions(DriverClass.getDriver());
        waitMethod(3);
//        actions.contextClick(slider).build().perform();
        //find the silder dimentions
        int sliderWidth = slider.getSize().getWidth();
        int sliderX = slider.getLocation().getX();
        int sliderY = slider.getLocation().getY();

        // Calculate silder pixels
        int intersectionPoint = (int) Math.round(0.25*sliderWidth);
        int moveToPoint = (int) Math.round(0.49*sliderWidth);
        int valueBefore = Integer.parseInt(slider.getAttribute("value"));
        waitMethod(3);
        actions.moveByOffset(sliderX+intersectionPoint,sliderY).clickAndHold().moveByOffset(moveToPoint,0).build().perform();
        int valueAfter = Integer.parseInt(slider.getAttribute("value"));

        Assert.assertTrue((valueBefore+50)==valueAfter);

    }
}
