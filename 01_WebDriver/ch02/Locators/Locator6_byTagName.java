package ch02.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator6_byTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getClassName());
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.tesco.com/");

		//List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.tagName("span"));
		int i = links.size();
		for (int j = 0; j < i; j++) {
			System.out.println(links.get(j).getText());
			System.out.println(links.get(j).getAttribute("name"));
			//System.out.println(links.get(j).getAttribute("href"));
		}
		System.out.println(i);
		driver.quit();
	}

}
