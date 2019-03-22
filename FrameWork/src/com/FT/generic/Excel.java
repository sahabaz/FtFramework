package com.FT.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel implements AutoConst
{
	public static String readData(String sheet , int m , int n) throws Exception
	{
		Workbook wb = WorkbookFactory.create(new File(Path));
		String s = wb.getSheet(sheet).getRow(m).getCell(n).toString();
		wb.close();
		//System.out.println(s);
		return s;
	}
	public static void WriteResult(String Sheet ,String Case, String Result) throws IOException, InvalidFormatException
	{
		File f = new File(Path);
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook Book = new XSSFWorkbook(fi);
		int i;
		for(i=0;i<Book.getSheet(Sheet).getLastRowNum();i++)
		{
			if(Book.getSheet(Sheet).getRow(i).getCell(0).getStringCellValue().equals(Case))
				break;
			
		}
		
		 Book.getSheet(Sheet).getRow(i).createCell(7).setCellValue(Result);
			XSSFCellStyle style = Book.createCellStyle();

		if(Result.equals("Pass"))
		{
			style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
			
		}
		else 
		{
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
		
		}
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		Book.getSheet(Sheet).getRow(i).getCell(7).setCellStyle(style);
		
		FileOutputStream fo = new FileOutputStream(f);
		
		fo.flush();
			
		Book.write(fo);
		
		fo.close();
		Book.close();
		
	}

}
