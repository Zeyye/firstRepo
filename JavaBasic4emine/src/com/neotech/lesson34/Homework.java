package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "/test_data/Homework.xlsx";
		System.out.println(path);

		FileInputStream fis = new FileInputStream(path);

		Workbook workbook = new XSSFWorkbook(fis);

		workbook.close();

		Sheet sheet = workbook.getSheet("Companies");

		List<String> list = new ArrayList<>();

		Row row = sheet.getRow(2);

		int col = row.getLastCellNum();

		for (int c = 0; c < col; c++) {
			String str = row.getCell(c).toString();
			list.add(str);
		}
		System.out.println(list);

		Set<Double> set = new HashSet<>();

		int rows = sheet.getPhysicalNumberOfRows();

		for (int i = 1; i < rows; i++) {
			set.add(sheet.getRow(i).getCell(4).getNumericCellValue());
		}

		System.out.println(set);

	}

}