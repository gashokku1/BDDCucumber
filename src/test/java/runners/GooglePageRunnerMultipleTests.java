package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//",		

		glue = {"stepDefs"},
	monochrome = true,
	dryRun = true,
	plugin= {"pretty",
//"html:target//Reports//HtmlReport.html",
//"usage:target//Reports//UsageReport",
//"json:target//Reports//JsonReport.json",
//"rerun:target//failedScenarios.txt"
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}

)

public class GooglePageRunnerMultipleTests extends  AbstractTestNGCucumberTests{
  
	


}
