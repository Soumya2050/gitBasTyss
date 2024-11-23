package apractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.GTMange.TransSoft.genericutility.ExcelUtility;

public class Test3 {
	
	public static void main(String[] args) throws Throwable {
		ExcelUtility excel = new ExcelUtility();
		String path ="C:\\Users\\srjen\\OneDrive\\Desktop\\Contract Requests - Status Transition Report_20240418.xlsx";
//		 FileInputStream file = new FileInputStream(new File("C:\\Users\\srjen\\OneDrive\\Desktop\\Contract Requests - Status Transition Report_20240418.xlsx"));
//	        Workbook workbook = new XSSFWorkbook(file);
//	        Sheet sheet = workbook.getSheetAt(0);
//
//	        // Get the count of the first column
//	        int excelFirstColumnCount = 0;
//	        for (Row row : sheet) {
//	            if (row.getCell(0) != null && row.getCell(0).getCellType() != CellType.BLANK) {
//	                excelFirstColumnCount++;
//	                System.out.println(row.getCell(0).toString());
//	            }
//	        }
//	        System.out.println(excelFirstColumnCount);
//	        workbook.close();
	        
//	        String s=excel.getDataFromExcelBasedTestId(path, "Data", "5", "0");
//	        System.out.println(s);
		
//		int roe=excel.getRowCount(path, "Data");
//		System.out.println(roe);
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Data");
		int rowCount = sheet.getLastRowNum()-4;
		int count = 0;
		for (int i = 0; i <= rowCount; i++) {
		    Row row = sheet.getRow(i);
		    if (row != null) {
		        Cell cell = row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
		        String data = cell.toString().trim();
		        if (!data.equals("")) {
		            count++;
		        }
		    }
		}
		System.out.println(count);
	
	}
}
