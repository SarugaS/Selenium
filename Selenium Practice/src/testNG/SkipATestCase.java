package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	@Test(priority = 0)   //without priority execution will be done in alphabetical order
	public void StartTheCar() {
		System.out.println("Start the car");
	}
	@Test(priority = 1)
	public void FirstGear() {
		System.out.println("Put First Gear");
	}
	
	@Test(priority = 5,enabled = false)        //by making enabled as false, this execution will be skipped
	public void MusicOn() {
		System.out.println("Music Turned On");
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
