package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	//by changing the enable attribute as false we can stop the dependable execution of methods
	@Test(enabled = true)     
	public void GCEOrdinerylevel() {
		System.out.println("Passed in O/L");
	}

	@Test(dependsOnMethods = "GCEOrdinerylevel")
	public void GCEAdvancedlevel() {
		System.out.println("Passed in A/L");
	}
	
	@Test(dependsOnMethods = "GCEAdvancedlevel")
	public void University() {
		System.out.println("Got University Admission");
	}
	
}
