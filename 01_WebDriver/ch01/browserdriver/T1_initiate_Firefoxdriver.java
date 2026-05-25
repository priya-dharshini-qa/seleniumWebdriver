package ch01.browserdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class T1_initiate_Firefoxdriver {

	public static void main(String[] args) {

		/*
		 * set the path of FirefoxBrowser selection
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Workspace\\Selenium\\Webdrivers\\geckodriver.exe");
		 */

		// create new FirefoxDriver object
		WebDriver driver = new FirefoxDriver();

		// Load the URL
		driver.get("https://www.tesco.com/");

		// Get & print the title of the web page
		System.out.println("The title of the web page is " + driver.getTitle());

		// close the browser
		driver.quit();

	}

}
