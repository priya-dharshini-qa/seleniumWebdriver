package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1_byID {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load to the URL
		driver.get("https://www.tesco.com/");
		/*
		 * //locating an element
		 * driver.findElement(By.id("beans-masthead-desktop-search-input")); //clicking
		 * on an element by id
		 * driver.findElement(By.id("beans-masthead-desktop-search-input")).click();
		 */
		
		//send inputs 
		driver.findElement(By.id("beans-masthead-desktop-search-input")).sendKeys("fruits");
					
		Thread.sleep(3000);
		System.out.println("Current class: " + Thread.currentThread().getStackTrace()[1].getClassName());
		driver.quit();

	}

}
