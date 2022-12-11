package com.xlxs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
	String excelpath=".\\datafiles\\testcredentials.xlsx";
	FileInputStream fis=new FileInputStream(excelpath);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheet("testdata");
int rows=sheet.getLastRowNum();
int colms=sheet.getRow(0).getLastCellNum();

for(int r=0;r<=rows;r++)
{
	XSSFRow row=sheet.getRow(r);
	for(int c=0;c<=colms;c++) {
		XSSFCell cell=row.getCell(c);
	switch(cell.getCellType()){
	case STRING:System.out.print(cell.getStringCellValue());break;
	case NUMERIC:System.out.print(cell.getNumericCellValue());break;
	case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;}
	System.out.print(" | ");
	}
		
	System.out.println();	
	}
}
	}


