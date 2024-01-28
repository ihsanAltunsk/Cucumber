package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"html:target/html-reports/rapor.html",
            "json:target/json-reports/cucumber.json",
            "junit:target/xml-reports/cucumber.xml"},
    features = "src/test/resources1/features", //Where are the Feature/Scenario(s) to be executed?
    glue = "stepDefinitions", // Where are the codes for the Feature/Scenario(s) to be executed?
    tags = "@wip", //Which Feature/Scenario(s) will be executed?
    dryRun = false //Setting it to true provides the incomplete steps without running the test.
                   //dryRun must be false when running the tests.
)

public class Runner {}
    /*
    The Runner class can be likened to the xml files in TestNG.
    Through the Runner, we can execute the desired features/scenarios
    either individually or collectively.

    The Runner class not only runs our tests but also automatically
    handles the build process by specifying the locations of the files
    required for our framework to operate.

    Inside the Runner class, there is no code; it is an empty class.
    The two annotations that will actually perform the tasks are
    responsible for the build process, which is handled by the
    @CucumberOptions annotation.
                                */
