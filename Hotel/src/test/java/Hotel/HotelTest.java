package Hotel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\ChromeDriver74\\\\chromedriver.exe");
		driver = new ChromeDriver();
				
	}
	
	@AfterClass
	public static void teardown() {
		driver.quit();
	}
	
	@Test
	public void method1() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		WebElement locsearch = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a/span[1]"));
		locsearch.click();
		locsearch.sendKeys("London");
		//WebElement we2 = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		//we2.click();
		//WebElement sel29 = driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[4]"));
		//sel29.click();
		//WebElement sel31 = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[6]"));
		//sel31.click();
		Thread.sleep(2000);
		
	}

}
