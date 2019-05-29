package Draw;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draw {
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
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youidraw.com/apps/painter/");
		WebElement canvas = driver.findElement(By.xpath("//*[@id=\"painter\"]"));
		action.moveToElement(canvas, 0,0).perform();
		Thread.sleep(1000);
		action.moveByOffset(200,150).clickAndHold().moveByOffset(300,0).release().moveByOffset(-150,0).clickAndHold().moveByOffset(0,150).moveByOffset(-150, 0).release().perform();
		Thread.sleep(200);
		action.moveByOffset(320, -150).clickAndHold().moveByOffset(0, 150).moveByOffset(80, 0).moveByOffset(0, -150).release().perform();
		Thread.sleep(200);
		action.moveByOffset(20, 0).clickAndHold().moveByOffset(0, 150).moveByOffset(0, -150).moveByOffset(100, 150).moveByOffset(0, -150).release().perform();
		Thread.sleep(2000);
	}

}
