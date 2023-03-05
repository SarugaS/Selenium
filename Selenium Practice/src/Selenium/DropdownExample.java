package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		//1. Select using index, visible text
		WebElement dropdown1 = driver.findElement(By.id("course"));
		
		Select select = new Select(dropdown1);   //create select class
		select.selectByIndex(3);
		select.selectByValue("java");
		select.selectByVisibleText("Javascript");
		
		
		
		//2. find Total number of elements in a drop down list
		
		List<WebElement> Listofoptions= select.getOptions();
		int size = Listofoptions.size();
		System.out.println("Number of Elements: "+size);
		
		
		//3. Select by sending keys
		
		dropdown1.sendKeys("Dot Net");
		
		//4. Multiple selection
		
		WebElement dropdown3 = driver.findElement(By.id("ide"));
		Select multiselect = new Select(dropdown3);
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(3);
		multiselect.selectByIndex(2);
		
		
		
		
	}

}
