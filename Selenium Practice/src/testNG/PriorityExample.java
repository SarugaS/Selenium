package testNG;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 0)   //without priority execution will be done in alphabetical order
	public void StartTheCar() {
		System.out.println("Start the car");
	}
	@Test(priority = 1)
	public void FirstGear() {
		System.out.println("Put First Gear");
	}
	@Test(priority = 2)
	public void SecondGear() {
		System.out.println("Put Second Gear");
	}
	@Test(priority = 3)
	public void ThirdGear() {
		System.out.println("Put Third Gear");
	}
	@Test(priority = 4)
	public void FourthGear() {
		System.out.println("Put Fourth Gear");
	}
}
