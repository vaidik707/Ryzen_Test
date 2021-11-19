package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFile {
	
	static String projectDir = System.getProperty("user.dir");
	static String excelPath = projectDir+"/data/TestData.xlsx";
	
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream file = new FileInputStream(new File(excelPath));
			XSSFWorkbook workbook =new XSSFWorkbook(file);
			DataFormatter formatter = new DataFormatter();
			
			Iterator<Sheet> sheets = workbook.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				System.out.println("Sheet name is: "+ sh.getSheetName());
				System.out.println("--------------------------");
				
				Iterator<Row> row = sh.iterator();
				while(row.hasNext()) {
					Row rows = row.next();
					
					Iterator<Cell> cellIterator = rows.iterator();
					while(cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						String cellvalue = formatter.formatCellValue(cell);
						
						System.out.print(cellvalue+ "\t");
					}
					System.out.println();
				}
			}
			workbook.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
