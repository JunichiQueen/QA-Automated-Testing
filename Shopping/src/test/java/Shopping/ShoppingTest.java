package Shopping;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingTest {
	static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver74\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void teardown() {
		driver.quit();
	}
	
	@Test
	public void method1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement we = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		we.click();
		we.sendKeys("Dress");
		we.submit();
		Thread.sleep(200);
		//WebElement we2 = driver.findElement(By.xpath("results have been found"));
		//we2.click();
				
		
		WebElement myDynamicElement1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")));
		WebElement we3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		we3.click();
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add_to_cart\"]/button/span")));
		Thread.sleep(2000);
		WebElement we4 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		we4.click();
		WebElement myDynamicElement3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
		WebElement we5 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		we5.click();
		WebElement myDynamicElement4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")));
		WebElement we6 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		we6.click();
		WebElement we7 = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		we7.click();
		we7.sendKeys("fakeemail321@hotmail.com");
		WebElement we8 = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		we8.click();
		WebElement myDynamicElement5 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer_firstname\"]")));
		WebElement we9 = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		we9.click();
		we9.sendKeys("Donald");
		WebElement we10 = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		we10.click();
		we10.sendKeys("Duck");
		WebElement we101 = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		we101.click();
		we101.sendKeys("password");
		WebElement we11 = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		we11.click();
		we11.sendKeys("Donald");
		WebElement we12 = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		we12.click();
		we12.sendKeys("Duck");
		WebElement we13 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		we13.click();
		we13.sendKeys("123 Fake Street, SL2 4SM");
		WebElement we14 = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		we14.click();
		we14.sendKeys("London");
		WebElement we15 = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		we15.click();
		we15.sendKeys("SL2SM");
		WebElement we16 = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		we16.click();
		we16.sendKeys("08391238490");
		WebElement we17 = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		we17.click();
		we17.sendKeys("Tex");
		WebElement we18 = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
		we18.click();
		we18.sendKeys("Lil Donny");
		we18.submit();
		WebElement we19 = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		we19.click();
		
		
		
		//String string1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
		//assertTrue(string1.contains("results have been found"));
		Thread.sleep(200000);
	}

}
