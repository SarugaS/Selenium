package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		
		//Task 1 : scroll between x axis
		WebElement from = driver.findElement(By.id("form:conpnl_header"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(from, 110, 0).build().perform();
		
		//Draggable columns
		
		WebElement name= driver.findElement(By.id("form:j_idt94:j_idt95"));
		WebElement category = driver.findElement(By.id("form:j_idt94:j_idt97"));
		
		actions.clickAndHold(name).moveToElement(category).release().build().perform();
		
		//task 3 : drag and drop
		
		WebElement from2 = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop_header"));
		
		actions.dragAndDrop(from2, to).build().perform();
		
		
		//task resizing
		
		WebElement resize= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[3]/div/div[1]"));
		actions.dragAndDropBy(resize, 300, 0).build().perform();
		
		
	}

}
