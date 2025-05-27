package ExcelDataDriven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
//	Identify the testcases column by scanning the entire 1st row
//	once column is identified then scan the entire column to identify the purchase testcase row
//	after you grab the purchase testcase row pull all the data of that row and feed into test

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
//		System.out.println(getData("Delete profile"));	
	}
	
	public ArrayList<String> getData(String testcasename) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:/Users/mahes/DemoData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		ArrayList<String> a = new ArrayList<String>();
		
		for(int i=0; i<sheets; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
//				Identify the testcases column by scanning the entire 1st row
				
				Iterator<Row> rows = sheet.rowIterator(); // sheet is collection of rows
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator(); // row is collection of cells
				int k = 0;
				int column = 0;
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					if(cell.getStringCellValue().equalsIgnoreCase("testcases"))
					{
						column = k;
					}
					k++;
				} 
				
				System.out.println(column);
				
//				once column is identified then scan the entire column to identify the purchase testcase row
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
					{
//						after you grab the purchase testcase row pull all the data of that row and feed into test

						Iterator<Cell> c= r.cellIterator();
						while(c.hasNext())
						{
							Cell cc = c.next();
							if(cc.getCellType()==CellType.STRING)
							{
								a.add(cc.getStringCellValue());
							}
							else
								a.add(NumberToTextConverter.toText(cc.getNumericCellValue()));
						}
					}
				} 
			}
		}
		return a;
		
	}

}
