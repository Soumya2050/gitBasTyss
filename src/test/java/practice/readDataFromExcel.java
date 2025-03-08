package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readDataFromExcel {

	@Test
	public void readData() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		String result = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(result);
		wb.close();
	}
	
	@Test
	public void readAllDataFromExcel() throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptdata.xlsx");
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			
			int row=sh.getLastRowNum();
			int cell = sh.getRow(0).getLastCellNum();
			for(int i=0;i<=row;i++) {
				for(int j=0;j<cell;j++) {
					String result=sh.getRow(i).getCell(j).getStringCellValue().toString();
					System.out.println(result);
				}
			}			
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		wb.close();
	}
	

}
