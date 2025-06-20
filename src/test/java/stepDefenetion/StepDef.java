package stepDefenetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import drivers.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends DriverInstance{


	 
//	 @Given("User navigate to the log web application") 
//	 public void userNavigateToTheLogWebApplication() { 
//	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	 driver.manage().window().maximize(); 
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
//	 driver.get("https://adactinhotelapp.com/"); }
	 

	@Given("User Enter user {string}")
	public void userEnterUser(String name) {
		WebElement Uname = driver.findElement(By.id("username"));
	    Uname.sendKeys(name);
	}
	@Given("User Enter password {string}")
	public void userEnterPassword(String password) {
		WebElement passwrd = driver.findElement(By.id("password"));
	    passwrd.sendKeys(password);
	}
	@When("user click the log in botton")
	public void userClickTheLogInBotton() {
	    WebElement button = driver.findElement(By.id("login"));
	    button.click();
	}
	@Then("User navigate to next page")
	public void userNavigateToNextPage() {
		WebElement wel = driver.findElement(By.xpath("//td[contains(text(),'Welcome')]"));
		boolean contains = wel.getText().contains("Welcome");
		System.out.println(contains);
	}
	@When("invalid login error massage should display")
	public void invalidLoginErrorMassageShouldDisplay() {
	    WebElement invalid = driver.findElement(By.xpath("//b[contains(text(),'Invalid Login')]"));
	    wait.until(ExpectedConditions.visibilityOf(invalid));
	    boolean contains2 = invalid.getText().contains("Invalid Login");
	    System.out.println(contains2);
	}


}
