package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.lk");

		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchbox.sendKeys("selenium");
		
		Thread.sleep(4000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
		System.out.println(suggestions.size());
		
		for (WebElement webElement : suggestions) {
			if(webElement.getText().equals("selenium testing")) {;
			webElement.click();
			break;
			}
			
		}
		


	}
}


