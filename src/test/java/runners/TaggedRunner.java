package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//taggedFeatures//",		

		glue = {"stepDefs"},
	monochrome = true,
	dryRun = false,
	//tags = "@SmokeTest"
	//tags = "@RegresionTest"
	//tags = "@SmokeTest or @RegresionTest"
			//tags = "@SmokeTest and @RegresionTest"
		//	tags = "@PhaseOne"
			tags = "@PhaseOne and @SmokeTest"
					tags = "@PhaseOne and not @RegresionTest"
							tags = "not @PhaseOne and not @RegresionTest"


}

)

public class TaggedRunner extends  AbstractTestNGCucumberTests  {
  
	

}
