package day14jun23;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	public static void main(String[] args) {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"src\\test\\resources\\ExtentReport");
		
		ExtentReports extent  = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1= extent.createTest("verifyTestForPayment","verification of total payment");
		
		test1.assignAuthor("cyberTester1","tushar");
		test1.assignCategory("smoke","Regression");
		test1.log(Status.INFO, "Browser opened : Chrome");
		test1.log(Status.INFO,"Opened Url");
		test1.log(Status.INFO,"window maximized");
		test1.info("logged in successfull");
		test1.pass("verification of FirstName passed");
		test1.pass("verification of LastName Passed");
		test1.pass("sample pass test step3");
		test1.pass("sample pass test step4");
		test1.fail("test case failed !");

	
	}

}
