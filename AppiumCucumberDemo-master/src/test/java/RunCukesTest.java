import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        format = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber-report.json"})

public class RunCukesTest {
}