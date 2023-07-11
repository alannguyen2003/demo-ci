package org.alannguyen.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class DemoGuru99Steps {
    WebDriver webDriver;

    @Before
    public void beforeTesting() {
        webDriver = new ChromeDriver();
    }

    @Given("^User is at login page$")
    public void userIsAtLoginPage() {
        webDriver.get("https://demo.guru99.com/v4/");
    }

    @When("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String username, String password) {
        webDriver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
        webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    @And("^User clicks login button$")
    public void userClicksLoginButton() {
        webDriver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    }

    @Then("^User is navigated to home page, expected Hello (.*)$")
    public void userIsNavigatedToHomePageExpectedHelloUsername(String username) {
        assertEquals("https://demo.guru99.com/v4/manager/Managerhomepage.php", webDriver.getCurrentUrl());
        assertEquals("Manger Id : " + username, webDriver.findElement(By.cssSelector("tr[class='heading3'] td")).getText());
    }

    @After
    public void afterTesting() {
        webDriver.close();
    }
}
