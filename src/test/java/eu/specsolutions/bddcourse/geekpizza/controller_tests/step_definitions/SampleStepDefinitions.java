package eu.specsolutions.bddcourse.geekpizza.controller_tests.step_definitions;

import eu.specsolutions.bddcourse.geekpizza.controller_tests.support.BrowserContext;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleStepDefinitions {

    @Autowired
    private BrowserContext browserContext;

    @When("some action is performed using the browser")
    public void someActionIsPerformedUsingTheBrowser() {
    }
}
