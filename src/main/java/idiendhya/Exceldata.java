package idiendhya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {

	public static void main(String[] args) throws Throwable {

		FileInputStream fi= new FileInputStream("C:\\Users\\home\\eclipse-workspace\\Dell001\\src\\test\\resources\\TestCaseTemplate.xls");
		
		Workbook wb=WorkbookFactory.create(fi);
		
			Sheet sh = wb.getSheet("Test Case 1");
			
			Row ro=sh.getRow(1);
			
			Cell cl=ro.getCell(3);
			
			String value = cl.getStringCellValue();
			
			System.out.println(value);
			
			
			
			
		}
		
		
		
		
		
	}


