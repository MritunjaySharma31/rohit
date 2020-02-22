package runner;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner 
{
	@Test
	@CucumberOptions(features = "FeatureFiles",glue = {"Stepdefination"})
	
	public class runner{
		
		

		}}



