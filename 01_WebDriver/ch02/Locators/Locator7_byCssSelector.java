package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator7_byCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getClassName());
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.tesco.com/");
		//Locate element by Css selector
		WebElement searchbox = driver.findElement(By.cssSelector("#beans-masthead-desktop-search-input"));
		searchbox.sendKeys("Fruits");
		Thread.sleep(3000);
		driver.quit();
	}

}
