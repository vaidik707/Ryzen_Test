package FileReadWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelShhet {

	public static void main(String[] args) {
		
		//Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//Blank sheet
		XSSFSheet sheet = workbook.createSheet("Employee data");
		
		//Data needs to be written (Object[])
		
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"id", "Name", "Lastname"});
		data.put("2", new Object[] {1, "Vaidik", "Soni"});
		data.put("3", new Object[] {2, "Hardik", "Soni"});
		data.put("4", new Object[] {3, "Samkit", "Jain"});
		
		
		//Write data in the sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for(String key : keyset) {
			Row row =sheet.createRow(rownum++);
			Object[] objectArr = data.get(key);
			
			int cellnum = 0;
			for(Object obj : objectArr) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		try {
			FileOutputStream out =  new FileOutputStream(new File("Java1.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("File created succesfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
