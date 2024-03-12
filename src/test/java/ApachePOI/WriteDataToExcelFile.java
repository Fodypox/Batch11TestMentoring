package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/Resources/CampusData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("OurSheet");
        Row row = sheet.createRow(2);
        Cell cell = row.createCell(0);
        Cell cell2 = row.createCell(1);
        cell.setCellValue("Country Name");
        cell2.setCellValue("Country Code");
        String countryName = "Some Country";
        String countryCode = "Some Code";
        Row row2 = sheet.createRow(3);
        Cell country1 = row2.createCell(0);
        Cell code1 = row2.createCell(1);
        country1.setCellValue(countryName);
        code1.setCellValue(countryCode);

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();

    }
}
