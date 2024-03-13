package Utilities;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class CommonMethods {
    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(10));

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.sendKeys(text);
    }

    public WebElement dynamicXpath(String name){
        waitUntilVisible(DriverClass.getDriver().findElement(By.xpath("//div[text()='The "+name+" already exists.']")));
        WebElement newElement = DriverClass.getDriver().findElement(By.xpath("//div[text()='The "+name+" already exists.']"));
        return newElement;
    }

    public void waitMethod(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public void assertTrueMethod(boolean assertion){
        Assert.assertTrue(assertion);
    }

    public void assertEqualMethod(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }

    public void assertEqualMethod(int actual, int expected){
        Assert.assertEquals(actual,expected);
    }

    public void assertFalseMethod(boolean assertion){
        Assert.assertFalse(assertion);
    }

    public void assertNotEqualMethod(String actual, String expected){
        Assert.assertNotEquals(actual,expected);
    }

    public void assertNotEqualMethod(int actual, int expected){
        Assert.assertNotEquals(actual,expected);
    }

public void writeInExcel(String path, String sheetName, int rowIndex, int cellIndex, String text) throws IOException {
    FileInputStream fileInputStream = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(fileInputStream);

    Sheet sheet = workbook.getSheet(sheetName);
    Row row = sheet.createRow(rowIndex);
    Cell cell = row.createCell(cellIndex);
    cell.setCellValue(text);


    FileOutputStream fileOutputStream = new FileOutputStream(path);
    workbook.write(fileOutputStream);
    workbook.close();
    fileOutputStream.close();
}

public String readFromExcel(String path, String sheetName, int rowIndex, int cellIndex) throws IOException {
    FileInputStream fileInputStream = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(fileInputStream);
    Sheet sheet = workbook.getSheet(sheetName);
    Row row = sheet.getRow(rowIndex);
    Cell cell = row.getCell(cellIndex);
    return cell.toString();
}

public String generateRandomWord(){
        Random random = new Random();
        int length = random.nextInt(8)+8;
        StringBuilder stringBuilder = new StringBuilder();
        String charachters =  "abcdefghijklmnopqrstuvwxyz";
        int randomIndex = random.nextInt(26);
        char randomChar = (char)(charachters.charAt(randomIndex) - 32);
        stringBuilder.append(randomChar);

    for (int i = 0; i < length; i++) {
        randomIndex = random.nextInt(charachters.length());
        randomChar = charachters.charAt(randomIndex);
        stringBuilder.append(randomChar);

    }
        return stringBuilder.toString();
}





}
