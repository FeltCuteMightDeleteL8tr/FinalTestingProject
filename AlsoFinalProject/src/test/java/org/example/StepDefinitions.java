package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();
    MainPage mainPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("file:///Users/madscientist/Desktop/testingenv/Testing-Env/index.html");
    }

    @When("I click on the enrollment button")
    public void i_click_on_the_enrollment_button() {
        mainPage.clickOnEnrollmentButton();
    }

    @When("I scroll to the instructors header")
    public void i_scroll_to_the_instructors_header() {
        Utils.scrollToElement(driver, mainPage.getInstructorsHeader());
    }

    @And("I click on the twitter button")
    public void i_click_on_the_twitter_button() {
        mainPage.clickOnTwitterButton();
        Utils.waitForElementToLoad(5);
    }

    @And("I click on the facebook button")
    public void i_click_on_the_facebook_button() {
        mainPage.clickOnFacebookButton();
        Utils.waitForElementToLoad(5);
    }

    @And("I click on the linkedIn button")
    public void i_click_on_the_linkedIn_button() {
        mainPage.clickOnLinkedInButton();
        Utils.waitForElementToLoad(5);

    }

    @And("I click on the instagram button")
    public void i_click_on_the_instagram_button() {
        mainPage.clickOnInstagramButton();
        Utils.waitForElementToLoad(5);
    }

    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String string) {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith(string));
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @When("I move to the {string} card")
    public void iMoveToTheCard(String arg0) {

    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
    }
}