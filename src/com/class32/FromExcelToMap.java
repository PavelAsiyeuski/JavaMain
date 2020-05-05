package com.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {
public static void main(String[] args) throws IOException {
	String filePath="C:\\Users\\Paul\\Desktop\\Java\\JavaBasics\\testdata\\Test1.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	Workbook workbook=new XSSFWorkbook(fis);
	Sheet sheet1= workbook.getSheet("Sheet1");
	
	int rows=sheet1.getPhysicalNumberOfRows();
	int cols=sheet1.getRow(0).getLastCellNum();
	List <Map<String,String>> listMap=new ArrayList<>();
	
	for (int i=1; i<rows; i++) {
		Map<String,String> map=new LinkedHashMap<>();
		for (int j=0;j<cols;j++) {
			String key=sheet1.getRow(0).getCell(j).toString();
			String value=sheet1.getRow(i).getCell(j).toString();
			map.put(key,value);
		}
		listMap.add(map);
	}
}
}
