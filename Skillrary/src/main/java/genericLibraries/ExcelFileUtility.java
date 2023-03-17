package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/* This class contains reusable methods to perform 
 * operations on the Excelss file
 */
public class ExcelFileUtility {
	private Workbook wb;
//This method is used to initialize Excel file
	public void excelInitialization(String excelPath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {

			e.printStackTrace();
		}
	}
	// This method is used to fetch single data from Excel file

	public String fetchExcelData(String sheetName, int rowNum, int cellNum) {
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	// This method is used to fetch multiple data from Excel file
	public List<String> fetchExcelData(String sheetName) {
		List<String> list = new ArrayList<>();
		Sheet sheet = wb.getSheet(sheetName);
		for (int i = 0; i < 4; i++) {
			String data = sheet.getRow(i).getCell(1).getStringCellValue();
			list.add(data);
		}
		return list;
	}
	//This method is used to close the workbook

	public void closeWorkbook() {
		try {
			wb.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
