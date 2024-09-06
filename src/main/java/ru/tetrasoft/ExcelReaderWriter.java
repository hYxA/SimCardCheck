package ru.tetrasoft;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReaderWriter {
    private String filePath;
    private Workbook workbook;
    private Sheet sheet;

    public ExcelReaderWriter(String filePath) throws IOException {
        this.filePath = filePath;
        FileInputStream inputStream = new FileInputStream(filePath);
        this.workbook = new XSSFWorkbook(inputStream);
        this.sheet = workbook.getSheetAt(0);
        inputStream.close();
    }

    public String getPhoneNumber(int rowIndex) {
        Row row = sheet.getRow(rowIndex);
        Cell cell = row.getCell(0);
        return cell != null ? cell.getStringCellValue() : null;
    }

    public void setDataBalance(int rowIndex, String dataBalance) {
        Row row = sheet.getRow(rowIndex);
        Cell cell = row.createCell(1);
        cell.setCellValue(dataBalance);
    }

    public int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public void save() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
