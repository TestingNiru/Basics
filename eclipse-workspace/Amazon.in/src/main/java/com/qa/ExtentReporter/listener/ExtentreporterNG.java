package com.qa.ExtentReporter.listener;

import java.io.File;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;

public class ExtentreporterNG implements IReporter{
	private ExtentReports extent;
	
	public void generateReport(List <XmlSuite> xmlsuites,List<ISuites> suites,String outPutDirectory) {
		extent=new extentReports(outPutDirectory+File.separator+"Extent.html",true);
		for(ISuite suite:suites) {
			Map<String,ISuiteResult> result=suite.getResults();
			for(ISuiteResult r:result.values()) {
				ITestContext context=r.getTestContext();
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
			}
		}
		extent.flush();
	}

}
