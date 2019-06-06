package com.ghana.app.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {

	public static void main(String[] args) throws IOException {
		readDataUsingFroLoop();
		System.out.println("Using for loop done");
		normalDataRead();
		System.out.println("Using normal done");
		readDataFromExcell(5, 2, 2);
		/*// File is class where store the file path.
		File src = new File(
				"E:\\VisaProject\\GhanaNewVisaApp\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");

		// FileInputStream is class where we load the file.
		FileInputStream fis = new FileInputStream(src);

		// If the file extension is xls then we use HSSFWorkbook
		// If the file extension is xlsx then we use XSSFWorkbook. We use this
		// both to load workbook

		// Load work book
		// HSSFWorkbook hb = new HSSFWorkbook(fis);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// load sheet here we are loading 5 sheet and sheet index start from 0.
		//
		XSSFSheet sheet = wb.getSheetAt(5);
		int row = sheet.getLastRowNum();
		for (int i = 1; i < row; i++) {
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());

		}*/

	}

	public static void normalDataRead() throws IOException  {

			File src = new File("E:\\VisaProject\\GhanaNewVisaApp\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");
			try {
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook hb = new XSSFWorkbook(fis);
				XSSFSheet fs=hb.getSheetAt(5);
				System.out.println(fs.getRow(0).getCell(0).getStringCellValue());
					
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	public static void readDataUsingFroLoop() throws IOException {

		File src  = new File("E:\\VisaProject\\GhanaNewVisaApp\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet hf =wb.getSheetAt(5);
		int row =hf.getLastRowNum();
		for (int i = 1; i<row; i++){
		System.out.println(hf.getRow(i).getCell(0).getStringCellValue());
		}
	
	}
	
	public static void readDataFromExcell(int sheetName, int row_number, int colomn_number) throws IOException{
		System.out.println("reading cell cutomize method");
		File src = new File("E:\\VisaProject\\GhanaNewVisaApp\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaTestData1.xlsx");
		FileInputStream fis  = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(sheetName);
		sheet.getRow(row_number).getCell(colomn_number).getStringCellValue();
		System.out.println(sheet.getRow(row_number).getCell(colomn_number).getStringCellValue());
		System.out.println("reading cell cutomize method done");
	}
}
