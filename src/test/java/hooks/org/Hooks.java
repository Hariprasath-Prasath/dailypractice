package hooks.org;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks extends DriverInstance{
	
	
	
	@BeforeStep
	private void beforStep(Scenario Scenario) {
		
	}
	
	@AfterStep
	private void afterStep(Scenario Scenario) {
		
	}
	
	@Before
	public void BeforeScenario(Scenario Scenario) {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
		
	}
	@After
	public void AfterScenario(Scenario Scenario) {
		boolean failed = Scenario.isFailed();
		System.out.println("is Failed :"+failed);
			byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Scenario.attach(screenshotBytes, "image/png", "hari");
			driver.close();
	}	
}
