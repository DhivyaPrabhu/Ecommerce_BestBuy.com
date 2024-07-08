package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String excelUtils(String sheetName, int rowIndex, int cellIndex) throws IOException {
        String value = null;
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        
        try {
            fis = new FileInputStream("D:\\Intelli workspace\\BestBuy.com\\Data.xlsx");
            workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = (XSSFRow) sheet.getRow(rowIndex);
            XSSFCell cell = row.getCell(cellIndex);
            CellType cellType = cell.getCellType();

            if (cellType == CellType.STRING) {
                value = cell.getStringCellValue();
            } else if (cellType == CellType.NUMERIC) {
                double numericCellValue = cell.getNumericCellValue();
                value = String.valueOf((int) numericCellValue);
            }
        } finally {
            if (workbook != null) {
                workbook.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return value;
    }
}
