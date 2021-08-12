package com.qa.stories;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"},
		glue = {"classpath:com.qa.stories"},
		snippets = SnippetType.CAMELCASE,
		plugin = {"summary",
				  "html:target/cucumber-reports/cucumber-html-report.html",
				  "junit:target/cucumber-reports/cucumber-junit-report.xml"
		},
		monochrome = true
		)
public class CucumberTestRunner {
	
	

}
