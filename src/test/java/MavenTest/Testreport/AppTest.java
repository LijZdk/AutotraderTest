package MavenTest.Testreport;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xalan.trace.SelectionEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AppTest {
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
	Home home;
	
	
	
	@BeforeClass
	//@Before(priority = 1, enabled = true)
	public void setup(){
		// where to create the report file
		report = new ExtentReports(
				"\\Users\\Elijah\\Documents\\Testreport1-master\\test-output\\automationreport.html",
				true);
		System.setProperty("webdriver.gecko.driver",
				"\\Users\\Elijah\\Documents\\selenium\\SeleniumFiles\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver" );
		driver = new ChromeDriver();
		driver.get("https://www.autotrader.co.uk//");
		home = new Home(driver);
	}
	
	// pass scenario
	@Test(priority = 1, enabled = true)
	public void AutoTest1() throws IOException{
		
		report = new ExtentReports(
				"automationreport.html",
				true);
		test = report.startTest("Scenerio 1");
		
		
		String homepage = home.getTitle();
		
		
		if(homepage.equals("Auto Trader UK | Find New & Used Cars for Sale")){
			test.log(LogStatus.PASS, "Testing completed: Found autotrader");
		}else{
			test.log(LogStatus.FAIL, "Test incompete: ");
		}
		
		report.endTest(test);
		report.flush();
	}
	
	// Fail scenario
	// make this fail to see the screenshot output
	@Test(priority = 2, enabled = true)
	public void verifyPostCodeBox() {

		test = report.startTest("Searching");
		
		home.selectPostCode();
		WebElement pst = driver.findElement(By.id("postcode"));
		if(pst !=null){
			pst.sendKeys(home.postC);
			test.log(LogStatus.PASS, "Added postcode");
			
		}else{
			test.log(LogStatus.FAIL, "failed postcode");
			
		}
		
		report.endTest(test);
		report.flush();
		
	}
	
	@Test(priority = 3, enabled = true)
	public void SelectDistance(){

			WebElement rad = driver.findElement(By.id("radius"));
			
			if(rad != null){
				home.selectDisOp();
				home.selectDistance();
				test.log(LogStatus.PASS, "Selected the distance");
				
			
			}else{
				test.log(LogStatus.FAIL, "Test incompete: ");
			}
			
		report.endTest(test);
		report.flush();
	
	}
	
	@Test(priority = 4, enabled = true)
	public void SelectMake(){

			WebElement vmake = driver.findElement(By.id("searchVehiclesMake"));
			
			
			if(vmake != null){
				home.selectCarMkeOpt();
				home.selectCarMake();
				test.log(LogStatus.PASS, "Selected Make");
				
			
			}else{
				test.log(LogStatus.FAIL, "Test incompete: ");
			}
			
		report.endTest(test);
		report.flush();
	
	}
	
	@Test(priority = 5, enabled = true)
	public void SelectAshtonTyp(){

			WebElement vmodel = driver.findElement(By.id("searchVehiclesModel"));
			
			if(vmodel != null){
				home.selectCarModel();
				home.selectCarModOpt();
				test.log(LogStatus.PASS, "Selected Ashton");
				
			
			}else{
				test.log(LogStatus.FAIL, "Test incompete: ");
			}
			
		report.endTest(test);
		report.flush();
	
	}
	
	@Test(priority = 6, enabled = true)
	public void SelectSearch(){

			WebElement searchc = driver.findElement(By.id("search"));
			
			if(searchc != null){
				home.SelectSearch();
				test.log(LogStatus.PASS, "Selected Search");
				
			
			}else{
				test.log(LogStatus.FAIL, "Test incompete: ");
			}
			
		report.endTest(test);
		report.flush();
	
	}
	
	@Test(priority = 7, enabled = true)
	public void SelectAsht(){

			WebElement vmodel = driver.findElement(By.id("201706066171061"));
			
			if(vmodel != null){
				home.selectAshton();
				test.log(LogStatus.PASS, "Selected the Ashton:V8");
				
			
			}else{
				test.log(LogStatus.FAIL, "Test incompete: ");
			}
			
		report.endTest(test);
		report.flush();
	
	}
	
	@Test(priority = 8, enabled = true)
	public void SelectAshtd() throws IOException{
		
		
		WebElement AshtPage = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/section[1]/figure/a/img"));
		
		if(AshtPage != null){
			test.log(LogStatus.PASS, "Testing completed: Found Ashton");
		}else{
			test.log(LogStatus.FAIL, "Test incompete: ");
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(
					"\\Users\\Elijah\\Documents\\Testreport1-master\\img.jpg"));
			String image = test.addScreenCapture(
				"\\Users\\Elijah\\Documents\\Testreport1-master\\img.jpg");
			test.log(LogStatus.FAIL, "verify logo of the application", image);
		}

			
			
		report.endTest(test);
		report.flush();
		driver.quit();
	
	}
		
	}
		
