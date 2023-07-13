package ish.admintest;

import org.testng.annotations.Test;

public class Upgradedtest {

	@Test(groups = {"smoke","regression"})
	public void UpgradedTest()
	{
		System.out.println("student upgraded to another grade");
	}
	@Test(groups = "regression")
	public void Student()
	{
		System.out.println("Student promoted to grade 2");
	}
	
	
	
	
	
	
}
