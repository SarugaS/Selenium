package SeleniumAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicTablesExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cse.lk/");
		
		WebElement market = driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/ul[2]/li[1]"));
		market.click();
		WebElement tradesummery = driver.findElement(By.xpath("//*[@id=\"header\"]/div[4]/ul[2]/li[1]/ul/li[1]/ul/li[2]/a"));
		tradesummery.click();
		
		Thread.sleep(4000); //due to time to load the page
		
		WebElement entries = driver.findElement(By.name("DataTables_Table_0_length"));
		entries.click();
		Select select = new Select(entries);
		select.selectByVisibleText("All");
		
	
		//Counting Number of columns and rows
		
		List<WebElement> columncount = driver.findElements(By.tagName("th"));
		System.out.println("Total num of columns: "+ columncount.size());
		
		List<WebElement> rowscount = driver.findElements(By.tagName("tr"));
		System.out.println("Total num of rows: "+ rowscount.size());
		
		//finding the share volume of ACL cables
		
		String XpathofACL="//td[normalize-space()='ACL CABLES PLC']//following::td[2]";
		WebElement ACLcableShareVolume= driver.findElement(By.xpath(XpathofACL));
		System.out.println("Share Volume of ACL Cables: "+ACLcableShareVolume.getText());
		
		//finding the company which has lower trade volume
		
		String XpathOfColumn = "//td[4]";
		List<WebElement> tradevolumecolumn = driver.findElements(By.xpath(XpathOfColumn));
		
		List<Integer> tradevolumeList = new ArrayList<Integer>();   //empty list to store integer value of the trade volume 
		
		for (WebElement webElement : tradevolumecolumn) {           //loop to remove comma and add to list 
			String value0 = webElement.getText().replace(",", "");   
			int value = Integer.parseInt(value0);
			tradevolumeList.add(value);
			
		} 
		
		System.out.println(tradevolumeList);
		
		
		int lowerTradeVolume=Collections.min(tradevolumeList);         //get minimum of the trade volume from list
		String StringLowerValue = Integer.toString(lowerTradeVolume);  //change to string type for xpath writing
		System.out.println(StringLowerValue);
		
		List<WebElement> CompanyWithLowerTradeVolume = driver.findElements(By.xpath("//td[normalize-space()="+"\""+StringLowerValue+"\""+"]//preceding::td[3]"));
		
		/*the above x-path is considering 1's in the share volume column also 
		 so we are getting other number values which has the same x-path NOTE: x-path should be rewritten*/
		 
		
		List<String> companylist = new ArrayList<String>();             //empty string list to store company name
		
		for (WebElement webElement : CompanyWithLowerTradeVolume) {
			
			String name= webElement.getText();
			companylist.add(name);
		}
		
		
		System.out.print("Company With Lower Change Value: ");
		System.out.print(companylist);
		

	}

}
