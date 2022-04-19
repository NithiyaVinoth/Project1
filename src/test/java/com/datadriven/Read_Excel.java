package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\WELCOME\\Desktop\\Data Driven\\Write_Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet n = wb.getSheet("Project");
		Row r = n.getRow(1);
		Cell c = r.getCell(0);

		CellType cellType = c.getCellType();

		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = c.getStringCellValue();
			System.out.println("String value: " + stringCellValue);

		}

		else if (cellType.equals(cellType.NUMERIC)) {

			double numericCellValue = c.getNumericCellValue();
			System.out.println("Numeric value: " + numericCellValue);

		}

		int no_of_rows = n.getPhysicalNumberOfRows();
		System.out.println("Number of rows:" + no_of_rows);

		for (int i = 0; i < no_of_rows; i++) {
			Row row1 = n.getRow(i);
			int cell_count = row1.getPhysicalNumberOfCells();

			for (int j = 0; j < cell_count; j++) {

				Cell celln = row1.getCell(j);
				String StringCellValue = celln.getStringCellValue();
				System.out.print(StringCellValue + " ");

			}

			System.out.println();
		}

//		Cell c1 = r.createCell(1);
//		c1.setCellValue("`Blood Group");
//		
//		
//		
//		
//		
//		
//
//		FileOutputStream fos = new FileOutputStream(f);
//		wb.write(fos);
	}

}
