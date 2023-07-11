package org.alannguyen.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
                            "html:target/cucumber-reports/test-cucumber-reports.html",
                            "json:target/cucumber-reports/test-cucumber-reports.json",
                            "junit:target/cucumber-reports/test-cucumber-reports.xml"},
                features = "src/test/resources/features/DemoGuru.feature",
                glue = "org.alannguyen.steps",
                monochrome = true)
public class TestCucumberRunners {

}
