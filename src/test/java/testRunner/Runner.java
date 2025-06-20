package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\login.feature",
		dryRun = !true,
		snippets = SnippetType.CAMELCASE,
		glue = {"stepDefenetion","hooks.org"},
		monochrome = true, 
		plugin = {"pretty",
				"html:target/login.html",
				"json:target/login.json",
				"junit: target/login.xml"
				}
//		tags = "@reg"
		)

public class Runner {

}