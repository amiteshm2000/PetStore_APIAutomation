package api.utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="createUser")
	public String[][] getUserData() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\TestData.xlsx", "createUser");
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
	
	@DataProvider(name="userNames")
	public String[] getItemData() throws IOException{
		
		ExcelUtility exc= new ExcelUtility("./testData\\TestData.xlsx", "createUser");
		int rowNum =exc.getRowCount();	
		String[] data = new String[rowNum];
		
		for(int i=1;i<=rowNum;i++) {
				data[i-1]=exc.getCellValue(i, 0);
			}
	return data;
	}
}

