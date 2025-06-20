package stepDefenetion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef extends DriverInstance{
	
//	WebDriver driver;
//	WebDriverWait wait;
	
	@Given("User navigate to application")
	public void userNavigateToApplication() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	}
	@When("user enter product name in {string}")
	public void userEnterProductNameIn(String search_Box) {
	    WebElement sbox = driver.findElement(By.name("q"));
	    sbox.sendKeys(search_Box);
	}
	@When("user Enter the search item")
	public void userEnterTheSearchItem() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	@Then("related products should display {string}")
	public void relatedProductsShouldDisplay(String result) {
	    WebElement result1 = driver.findElement(By.xpath("//span[text()='iphone']"));
	    wait.until(ExpectedConditions.visibilityOf(result1));
	    boolean contains = result1.getText().contains(result);
	    System.out.println(contains);
	    
	}




}
