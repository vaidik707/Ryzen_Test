package FileReadWrite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelpath, String sheetName) {
		try {
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetName);
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public void getCellData(int rowNum, int cellNum) throws IOException {
		
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		System.out.println(value);
	}
	
	public void getRowCount() throws IOException {
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("Number of row count: "+rowCount);
		
	
		
		
	}

}
