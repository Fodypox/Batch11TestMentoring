import Pages.ECommercePage;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNGPractice {
    ECommercePage page = new ECommercePage();
    @Test
    public void createListOfElements(){
        DriverClass.getDriver().get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(DriverClass.getDriver());
        actions.moveToElement(page.computer).build().perform();
//        for (WebElement element: page.computerList) {
//            page.scrollToElement(page.computer);
//            actions.moveToElement(page.computer).build().perform();
//            page.clickMethod(element);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        for (int i = 0; i < page.computerList.size(); i++) {
            page.scrollToElement(page.computer);
            actions.moveToElement(page.computer).build().perform();
            page.clickMethod(page.computerList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < page.electronicsList.size(); i++) {
            page.scrollToElement(page.electronics);
            actions.moveToElement(page.electronics).build().perform();
            page.clickMethod(page.electronicsList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < page.apparelList.size(); i++) {
            page.scrollToElement(page.apparel);
            actions.moveToElement(page.apparel).build().perform();
            page.clickMethod(page.apparelList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        List<List<WebElement>> wholeList = new ArrayList<>();
//        wholeList.add(page.computerList);
//        wholeList.add(page.electronicsList);
//        wholeList.add(page.apparelList);
//
//        for (int i = 0; i < wholeList.size(); i++) {
//            for (int j = 0; j < wholeList.get(i).size(); j++) {
//                page.scrollToElement(wholeList.get(i).get(j));
//                actions.moveToElement(page.computer).build().perform();
//                page.clickMethod(page.computerList.get(i));
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

//        List<String> names = new ArrayList<>(Arrays.asList("Tatiana", "Hamza", "Hanna", "Sahin"));
//        System.out.println(names.get(0));



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DriverClass.quitDriver();

    }
}
