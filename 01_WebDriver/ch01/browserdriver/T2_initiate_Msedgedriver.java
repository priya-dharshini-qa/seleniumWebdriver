package ch01.browserdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T2_initiate_Msedgedriver {

	public static void main(String[] args) {

		/*
		 * set the path of Edge browser selection
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Workspace\\Selenium\\Webdrivers\\msedgedriver.exe");
		 */

		// create new Edge Driver object
		WebDriver driver = new EdgeDriver();
		// Load the URL
		driver.get("https://www.tesco.com/");

		// Get & print the URL of the web page
		System.out.println("The URL of the web page is " + driver.getCurrentUrl());
		
		//close the tab opened
		driver.close();

	}

}
