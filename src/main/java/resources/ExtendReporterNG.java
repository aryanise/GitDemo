package resources;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	ExtentReports extent;
	
	public ExtentReports getReportObject()
	{
		String path =System.getProperty("user.dir") +"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation Report");
		reporter.config().setDocumentTitle("Test Result");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Abhishek Yadav");
		return extent;
	
	}

}
