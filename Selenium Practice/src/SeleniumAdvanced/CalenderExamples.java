package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/#date-range");

		driver.switchTo().frame(0);  // Calender is in a frame
		
		//using sendkeys
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"from\"]"));
		from.click();
		from.sendKeys("03/15/2023");
		
		Thread.sleep(3000);
		
		//using clicking the buttons
		
		driver.navigate().refresh();
		driver.switchTo().frame(0);
		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"from\"]"));
		from2.click();
		
		WebElement frommonth = driver.findElement(By.xpath("//a[@title='Prev']"));
		frommonth.click();
		
		Thread.sleep(3000);
		
		WebElement fromdate = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		fromdate.click();
		
		Thread.sleep(3000);
		
		//using month selection dropdown
		
		driver.navigate().refresh();
		driver.switchTo().frame(0);
		WebElement from3 = driver.findElement(By.xpath("//*[@id=\"from\"]"));
		from3.click();
		
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/select"));
		
		Select select = new Select(month);
		select.selectByVisibleText("Aug");
		
		WebElement date= driver.findElement(By.xpath("//a[contains(text(),\"10\")]"));
		date.click();
		
	}

}
