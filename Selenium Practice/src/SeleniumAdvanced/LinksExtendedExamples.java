package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		
		//go to dash board then coming back
		
		WebElement homepage = driver.findElement(By.linkText("Go to Dashboard"));
		homepage.click();
		driver.navigate().back();
		
		//find URL destination by href attribute
		
		WebElement urldestination = driver.findElement(By.partialLinkText("Find the URL"));
		String URL = urldestination.getAttribute("href");
		System.out.println("URL destination : "+URL);
		
		
		//find broken link by 404 in the page title
		
		WebElement brokenlink= driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		String Broken = driver.getTitle();
		if(Broken.contains("404")) {
			System.out.println("Link is Broken");
		}else {
			System.out.println("Link is NOT broken");
		}
		driver.navigate().back();  //go to back page
		
		
		/*since we navigate through pages we have to find the dash board web element, 
			if not exception will arrive - STALE ELEMENT REFERENCE EXCEPTION */
		 
		WebElement homepage2 = driver.findElement(By.linkText("Go to Dashboard"));
		homepage2.click();
		driver.navigate().back();
		
		
		// by using a tag, finding the links count
		List<WebElement> linkscount = driver.findElements(By.tagName("a"));
		System.out.println("Total Links count: "+linkscount.size());
		

	}

}
