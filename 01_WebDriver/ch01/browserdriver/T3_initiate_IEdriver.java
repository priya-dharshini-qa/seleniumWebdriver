package ch01.browserdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class T3_initiate_IEdriver {

	public static void main(String[] args) {

		/*
		 * set the path of IE Browser selection
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Workspace\\Selenium\\Webdrivers\\IEdriver.exe");
		 */
		
		 // create new IE Driver object
		WebDriver driver = new InternetExplorerDriver();

		// Load to the URL
		// driver.navigate().to("https://www.tesco.com/");
		driver.get("https://www.tesco.com/");

		/*
		 * // Maximize the window the page driver.manage().window().maximize();
		 * Thread.sleep(2000);
		 */

		// Get & print the title of the web page
		String pageTitle = driver.getTitle();
		System.out.println("The title of the web page is " + pageTitle);
		// close the browser
		driver.quit();


	}

}
