package org.exl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\prasanth\\eclipse\\Project1\\src\\test\\resources\\Excel\\Excel.xlsx");
FileInputStream f1=new FileInputStream(f);
Workbook w=new XSSFWorkbook(f1);
Sheet sheet=w.getSheet("Sheet1");
Row row=sheet.getRow(0);
Cell cell=row.getCell(1);
//String stringCellValue=cell.getStringCellValue();
//System.out.println(stringCellValue);
for (int i=0;i<row.getPhysicalNumberOfCells();i++) {
	Row Row1 = sheet.getRow(i);
	for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
		Cell cell1 = row.getCell(j);
		String stringcellvalue = cell1.getStringCellValue();
		System.out.println(stringcellvalue +"\t");
	 }
	System.out.println();
  }

 }
	
}