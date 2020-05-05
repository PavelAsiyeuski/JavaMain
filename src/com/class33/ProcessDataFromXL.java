package com.class33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFromXL {
public static void main(String[] args) throws IOException {
	String file="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\testdata\\Test1.xlsx";
	FileInputStream fis=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");
	int rows = sheet.getPhysicalNumberOfRows();
	int cols = sheet.getRow(0).getLastCellNum();
	List<Map<String,String>> list= new ArrayList<>();
	for (int i=1;i<rows;i++) {
		Map <String,String> map=new LinkedHashMap<>();
		for (int r=0;r<cols;r++) {
			String key=sheet.getRow(0).getCell(r).toString();
			String value=sheet.getRow(i).getCell(r).toString();
			map.put(key,value);
			
		}
		list.add(map);
	}
	System.out.println(list);
	System.out.println("___accessing each map separately___");
	for (Map<String,String> map:list) {
		System.out.println(map);
	}
}
}
