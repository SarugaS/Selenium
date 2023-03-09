package SeleniumAdvanced;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");

		WebElement downloadoption = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadoption.click();
		
		Thread.sleep(3000);

		//C:\Users\HP\Downloads

		File filelocation = new File("C:\\Users\\HP\\Downloads");  //using file class to go to location in my system
		File[] totalfiles = filelocation.listFiles();    //save the files in an array

		for (File file : totalfiles) {

			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("file downloaded.");
				break;
			}
		}

	}

}
