package ch01.browserdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Chromedriver {

	public static void main(String[] args) {

		//InitiateChromeDriverFromLocalMachine();
		//InitiateChromeDriverFromLocalMachineUsingStringVariable();
		//InitiateChromeDriverFromResourceFolder();
		InitiateChromeDriverUsingSeleniumManager();

	}

	public static void InitiateChromeDriverFromLocalMachine() {
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		// set the path of ChromeDriver selection
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\Selenium\\Webdrivers\\chromedriver.exe");
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load to the URL
		driver.get("https://www.tesco.com/");

		// Get & print the URL of the web page
		String currentURL = driver.getCurrentUrl();
		System.out.println("The URL of the web page is " + currentURL);

		// close the tab opened
		driver.close();
	}

	public static void InitiateChromeDriverFromLocalMachineUsingStringVariable() {
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		// Creating a variable to store ChromeDriver Path details
		String ChromeDriverpath = "C:\\Workspace\\Selenium\\Webdrivers\\chromedriver.exe";
		// set the path of ChromeDriver selection
		System.setProperty("webdriver.chrome.driver", ChromeDriverpath);
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load to the URL
		driver.get("https://www.tesco.com/");

		// Get & print the URL of the web page
		String currentURL = driver.getCurrentUrl();
		System.out.println("The URL of the web page is " + currentURL);

		// close the tab opened
		driver.close();
	}

	public static void InitiateChromeDriverFromResourceFolder() {
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		String currentDir = System.getProperty("user.dir");
		System.out.println("Current directory: " + currentDir);
		String ChromeDriverpath = currentDir + "\\Resource\\Driverfiles\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", ChromeDriverpath);
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.navigate().to("https://www.tesco.com/");

		// Get & print the URL of the web page
		String currentURL = driver.getCurrentUrl();
		System.out.println("The URL of the web page is " + currentURL);

		// close the tab opened
		driver.close();

	}

	public static void InitiateChromeDriverUsingSeleniumManager() {
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		

		// Get & print the URL of the web page
		String currentURL = driver.getCurrentUrl();
		System.out.println("The URL of the web page is " + currentURL);

		// close the tab opened
		driver.close();

	}
}
