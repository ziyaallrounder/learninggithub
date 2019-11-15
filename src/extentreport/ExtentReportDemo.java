package extentreport;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo 
{

	@Test
	public void TestExtentDemo()
	{
		ExtentReports rep=new ExtentReports("./reports/r.html");
		ExtentTest tests = rep.startTest("Test Script");
		tests.log(LogStatus.PASS, "");
		
		
	}

}
