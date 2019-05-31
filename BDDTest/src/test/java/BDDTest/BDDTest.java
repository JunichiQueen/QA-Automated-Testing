package BDDTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDTest {
	static WebDriver driver;
	
	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver74\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public static void finalise() {
		driver.quit();
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws InterruptedException {
		driver.manage().window().maximize();
	    driver.get("http://www.practiceselenium.com/welcome.html");
	    Thread.sleep(1000);
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws InterruptedException {
	    WebElement we = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
	    Thread.sleep(1000);
	    we.click();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws InterruptedException {
	    WebElement we2 = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong"));
	    Thread.sleep(1000);
		assertTrue(we2.getText().contains("Green Tea"));
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws InterruptedException  {
		WebElement we = driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
	    Thread.sleep(1000);
	    we.click();
	    WebElement we2 = driver.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span"));
	    Thread.sleep(1000);
	    we2.click();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		WebElement we2 = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000451990420\"]/div/pre/strong/span"));
	    assertTrue(we2.getText().equals("Enter your billing information"));
	}

}
