package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//1. Basic check box
		
		WebElement basic = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/div/div[2]"));
		basic.click();

		WebElement java = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]"));
		java.click();
		
		//2. Verify if check box is disabled
		
		WebElement diabled = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102\']"));
		boolean isenabled= diabled.isEnabled();
		System.out.println("Is Enabled: "+isenabled);
		
		//3.select multiple
		
		WebElement selectionbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/ul"));
		selectionbox.click();
		
		WebElement miami = driver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[1]/div/div[2]"));
		miami.click();
		WebElement berlin = driver.findElement(By.xpath("/html/body/div[7]/div[2]/ul/li[5]/div/div[2]"));
		berlin.click();
		
		WebElement closebox = driver.findElement(By.xpath("/html/body/div[7]/div[1]/a/span"));
		closebox.click();

		
	}

}
