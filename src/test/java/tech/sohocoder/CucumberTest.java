package tech.sohocoder;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
//        plugin = {"pretty", "html:target/cucumber"}
        plugin = {"pretty", "json:target/cucumber/cucumber.json", "html:target/cucumber"}
)
public class CucumberTest {
}
