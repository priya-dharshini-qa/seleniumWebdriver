package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator5_byPartialLinkText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.tesco.com/");
		// search by unique partial link details
		// WebElement findlink = driver.findElement(By.partialLinkText("Grocer"));
		
		// locate multiple links present with that same partial link text
		WebElement findlink = driver.findElement(By.partialLinkText("Contact"));
		System.out.println("Link " + findlink.getText());
		Thread.sleep(2000);
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getClassName());
		driver.quit();
		/*
		 * // print the duplicate links of the partial text List<WebElement> links =
		 * driver.findElements(By.partialLinkText("Contact")); int i = links.size(); for
		 * (int j = 0; j < i; j++) { System.out.println(links.get(j).getText());
		 * //System.out.println(links.get(j).getAttribute("name"));
		 * System.out.println(links.get(j).getAttribute("href")); }
		 * System.out.println(i);
		 */
	}

}
