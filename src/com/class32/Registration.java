package com.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Registration {
public static void main(String[] args) throws IOException {
	
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\testdata\\Task.xlsx";
	FileInputStream fis=new FileInputStream (filePath);
	
	Workbook book=new XSSFWorkbook (fis);
	Sheet sheet=book.getSheet("Sheet1");
	int rows = sheet.getPhysicalNumberOfRows();
	int cols= sheet.getRow(0).getLastCellNum();
	for (int i=0; i<rows;i++) {
		for (int j=0; j<cols;j++) {
			String cell=sheet.getRow(i).getCell(j).toString();
			System.out.print(cell);
			System.out.print("    ");
		}
		System.out.println("");
	}
}
}
