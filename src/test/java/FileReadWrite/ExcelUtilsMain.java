package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsMain {

	public static void main(String[] args) throws IOException {
		String projectDir = System.getProperty("user.dir");
		String excelPath = projectDir+"/data/TestData.xlsx";
		String sheetName = "sheet1";
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(0, 0);
		excel.getCellData(0, 1);
		excel.getCellData(0, 2);
		excel.getCellData(1, 0);
		
//		ExcelLoader.readExcel("sheet1", excelPath, "1", "Name");
		
//		File file = new File(excelPath);
//		FileInputStream fileInputStream = new FileInputStream(file);
////		@SuppressWarnings("resource")
//		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
//		XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
//		//int lastRowNum = xssfSheet.getLastRowNum();
//		int lastCellNum = xssfSheet.getRow(0).getLastCellNum();
//		xssfSheet.autoSizeColumn(lastCellNum);
//		int rowNumber= Integer.parseInt("1");
//		for (int j=0; j < lastCellNum; j++) {
//		if( xssfSheet.getRow(0).getCell(j).toString().equalsIgnoreCase("Name")) {
//			System.out.println((xssfSheet.getRow(rowNumber).getCell(j)).toString());
////		return (xssfSheet.getRow(rowNumber).getCell(j)).toString();
//		
//		}
//		}
////		return null;
//		}
		
//		System.out.println(ExcelLoader.readExcel("Sheet1", "C:\\Users\\hp\\VaidikAutomationTraining\\CDNTraining\\data", "1", "Name"));
	}
}


