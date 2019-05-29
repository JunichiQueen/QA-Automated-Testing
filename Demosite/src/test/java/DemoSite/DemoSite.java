package DemoSite;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {
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
	public void method1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk");
		WebElement we2 = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		we2.click();
		WebElement createuser = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		createuser.sendKeys("Junichi");
		WebElement createpass = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		createpass.sendKeys("Password");
		createpass.submit();
		WebElement we5 = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		we5.click();
		WebElement inputuser = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		inputuser.sendKeys("Junichi");
		WebElement inputpass = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		inputpass.sendKeys("Password");
		inputpass.submit();
		WebElement test = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", test.getText());
		Thread.sleep(2000);
	}

}
