package LoginApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenApachePOI {

	static WebDriver driver;
	List<String> usernameList = new ArrayList<String>();
	List<String> passwordList = new ArrayList<String>();

	public void readExcel() throws IOException {

		FileInputStream excel = new FileInputStream("C:\\Users\\mahes\\TestDataApache.xlsx");
		Workbook workbook = new XSSFWorkbook(excel);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {
			Row rowValue = rowIterator.next();
			Iterator<Cell> columnIterator = rowValue.cellIterator();
			int i = 2;
			while (columnIterator.hasNext()) {
				if (i % 2 == 0) {
					usernameList.add(columnIterator.next().getStringCellValue());
				} else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}
				i++;
			}

		}

	}

	public void login(String uName, String pWord) {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		WebElement username = driver.findElement(By.id("userEmail"));
		WebElement password = driver.findElement(By.id("userPassword"));
		WebElement login = driver.findElement(By.id("login"));

		username.sendKeys(uName);
		password.sendKeys(pWord);
		login.click();
	}

	public void executeTest() {
		for (int i = 0; i < usernameList.size(); i++) {
			login(usernameList.get(i), passwordList.get(i));
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataDrivenApachePOI apachePOI = new DataDrivenApachePOI();
		apachePOI.readExcel();
		apachePOI.executeTest();
	}

}
