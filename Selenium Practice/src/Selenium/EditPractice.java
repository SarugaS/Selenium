package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml"); //open webpage
		
		WebElement Typebox=  driver.findElement(By.id("j_idt88:name"));  //type a text
		Typebox.sendKeys("Saruga");
		
		
		WebElement AppendBox= driver.findElement(By.id("j_idt88:j_idt91"));   //append text with existing text
		AppendBox.sendKeys(" erode");
		
		
		WebElement disabledbox = driver.findElement(By.id("j_idt88:j_idt93"));    //check whether the text box is enabled
		boolean isenabled= disabledbox.isEnabled();
		System.out.println(isenabled);
		
		
		WebElement Clearbox= driver.findElement(By.id("j_idt88:j_idt95"));   //clear text
		Clearbox.clear();
		
		String value= driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");   //printing a text from textbox
		System.out.println(value);
		
		

	}

}
