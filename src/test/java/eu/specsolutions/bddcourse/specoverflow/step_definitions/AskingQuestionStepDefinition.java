package eu.specsolutions.bddcourse.specoverflow.step_definitions;

import eu.specsolutions.bddcourse.specoverflow.support.BrowserContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AskingQuestionStepDefinition {

    @Autowired
    private BrowserContext browserContext;

    @Given("the user logged as an authorised user")
    public void theUserLoggedAsAnAuthorisedUser() {
        browserContext.getDriver().get(browserContext.getBaseUrl());
        browserContext.getDriver().findElement(By.cssSelector("div > a[onclick='defaultLogin()']")).click();
        browserContext.pauseForDebug();
    }

    @When("the user selects ask question")
    public void theUserSelectsAskQuestion() {
        browserContext.getDriver().findElement(By.xpath("//a[text()='Ask Question']")).click();
        browserContext.pauseForDebug();
    }

    @And("the user enters Title, Body, and Tags")
    public void theUserEntersTitleBodyAndTags() {
        browserContext.getDriver().findElement(By.id("TitleInput")).sendKeys("What is Junit");
        browserContext.pauseForDebug();
        browserContext.getDriver().findElement(By.id("BodyInput")).sendKeys("What are the annotations of Junit?");
        browserContext.pauseForDebug();
        browserContext.getDriver().findElement(By.id("Tags")).sendKeys("annotations");
        browserContext.pauseForDebug();
    }

    @And("the user submits the question")
    public void theUserSubmitsTheQuestion() {
        browserContext.getDriver().findElement(By.xpath("//input[@value='Post your question']")).click();
        browserContext.pauseForDebug();
    }

    @Then("the question is posted successfully")
    public void theQuestionIsPostedSuccessfully() {
        assertTrue(browserContext.getDriver().findElement(By.id("QuestionTitle")).isDisplayed());
    }
}
