package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdiver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.daraz.lk/");
		
		driver.findElement(By.linkText("LOGIN")).click();

	}

}
