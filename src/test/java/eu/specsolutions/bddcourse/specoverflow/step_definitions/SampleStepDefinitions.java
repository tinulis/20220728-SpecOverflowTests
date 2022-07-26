package eu.specsolutions.bddcourse.specoverflow.step_definitions;

import eu.specsolutions.bddcourse.specoverflow.support.BrowserContext;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleStepDefinitions {

    @Autowired
    private BrowserContext browserContext;

    @When("some action is performed using the browser")
    public void someActionIsPerformedUsingTheBrowser() {
    }
}
