package SeleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingAFileHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		
		WebElement choosefile = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		choosefile.click();
		
		//control given to windows
		
		String filepath = "C:\\Users\\HP\\Downloads\\TestLeaf Logo.png";
		
		StringSelection selection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Thread.sleep(3000);
		
		// call robot class for mouse and keyboard control
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
