package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		
		
		//2. confirm a disabled button
		
		WebElement disabledbutton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean isenabled = disabledbutton.isEnabled();
		System.out.println("Isenabled: "+isenabled);
		
		//3.Find the position of the Submit button
		
		WebElement xyposition = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]"));
		Point point = xyposition.getLocation();
		int xposition = point.getX();
		int yposition = point.getY();
		System.out.println("x position: "+xposition+" y position: "+yposition);
		
		//4.Find the Save button color
		
		WebElement buttoncolor = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
		String color = buttoncolor.getCssValue("background");
		System.out.println("button color is "+color);
		
		//5. Find the height and width of the button
		WebElement buttonsize = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		int height = buttonsize.getSize().getHeight();
		int width = buttonsize.getSize().getWidth();
		System.out.println("heigth is: "+height+" Width is: "+width);
		
		//6.Mouse over and confirm the color changed
		WebElement colorchange = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/button/span"));
		String rgba = colorchange.getCssValue("background-color");
		System.out.println(rgba);            // Not Working
		
		//1.click button
		
		WebElement clickbutton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		clickbutton.click();
				
		

	}

}
