package eu.specsolutions.bddcourse.specoverflow.step_definitions;

import eu.specsolutions.bddcourse.specoverflow.support.BrowserContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

public class RegistrationStepDefinition {

    @Autowired
    private BrowserContext browserContext;

    @Given("user starts the registration")
    public void userStartsTheRegistration() throws InterruptedException {
        browserContext.getDriver().get(browserContext.getBaseUrl());
       // browserContext.getDriver().findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        Thread.sleep(2000);
        browserContext.getDriver().findElement(By.linkText("Register")).click();
       //browserContext.pauseForDebug();
        Thread.sleep(2000);
    }

    @When("user enters username as {string}")
    public void userEntersUsernameAs(String name) throws InterruptedException {
        browserContext.getDriver().findElement(By.id("UserName")).sendKeys(name);
        Thread.sleep(2000);
       // browserContext.pauseForDebug();
    }

    @And("user enters password and re-enter password as {string}")
    public void userEntersPasswordAndReEnterPasswordAs(String password) throws InterruptedException {
        browserContext.getDriver().findElement(By.id("Password")).sendKeys(password);
        browserContext.getDriver().findElement(By.id("PasswordReEnter")).sendKeys(password);
        Thread.sleep(2000);
       // browserContext.pauseForDebug();
    }

    @When("user finishes the registration")
    public void userFinishesTheRegistration() throws InterruptedException {
        browserContext.getDriver().findElement(By.id("RegisterButton")).click();
        Thread.sleep(2000);
       // browserContext.pauseForDebug();
    }

    @Then("user is successfully registered")
    public void userIsSuccessfullyRegistered() {
        assertTrue(browserContext.getDriver().getTitle().contains("Login - Spec Overflow"));
        new WebDriverWait(browserContext.getDriver(), 5).until(ExpectedConditions.titleIs("Login - Spec Overflow"));
    }

    @And("user enters password re-enter password as {string}")
    public void userEntersPasswordReEnterPasswordAs(String password2) throws InterruptedException {
        browserContext.getDriver().findElement(By.id("Password")).sendKeys(password2);
        browserContext.getDriver().findElement(By.id("PasswordReEnter")).sendKeys(password2);
        Thread.sleep(2000);
        //browserContext.pauseForDebug();
    }

    @Then("successful registration")
    public void successfulRegistration() {
       assertTrue(browserContext.getDriver().getTitle().contains("Login - Spec Overflow"));
        new WebDriverWait(browserContext.getDriver(), 5).until(ExpectedConditions.titleIs("Login - Spec Overflow"));
    }

    @When("user enters username")
    public void userEntersUsername() throws InterruptedException {
        browserContext.getDriver().findElement(By.id("UserName")).sendKeys("Mark");
        Thread.sleep(2000);
        //browserContext.pauseForDebug();
    }


    @Then("Failed registration")
    public void failedRegistration() {
        assertFalse(browserContext.getDriver().getTitle().contains("Login - Spec Overflow"));
    }


}

