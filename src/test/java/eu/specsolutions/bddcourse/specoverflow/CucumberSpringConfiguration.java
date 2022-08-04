package eu.specsolutions.bddcourse.specoverflow;

import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(locations= "classpath:cucumber-spring.xml")
public class CucumberSpringConfiguration {
    WebDriver driver=new ChromeDriver();
}
