package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		
		//1. Your most favorite browser
		
		WebElement favorite= driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[4]/div/div[2]/span"));
		favorite.click();
		
		//2.Find the default select radio button
		
		WebElement chrome = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[1]/div/div[2]/span"));
		WebElement firefox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]/span"));
		WebElement safari = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
		WebElement edge = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div/div[2]"));
		
		boolean chromebutton = chrome.isSelected();
		boolean firefoxbutton = firefox.isSelected();
		boolean safaributton = safari.isSelected();
		boolean edgebutton = edge.isSelected();
		
		System.out.println("chromebutton: "+chromebutton);
		System.out.println("firefoxbutton: "+firefoxbutton);
		System.out.println("safaributton: "+safaributton);
		System.out.println("edgebutton: "+edgebutton);

		
	}

}
