package Runner;

import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"F:\\Cucumber\\BDD_Framework_with_data_driven_aproach\\src\\main\\java\\Features"},
		glue= {"Step_Defination"},
		monochrome= true,
		//strict=true,
		dryRun=false,
		format= {"pretty","html:reports"}
		)

public class runner  {

}
