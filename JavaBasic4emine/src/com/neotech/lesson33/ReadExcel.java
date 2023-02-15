package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {

		String filePath = System.clearProperty("user.dir") + "/test_data/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook b = new XSSFWorkbook(fis);

		Sheet s = b.getSheet("TestData");

		// get number of rows

		int rows = s.getPhysicalNumberOfRows();

		System.out.println("Number of rows " + rows);

		// how do we get number of columns/cells?

		int col = s.getRow(0).getLastCellNum();

		System.out.println(col);

		System.out.println("===========================");

		// perfect situtation for nested loop

		// first loop :looping through rows
		for (int r = 0; r < rows; r++) {
			// inner loop:looping through a columns
			for (int c = 0; c < col; c++) // c<s.getRor(r).getLastCellNum();
			{
				String cellValue = s.getRow(r).getCell(c).toString();
				System.out.println(cellValue);
			}

			System.out.println();
		}

		b.close();
		fis.close();

	}

}
