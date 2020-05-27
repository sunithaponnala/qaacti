package com.acti.Utils;


	

	import java.io.File;
	import java.io.FileInputStream;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelHelper {
		XSSFWorkbook excel;
		
		public ExcelHelper() 
		
		// created constructor with try catch exception to avoid twice throw declaration
		{
			try
			{
				File src = new File("./testdata/TestData.xlsx");
				FileInputStream fis = new FileInputStream(src);
						excel = new XSSFWorkbook(fis);
			}
			
			catch (Exception e)
			{
			System.out.println("Excel sheet failed to load "+e.getMessage());	
			}
		}
			//get the count of active rows
		public int getRowcount(int sheetnum)
			{
				return excel.getSheetAt(0).getLastRowNum()+1;
			}
		 public int getRowcount1(String sheetName)
		 {
			 return excel.getSheet(sheetName).getLastRowNum()+1;
		 }
		
		//get the values from the cell
		public String getcellData(int sheetnum,int row,int col)
		{
			return excel.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
			
		}
		}
		




