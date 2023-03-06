package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//get Chrome web driver 
		
		System.getProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		
		//identifying initial parent window
		
		String oldwindow = driver.getWindowHandle();
		
		//click on first button
		WebElement firstbutton = driver.findElement(By.id("j_idt88:new"));
		firstbutton.click();
		
		//store all the windows in a string set (after clicking first button)
		Set<String> allwindows = driver.getWindowHandles();
		
		//loop to go to the child window
		for (String currentwindow : allwindows) {
			driver.switchTo().window(currentwindow);
		}
		
		//operation on child window
		WebElement browsericon= driver.findElement(By.id("menuform:j_idt39"));
		browsericon.click();
		
		Thread.sleep(3000); //for the purpose of observation of clicking in new window
		
		//closing the child window
		driver.close();
		
		//switch to parent window
		driver.switchTo().window(oldwindow);
		
		//click on second button
		WebElement secondbutton= driver.findElement(By.id("j_idt88:j_idt91"));
		secondbutton.click();
		
		//store all the windows in a string set (after clicking second button)
		Set<String> totalwindows = driver.getWindowHandles();
		
		//count of the current windows
		int NumOfWindows= totalwindows.size();
		System.out.println("Number Of Windows Opened: "+NumOfWindows);
		
		//loop to go to every windows
		for (String currentwindow1 : totalwindows) {
			if(!currentwindow1.equals(oldwindow)) {         //check whether it is a parent window
				driver.switchTo().window(currentwindow1);   //if not a parent window switch to that window
				driver.close();                             //close the window
			}
			
			
		driver.quit();	                                     //close all the windows include parent window
		 
		}
		
		
		
		
		

	}

}
