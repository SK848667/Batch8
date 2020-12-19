package com.syntax.class36;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClassTask01 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\SK\\IntelliJ\\JavaBatch8\\src\\com\\syntax\\class36\\DataBaseToWrite.xlsx";

        FileOutputStream fos = new FileOutputStream(path);
        Scanner scanner = new Scanner((System.in));
        //FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("OutputSheet");
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Name");
        cell = row.createCell(1);
        cell.setCellValue("Salary");
        for (int i = 1; i <= 10; i++) {
            row = sheet.createRow(i);
            cell = row.createCell(0);
            System.out.println("Enter " + i + " name: ");
            String name = scanner.nextLine();
            cell.setCellValue(name);
            cell = row.createCell(1);
            System.out.println("Enter " + i + " salary: ");
            double salary = scanner.nextDouble();
            cell.setCellValue(salary);
        }
    }
}
