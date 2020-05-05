package com.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\Paul\\Desktop\\Test1.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	
	//get an object of workbook type
	Workbook book=new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");
	
	//need to find numbers or rows 
	int rows=sheet.getPhysicalNumberOfRows();
	System.out.println(rows);
	
	//find number of columns
	int col=sheet.getRow(0).getLastCellNum();
	System.out.println(col);
	
	//get data from all rows and all columns
	for (int i=0; i<rows;i++) { //iterates over rows
		for (int c=0; c<col;c++) {
			String cellVal=sheet.getRow(i).getCell(c).toString();
			System.out.println(cellVal);
		}
	}
	
}
}
