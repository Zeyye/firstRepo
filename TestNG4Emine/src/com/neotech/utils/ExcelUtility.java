package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	// job of this class to read the excell file

	private static Workbook book;

	private static Sheet sheet;

	private static void openExcel(String filePath) {
		try {
			FileInputStream fileIS = new FileInputStream(filePath);

			book = new XSSFWorkbook(fileIS);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static void loadSheet(String sheetName) {
		sheet = (Sheet) book.getSheet(sheetName);
	}

	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
}
