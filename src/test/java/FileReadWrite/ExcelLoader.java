package FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLoader {
	
	private static XSSFSheet xssfSheet;

	private static XSSFWorkbook xssfWorkbook;

	private static XSSFCell xssfCell;


	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

	String[][] tabArray = null;

	try {

	FileInputStream ExcelFile = new FileInputStream(FilePath);

	// Access the required test data sheet

	xssfWorkbook = new XSSFWorkbook(ExcelFile);

	xssfSheet = xssfWorkbook.getSheet(SheetName);


	int startRow = 1;

	int startCol = 0;

	int ci, cj;

	int totalRows = xssfSheet.getLastRowNum();

	// you can write a function as well to get Column count

	int totalCols = xssfSheet.getRow(0).getPhysicalNumberOfCells()-1;

	tabArray = new String[(totalRows+1)-startRow][(totalCols+1)-startCol];

	ci = 0;

	for (int i = startRow; i <= totalRows; i++, ci++) {

	cj = 0;

	for (int j = startCol; j <= totalCols; j++, cj++) {

	tabArray[ci][cj] = (getCellData(i, j)).toString();

	// System.out.println(tabArray[ci][cj]);

	}

	}

	}

	catch (FileNotFoundException e) {

	System.out.println("Could not read the Excel sheet");

	e.printStackTrace();

	}

	catch (IOException e) {

	System.out.println("Could not read the Excel sheet");

	e.printStackTrace();

	}

	return (tabArray);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

	try {

	xssfCell = xssfSheet.getRow(RowNum).getCell(ColNum);
	DataFormatter dataFormatter = new DataFormatter();
	String CellData = dataFormatter.formatCellValue(xssfCell);

	return CellData;

	} catch (Exception e) {

	System.out.println(e.getMessage());

	throw (e);

	}

	}
	public static void updateTestDataInTestSheet(String excelName, String key, String value, String dataRow, String sheetName) throws Exception {
	File file = new File(excelName);
	FileInputStream fileInputStream = new FileInputStream(file);
	@SuppressWarnings("resource")
	XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
	XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
	int lastRowNum = Integer.parseInt(dataRow);
	// int lastRowNum=Integer.valueOf(dataRow);
	int lastCellNum = xssfSheet.getRow(0).getLastCellNum();
	xssfSheet.autoSizeColumn(lastCellNum);
	for (int i = 0; i < lastRowNum; i++) {
	int j=0;
	Cell cell= null;
	try {
	for (; j < lastCellNum; j++) {
	if (xssfSheet.getRow(0).getCell(j).toString().equalsIgnoreCase(key) && i == Integer.parseInt(dataRow)-1) {
	cell = xssfSheet.getRow(i + 1).getCell(j);
	if (cell == null) {
	cell = xssfSheet.getRow(i + 1).createCell(j);
	}
	cell.setCellValue(value);
	}
	}
	} catch (Exception e) {
	Row row = xssfSheet.createRow(i + 1);
	cell = row.createCell(j);
	cell.setCellValue(value);
	// throw new Exception("Problem While setting data @rowNUM= " + dataRow + "and for key " + key);
	}
	}

	fileInputStream.close();
	FileOutputStream outFile = new FileOutputStream(excelName);
	xssfWorkbook.write(outFile);
	outFile.close();

	}
	public static String readExcel(String filePath,String key, String row, String sheetName) throws IOException {

	File file = new File(filePath);
	FileInputStream fileInputStream = new FileInputStream(file);
//	@SuppressWarnings("resource")
	XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
	XSSFSheet xssfSheet = xssfWorkbook.getSheet(sheetName);
	//int lastRowNum = xssfSheet.getLastRowNum();
	int lastCellNum = xssfSheet.getRow(0).getLastCellNum();
	xssfSheet.autoSizeColumn(lastCellNum);
	int rowNumber= Integer.parseInt(row);
	for (int j=0; j < lastCellNum; j++) {
	if( xssfSheet.getRow(0).getCell(j).toString().equalsIgnoreCase(key)) {
	return (xssfSheet.getRow(rowNumber).getCell(j)).toString();
	}
	}
	return null;
	}

}
