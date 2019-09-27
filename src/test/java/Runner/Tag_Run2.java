package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature//TagDemo.Feature",tags= {"@End2End"})

public class Tag_Run2 {

}
