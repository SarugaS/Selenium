package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. OpenChrome
		//2. Google Home Page
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
		// in setProperty which browser am i going to use and where exactly that driver location is
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.lk");

	}

}
