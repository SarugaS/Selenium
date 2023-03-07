package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");

		// deal with 1st frame
		driver.switchTo().frame(0);
		WebElement click1 = driver.findElement(By.id("Click"));
		click1.click();

		//return text of the button after clicking
		System.out.println(click1.getText());

		//return to main content
		driver.switchTo().defaultContent();

		//move to 2nd frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement click2 = driver.findElement(By.id("Click"));
		click2.click();

		//return to main content
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int allframecount = frames.size();
		System.out.println("Total Frames: "+allframecount);



	}
}
