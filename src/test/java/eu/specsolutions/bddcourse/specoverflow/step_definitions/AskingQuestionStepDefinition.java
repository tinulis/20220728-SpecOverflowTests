package eu.specsolutions.bddcourse.specoverflow.step_definitions;

import eu.specsolutions.bddcourse.specoverflow.support.BrowserContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AskingQuestionStepDefinition {

    @Autowired
    private BrowserContext browserContext;

    @Given("the user logged as an authorised user")
    public void theUserLoggedAsAnAuthorisedUser() throws InterruptedException {
        browserContext.getDriver().get(browserContext.getBaseUrl());
        browserContext.getDriver().findElement(By.cssSelector("div > a[onclick='defaultLogin()']")).click();
        //browserContext.pauseForDebug();
        Thread.sleep(2000);
    }

    @When("the user selects ask question")
    public void theUserSelectsAskQuestion() throws InterruptedException {
        browserContext.getDriver().findElement(By.xpath("//a[text()='Ask Question']")).click();
        //browserContext.pauseForDebug();
        Thread.sleep(2000);
    }

    @And("the user enters Title, Body, and Tags")
    public void theUserEntersTitleBodyAndTags() throws InterruptedException {
        browserContext.getDriver().findElement(By.id("TitleInput")).sendKeys("What is Junit");
        //browserContext.pauseForDebug();
        Thread.sleep(2000);
        browserContext.getDriver().findElement(By.id("BodyInput")).sendKeys("What are the annotations of Junit?");
        //browserContext.pauseForDebug();
        Thread.sleep(2000);
        browserContext.getDriver().findElement(By.id("Tags")).sendKeys("annotations");
        //browserContext.pauseForDebug();
        Thread.sleep(2000);
    }

    @And("the user submits the question")
    public void theUserSubmitsTheQuestion() throws InterruptedException {
       //browserContext.getDriver().findElement(By.xpath("//input[@value='Post your question']")).click();
        browserContext.getDriver().findElement(By.id("PostQuestionButton")).click();
        Thread.sleep(2000);
      //  browserContext.pauseForDebug();
    }

    @Then("the question is posted successfully")
    public void theQuestionIsPostedSuccessfully() {
        assertTrue(browserContext.getDriver().findElement(By.id("QuestionTitle")).isDisplayed());
        new WebDriverWait(browserContext.getDriver(), 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("QuestionTitle")));
    }
}
