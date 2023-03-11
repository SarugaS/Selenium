package testNG;

import org.testng.annotations.Test;

public class GroupingExamples {
	
	/*
	  A big basket is having different kinds of mobile.
	  let us say there are apple phones, Moto, VIVO and Lenovo.
	  I want to run the tests only for VIVO and Moto.
	 */
	
	@Test(groups = "Apple")
	public void Apple1(){
		System.out.println("Apple Testing");
	}
	@Test(groups = "Apple")
	public void Apple2(){
		System.out.println("Apple Testing");
	}
	@Test(groups = "Moto")
	public void Moto1(){
		System.out.println("Moto Testing");
	}
	@Test(groups = "Moto")
	public void Moto2(){
		System.out.println("Moto Testing");
	}
	@Test(groups = "VIVO")
	public void VIVO1(){
		System.out.println("VIVO Testing");
	}
	@Test(groups = "VIVO")
	public void VIVO2(){
		System.out.println("VIVO Testing");
	}
	@Test(groups = "Lenovo")
	public void Lenovo1(){
		System.out.println("Lenovo Testing");
	}
	@Test(groups = "Lenovo")
	public void Lenovo2(){
		System.out.println("Lenovo Testing");
	}
}
