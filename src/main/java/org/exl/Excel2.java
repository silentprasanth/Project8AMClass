package org.exl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws Exception {
		
		//To locate the file
		File f=new File("C:\\Users\\prasanth\\eclipse\\Project1\\src\\test\\resources\\Excel\\Excel1.xlsx");
		
		//To locate file in to the field
		FileInputStream f1=new FileInputStream(f);
		
		//To difine workbook
		Workbook w=new XSSFWorkbook(f1);
		 
	   //To get the sheet
		Sheet s=w.getSheet("Sheet1");
		
	  //To get the row
		for (int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row row=s.getRow(i);
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			Cell cell=row.getCell(j);
		CellType celltype=cell.getCellType();
			switch(celltype) {
			case STRING:
				String stringCellValue=cell.getStringCellValue();
				System.out.println(stringCellValue);
				break;
				default:
					{
			double numericCellValue=cell.getNumericCellValue();
			System.out.println(numericCellValue);
			long d=(long)numericCellValue;
			System.out.println(d);		
		}
		}
		}
   	}
	}
	}
