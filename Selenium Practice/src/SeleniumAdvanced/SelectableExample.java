package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/list.xhtml");
		
		//find how many selecting options are there 
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		System.out.println(selectable.size());
		
		Actions actions = new Actions(driver);
		
		//select three options using control key
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(3)).build().perform();
		
		WebElement moveto = driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[3]/div/button[1]/span[1]"));
		moveto.click();
		
		//another simple option with click and hold
		
	
		/*
		actions.clickAndHold(selectable.get(0)).build().perform();
		actions.clickAndHold(selectable.get(1)).build().perform();
		actions.clickAndHold(selectable.get(3)).build().perform();
		*/
	

	}

}
