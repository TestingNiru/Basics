package com.Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features= "C:\\Users\\mmango\\eclipse-workspace\\ScenarioOutline\\src\\test\\java\\features\\login1.feature"
 ,
 format= {"pretty","html:test-output"},
 monochrome=true,
 dryRun=false,
 tags="@login"
 

 )
public class TestRunner1 {

}
