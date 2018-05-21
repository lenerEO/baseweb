package stepdefinitions;

import PageObjects.ValidResultPage;
import PageObjects.WelcomePage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Search {

    public static WebDriver driver;

    @Given("^User is in main page$")
    public void userIsInMainPage() throws Throwable {
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }

    @When("^User fills out the term \"([^\"]*)\"$")
    public void userFillsOutTheTerm(String arg0) throws Throwable {
        WelcomePage welcome = new WelcomePage(driver);
        welcome.inputText(arg0);
        welcome.clickSearch();
    }

    @Then("^The page shows the message \"([^\"]*)\"$")
    public void thePageShowsTheMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The page shows title \"([^\"]*)\"$")
    public void thePageShowsTitle(String arg0) throws Throwable {
        ValidResultPage valid = new ValidResultPage(driver);
        Assert.assertEquals(valid.getTitle(), arg0);
    }

    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
