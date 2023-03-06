package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		//1. Normal alertbox with acceptance only
		
		WebElement alertbox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertbox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//2. Confirmation Alert with acceptance and cancel
		
		WebElement alertbox2 = driver.findElement(By.id("j_idt88:j_idt93"));
		alertbox2.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert.dismiss();
		
		//3. Sweet alert (Simple Dialog)
		
		WebElement alertbox3 = driver.findElement(By.id("j_idt88:j_idt104"));
		alertbox3.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Myname");
		alert3.accept();
		
		



	}

}
