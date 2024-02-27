package ruuners;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "classpath:features", //or can give path "src\test\resources\features"
		  glue = "steps",
		 tags = "@codeFiosAddNewAccountFeature",
		  monochrome = true,
		  dryRun = false,
		  plugin = {
				  "pretty",
				  "html:target/reports/cucumber.html",
				  "json:target/reports/cucumber.json"
				    
				  
		  }
		)
public class Runner {

}
