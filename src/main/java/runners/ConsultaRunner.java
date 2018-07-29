package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "projectfeatures"
				,glue = "stepdefinitions"
				,tags = {"@historia1"}
				,snippets = SnippetType.CAMELCASE
				)

public class ConsultaRunner {

}
