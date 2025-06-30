package Assignment_2;

import org.testng.annotations.Test;

public class TestCase extends TestBase {
	
	@Test
	public static void AmazonTest() 
	{
		//Visit
		driver.get("https://www.google.com/");
		
		//Get page title
		System.out.println("Page title is: " + driver.getTitle());
		
		//Get Page URL
		System.out.println("Page URL is: " + driver.getCurrentUrl());
		
		//Get Window id
		System.out.println("URL ID is: " + driver.getWindowHandle());
	}

}
