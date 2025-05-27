package ExcelDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExcelDrive {


	@Test(dataProvider="driveTest")
	public void testCaseDrive(String greetings, String communication, String id)
	{
//		System.out.println(greetings + " " + communication + " " + id);
		ArrayList<String> output = new ArrayList<String>(Arrays.asList(greetings, communication, id));
		System.out.println(output);
	}
	
	
	@DataProvider(name="driveTest")
	public Object[][] getData() throws IOException
	{
		DataFormatter formatter = new DataFormatter(); // to format the cell. from int to String
		FileInputStream fis = new FileInputStream("C:/Users/mahes/DemoData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sample");
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		
		Object data[][] = new Object[rowCount-1][colCount];
		for (int i=0; i<rowCount-1; i++)
		{
			row = sheet.getRow(i+1);
			for(int j=0; j<colCount; j++)
			{
				XSSFCell cell =row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		return data;
		
	}
}
