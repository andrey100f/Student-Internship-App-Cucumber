package ro.ubb;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/UserProfiles.feature",
        glue = "steps"
)
public class UserProfileTest {}
