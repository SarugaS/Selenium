package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

	@Test
	@Parameters("Name")
	public void printname(String myname) {
		System.out.println("My name is "+ myname);
	}
}
