package org.exl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dateformat1 {

	public static void main(String[] args) throws IOException {
		
		//To locate the file
		File f=new File("C:\\Users\\prasanth\\eclipse\\Project1\\src\\test\\resources\\Excel\\Excel2.xlsx");
		
		//To locate file in to the field
		FileInputStream f1=new FileInputStream(f);
		
		//To difine workbook
		Workbook w=new XSSFWorkbook(f1);
		 
	   //To get the sheet
		Sheet sheet=w.getSheet("Sheet1");
		
	  //To get the row
		for (int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row=sheet.getRow(i);
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			Cell cell=row.getCell(j);
		CellType celltype=cell.getCellType();
			switch(celltype) {
			case STRING:
				String StringCellValue=cell.getStringCellValue();
				System.out.println(StringCellValue);
				break;
				default:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date datecellvalue=cell.getDateCellValue();
						SimpleDateFormat date1=new SimpleDateFormat("MM-dd-yyyy");
						String format=date1.format(datecellvalue);
						System.out.print(format);
					//	SimpleDateFormat date2=new SimpleDateFormat("MM-dd-yyyy");
					//	String format1=date2.format(datecellvalue);
					//	System.out.print(format1);
						
					
					}					
	    	}
		  }
   	    }
	  }
}