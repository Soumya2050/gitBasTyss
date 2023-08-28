package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] storeData(){
		
		Object[][] obj = new Object[3][2];
		obj[0][0]="Bangalore";
		obj[0][1]="Odisha";
		
		obj[1][0]="Odisha";
		obj[1][1]="Bangalore";
		return obj;
	}
	
	@Test(dataProvider = "storeData")
	public void readDataFromDataProvider(String src,String dest) {
		System.out.println(src+"  to  "+dest);
	}

}
