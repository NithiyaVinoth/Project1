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
import java.io.FileNotFoundException;

public class Excel {

	
	
	
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	
	File f = new File ("C:\\Users\\WELCOME\\Documents\\Datadriveen.xlsx");
	
	
	FileInputStream fis = new  FileInputStream (f);
	
	Workbook wb=new XSSFWorkbook ();
	
 Sheet n = wb.createSheet("Patients Name");
 Row r = n.createRow(0);
	Cell c = r.createCell(0);
	
	c.setCellValue("Blood Group");
	wb.getSheet("Patients Name").createRow(1);
	
	wb.getSheet("Patients Name").createRow(2);
	
	wb.getSheet("Patients Name").createRow(3);
	
	
	
	wb.getSheet("Patients Name").getRow(1).createCell(0).setCellValue("Nithiya");
	wb.getSheet("Patients Name").getRow(1).createCell(0).setCellValue("Dhiyaa");
	
	
	
FileOutputStream fos = new FileOutputStream (f);
wb.write(fos);
}
	
	

	
}
