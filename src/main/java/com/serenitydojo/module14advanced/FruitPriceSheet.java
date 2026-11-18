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
        // TODO: open the spreadsheet with new XSSFWorkbook(spreadsheet), get the first sheet, and loop over
        //       the rows after the header row (row 0). Read the fruit name with row.getCell(0).getStringCellValue()
        //       and the price with row.getCell(1).getNumericCellValue()
        return new LinkedHashMap<>();
    }

    /**
     * Writes the prices to a new spreadsheet file, with a sheet called "Prices", a header row
     * ("Fruit" and "Price per kilo") and then one row for each fruit.
     */
    public void writePrices(Map<String, Double> prices, Path file) throws IOException {
        // TODO: create a new XSSFWorkbook, add a sheet called "Prices" with workbook.createSheet("Prices"),
        //       write the header row and one row for each fruit, and then save it with workbook.write(outputStream)
    }
}
