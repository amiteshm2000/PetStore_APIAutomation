package api.utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="createUser")
	public String[][] createUser() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\UserTestData.xlsx", "createUser");
		int rowNum =exc.getRowCount();
		int cellNum=exc.getCellCount();
		
		String[][] data = new String[rowNum][cellNum];
		
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				data[i-1][j]=exc.getCellValue(i, j);
			}
		}
	return data;
	}
	
	@DataProvider(name="getUser")
	public String[] getUser() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\UserTestData.xlsx", "getUser");
		int rowNum =exc.getRowCount();	
		String[] data = new String[rowNum];
		
		for(int i=1;i<=rowNum;i++) {
				data[i-1]=exc.getCellValue(i, 0);
			}
	return data;
	}
	
	@DataProvider(name="deleteUser")
	public String[] getItemData() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\UserTestData.xlsx", "deleteUser");
		int rowNum =exc.getRowCount();	
		String[] data = new String[rowNum];
		
		for(int i=1;i<=rowNum;i++) {
				data[i-1]=exc.getCellValue(i, 0);
			}
	return data;
	}
	
	@DataProvider(name="updateUser")
	public String[][] updateUser() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\UserTestData.xlsx", "updateUser");
		int rowNum =exc.getRowCount();
		int cellNum=exc.getCellCount();
		
		String[][] data = new String[rowNum][cellNum];
		
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<cellNum;j++) {
				data[i-1][j]=exc.getCellValue(i, j);
			}
		}
	return data;
	}
}

