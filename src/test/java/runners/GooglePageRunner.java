package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//GooglePageSearch1.feature",		

		glue = {"stepDefs"},
	monochrome = true,
	dryRun = true,
	plugin= {"pretty",
"html:target//Reports//HtmlReport.html",
"usage:target//Reports//UsageReport",
"json:target//Reports//JsonReport.json",
"rerun:target//failedScenarios.txt"
}

)

public class GooglePageRunner extends  AbstractTestNGCucumberTests  {
  
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	


}
