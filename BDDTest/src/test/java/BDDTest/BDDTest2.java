package BDDTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDTest2 {
	static WebDriver driver;
	
	/*@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver74\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public static void finalise() {
		driver.quit();
	}*/
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
	    driver.manage().window().maximize();
		driver.navigate().to(arg1);
	}
	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
	    WebElement we = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
	    we.click();
	    we.sendKeys(arg1);
	    we.submit();
	    WebElement myDynamicElement1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sb_form\"]/div")));
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() {
	    WebElement we = driver.findElement(By.xpath("//*[@id=\"b_header\"]/nav/ul/li[1]/a"));
	    assertTrue(we.getText().equals("All"));
	    
	}

}
