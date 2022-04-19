package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void main(String[] args) throws IOException {

		// file
		File f = new File("C:\\Users\\WELCOME\\Desktop\\Data Driven\\Write_Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();

		Sheet n = wb.createSheet("Project");
		Row r = n.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("`Patients Name");
		
		
		Cell c1 = r.createCell(1);
		c1.setCellValue("`Blood Group");
		
		
		wb.getSheet("Project").createRow(1);
		wb.getSheet("Project").createRow(2);
		wb.getSheet("Project").createRow(3);



		wb.getSheet("Project").getRow(1).createCell(0).setCellValue("Nithiya");
		wb.getSheet("Project").getRow(2).createCell(0).setCellValue("Dhiyaa");
		wb.getSheet("Project").getRow(3).createCell(0).setCellValue("Vinoth");
		
		
		
		
		wb.getSheet("Project").getRow(1).createCell(1).setCellValue("o+");
		wb.getSheet("Project").getRow(2).createCell(1).setCellValue("A+");
		wb.getSheet("Project").getRow(3).createCell(1).setCellValue("B+");
		
		
		
		

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

}
