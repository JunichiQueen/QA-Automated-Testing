package DDTExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDTExcelTest {
	static WebDriver driver;

	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver74\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		FileInputStream file = null;
		try {
			file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
		} catch (FileNotFoundException e) {
			System.out.println(Constant.Path_TestData + Constant.File_TestData);
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e1) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);

		// XSSFCell cell = sheet.getRow(0).getCell(0);
		// System.out.println(cell.getStringCellValue());

		driver.manage().window().maximize();
		driver.get(Constant.URL2);
		for (int i = 0; i < 4; i++) {
			WebElement myDynamicElement1 = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
							"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")));
			WebElement userbox = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
			userbox.click();
			userbox.sendKeys(sheet.getRow(i + 1).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(i + 1).getCell(0).getStringCellValue());
			WebElement passbox = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
			passbox.click();
			passbox.sendKeys(sheet.getRow(i + 1).getCell(1).getStringCellValue());
			System.out.println(sheet.getRow(i + 1).getCell(1).getStringCellValue());
			passbox.submit();
			WebElement checksuccess = driver
					.findElement(By.xpath("//blockquote/blockquote/font/center/b"));
			if (checksuccess.getText().equals("**Successful Login**")) {
				XSSFCell cell = sheet.getRow(i + 1).createCell(2);
				cell.setCellValue("Success");
				driver.get(Constant.URL2);
				Thread.sleep(200);
			} else {
				XSSFCell cell = sheet.getRow(i + 1).createCell(2);
				cell.setCellValue("Fail");
				driver.get(Constant.URL2);
				Thread.sleep(200);
			}

			

		}
		try {
			FileOutputStream out = new FileOutputStream(new File(Constant.Path_TestData + Constant.File_TestData));
			workbook.write(out);
			out.close();
			System.out.println("File saved without issue");
		} catch (IOException e) {
			System.out.println("error");
		}
		Thread.sleep(10000);

	}
}
