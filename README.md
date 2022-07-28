# SpecOverflow Tests

Starting point for automating Cucumber Java scenarios for the SpecOverflow demo application

The project contains:

* Cucumber Java project setup (start tests with `CucumberTest` class)
* Selenium WebDriver project setup for Cucumber (see `BrowserContext` and `BrowserHooks` classes)
* Spring configuration necessary to get `BrowserContext` injected to any step definition class using `@Autowired` (see `SampleStepDefinitions` for an example)
* A sample feature file: `sample.feature` with a sample scenario
* A sample step definition class that automates the sample scenario by opening a URL in the browser
* A locally runnable version of the demo app (for Windows only) in the `DemoApp` folder. (You can also use the online version at https://specflowmasterclassspecoverflowweb20220706204956.azurewebsites.net/)
* The exercise description: `SeleniumWithJava-ProjectExercise.pdf`

## How to create your own test project?

1. Login to github.com (register first if you don't yet have an account)
2. Open this project on GitHub: https://github.com/specsolutions/20220728-SpecOverflowTests/
3. Use the *Fork* button on the top right corner to make a copy of the project into your own GitHub account
4. Clone the **forked** project (your own copy) to your machine
5. Add addtional tests to the project and make sure they pass
6. Commit your changes by performing the following git commands
   * `git add --all`
   * `git commit -m "your commit message"`
7. Upload your changes to GitHub by performing the following git commands
   * `git push`
8. Make further improvements in the project by repeating steps 5-7
9. To get feedback, email your GitHub project URL to your instructor

*Note: If you fail to make the test project on GitHub, you can also send it to your instructur as zip (upload it to Google Drive and send the link), but the GitHub delivery is preferred.*
