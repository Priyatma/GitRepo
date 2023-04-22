package demo.ExtendReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir")+ "\\report\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("web Automation");
		reporter.config().setDocumentTitle("Title Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Testing", "ExtentReport");
	}
	
	@Test
	public void intialDemo() {
		ExtentTest test =extent.createTest("Intial Demo");
		System.setProperty("webdriver.chrome.driver", "D:\\TraderInteractive\\SeleniumJavaProject\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("gmail.com");
		System.out.println(driver.getTitle());
		driver.close();
		//test.addScreenCaptureFromBase64String(null);
		test.fail("Result do not match");
		extent.flush();
	}
}
