package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExamples {
	
	//Aim : open chrome and go to
	// 1.google.lk 2.bing.com  3.yahoo.com then close the browser
	//27 seconds without test suit
	//19 seconds with test suit

	WebDriver driver;
	long startTime;
	long endtime;
	
	
	@BeforeSuite
	public void openbrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	
	@Test
	public void opengoogle() {
		driver.get("https://www.google.lk");
	}
	
	@Test
	public void openbing() {
		driver.get("https://www.bing.com");
	}
	
	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void endbrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = endtime-startTime;
		System.out.println(totaltime);
	}
	
}
