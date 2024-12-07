package ro.ubb;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/FilteringAndSearching.feature",
        glue = "steps"
)
public class FilteringAndSearchingTest {}
