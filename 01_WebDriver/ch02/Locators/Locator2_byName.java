package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2_byName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.tesco.com/");
		// locating an element
		driver.findElement(By.name("beans-masthead-desktop-search-input"));

		// send inputs
		WebElement searchtextbox = driver.findElement(By.name("beans-masthead-desktop-search-input"));
		searchtextbox.sendKeys("fruits");
		System.out.println("Current Class: " + Thread.currentThread().getStackTrace()[1].getClassName());
		Thread.sleep(3000);
		driver.quit();
	}

}
