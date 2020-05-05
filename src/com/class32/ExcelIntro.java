package com.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelIntro {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\Paul\\Desktop\\Test1.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	//accessing workbook
	Workbook wbook=new XSSFWorkbook (fis);
	
	//accessing sheet
	Sheet sheet=wbook.getSheet("Sheet1");
	
	//accessing row
	Row row1=sheet.getRow(0);
	
	//accessing cell 
	Cell cell=row1.getCell(1);
	
	//get value from cell 
	String r1cell2=cell.toString();
	System.out.println(r1cell2);
	
	//how to get Chantille
	Row row3=sheet.getRow(2);
	Cell r3c3 = row3.getCell(2);
	String cellValue=r3c3.toString();
	System.out.println(cellValue);
	
	//to retrieve values based on type
	double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
	System.out.println(cellv);
	
	//how to get 12251 in String
	String valC=sheet.getRow(1).getCell(4).toString();
	String []arr=valC.split("\\.");
	System.out.println(arr[0]);
	
}
}
