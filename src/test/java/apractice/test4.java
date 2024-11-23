package apractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test4 {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fin= new FileInputStream(new File("C:\\Users\\srjen\\OneDrive\\Desktop\\Contract Requests - Status Transition Report_20240418.xlsx"));
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sheet = wb.getSheet("Data");
		int rowCount=sheet.getLastRowNum();
		int testrowno = 0;
		String acttestId = "";
		String data = "";
		for (int i = 0; i <= rowCount; i++) {
			try {
				 acttestId = sheet.getRow(i).getCell(0).toString();} catch (Exception e) {}

			if (acttestId.equalsIgnoreCase("id")) {
				break;
			}
			testrowno++;
		}
		int cellCount=sheet.getRow(testrowno-1).getLastCellNum();
		int testcolno=0;
		for (int i = 0; i <cellCount ; i++) {
			String actcolHeader = sheet.getRow(testrowno-1).getCell(i).toString();
			if (actcolHeader.equalsIgnoreCase("Contract Requests - Status Transition Report")) {
				break;
			}
			testcolno++;
		}
		try { 
			data = sheet.getRow(testrowno).getCell(testcolno).toString();
			System.out.println(data);
			} catch (Exception e) {}
		
		wb.close();
	}

}
