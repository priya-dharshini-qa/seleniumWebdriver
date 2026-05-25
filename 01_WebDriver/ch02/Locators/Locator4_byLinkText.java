package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4_byLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.tesco.com/");
		//search by full link details
		WebElement findlink = driver.findElement(By.linkText("Groceries"));
		findlink.click();
		Thread.sleep(3000);
		System.out.println("Current Class: " + Thread.currentThread().getStackTrace()[1].getClassName());
		driver.quit();
	}

}
