package com.syntax.class36;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelData {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\SK\\IntelliJ\\JavaBatch8\\src\\com\\syntax\\class36\\OutputData.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        XSSFSheet outputSheet = xssfWorkbook.createSheet("OutputSheet");
        XSSFRow row = outputSheet.createRow(0);

        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Test");
        xssfWorkbook.write(fileOutputStream);


    }
}
