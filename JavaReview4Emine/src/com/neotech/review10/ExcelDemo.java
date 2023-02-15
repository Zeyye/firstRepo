package com.neotech.review10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/extra/Excel.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);// get/read the whole excel file

		Sheet sheet = book.getSheet("Sheet1");// get the sheet from the excel file

		Row row2 = sheet.getRow(2);// get the row with index 2 from the file

		Cell cell0 = row2.getCell(0);

		System.out.println(cell0.toString());

	}

}
