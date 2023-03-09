package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/list.xhtml");
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element.get(6), element.get(0));
		actions.build().perform();
		
	}

}
