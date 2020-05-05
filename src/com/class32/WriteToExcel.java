package com.class32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\testdata\\Test1.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	Workbook workbook=new XSSFWorkbook(fis);
	
	Sheet sheet1= workbook.getSheet("Sheet1");
	sheet1.getRow(0).createCell(5).setCellValue("Country");
	sheet1.createRow(3).createCell(0).setCellValue("Luna");
	Sheet customSheet=workbook.createSheet("TestSheet");
	FileOutputStream fos=new FileOutputStream(filePath);
	workbook.write(fos);
}
}
