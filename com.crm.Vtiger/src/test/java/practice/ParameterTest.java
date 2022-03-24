package practice;

import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	
	public void getData() {
		
		System.out.println(System.getProperty("browser"));		
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		
		System.out.println("branch test");
		
		System.out.println("changees to check from my origin");
		
		

		
	}

}
