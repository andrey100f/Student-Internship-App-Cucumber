package ro.ubb;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ApplicationTracking.feature",
        glue = "steps"
)
public class ApplicationTrackingTest {}
