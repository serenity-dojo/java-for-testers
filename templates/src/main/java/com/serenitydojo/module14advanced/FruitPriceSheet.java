package com.serenitydojo.module14advanced;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Exercise 14.7: Working with Excel spreadsheets, using Apache POI.
 * <p>
 * The spreadsheet has a header row, followed by one row for each fruit.
 * Column A contains the name of the fruit, and column B contains its price per kilo.
 * <pre>
 *   Fruit    | Price per kilo
 *   Apple    | 4.0
 *   Orange   | 5.5
 * </pre>
 */
public class FruitPriceSheet {

    /**
     * Reads the prices from the first sheet of a spreadsheet, skipping the header row.
     * The prices are returned in the same order as they appear in the spreadsheet.
     */
    public Map<String, Double> readPrices(InputStream spreadsheet) throws IOException {
//@@ solution
        Map<String, Double> prices = new LinkedHashMap<>();
        try (Workbook workbook = new XSSFWorkbook(spreadsheet)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (int rowNumber = 1; rowNumber <= sheet.getLastRowNum(); rowNumber++) {
                Row row = sheet.getRow(rowNumber);
                if (row == null) {
                    continue;
                }
                Cell fruit = row.getCell(0);
                Cell price = row.getCell(1);
                prices.put(fruit.getStringCellValue(), price.getNumericCellValue());
            }
        }
        return prices;
//@@ starter
        // TODO: open the spreadsheet with new XSSFWorkbook(spreadsheet), get the first sheet, and loop over
        //       the rows after the header row (row 0). Read the fruit name with row.getCell(0).getStringCellValue()
        //       and the price with row.getCell(1).getNumericCellValue()
        return new LinkedHashMap<>();
//@@ end
    }

    /**
     * Writes the prices to a new spreadsheet file, with a sheet called "Prices", a header row
     * ("Fruit" and "Price per kilo") and then one row for each fruit.
     */
    public void writePrices(Map<String, Double> prices, Path file) throws IOException {
//@@ solution
        try (Workbook workbook = new XSSFWorkbook();
             OutputStream output = Files.newOutputStream(file)) {
            Sheet sheet = workbook.createSheet("Prices");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Fruit");
            header.createCell(1).setCellValue("Price per kilo");

            int rowNumber = 1;
            for (Map.Entry<String, Double> price : prices.entrySet()) {
                Row row = sheet.createRow(rowNumber++);
                row.createCell(0).setCellValue(price.getKey());
                row.createCell(1).setCellValue(price.getValue());
            }
            workbook.write(output);
        }
//@@ starter
        // TODO: create a new XSSFWorkbook, add a sheet called "Prices" with workbook.createSheet("Prices"),
        //       write the header row and one row for each fruit, and then save it with workbook.write(outputStream)
//@@ end
    }
}
