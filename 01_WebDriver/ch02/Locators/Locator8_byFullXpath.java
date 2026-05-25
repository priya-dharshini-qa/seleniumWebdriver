package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator8_byFullXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Current Method: " + Thread.currentThread().getStackTrace()[1].getClassName());
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("https://www.tesco.com/store-locator/");
		// Locate element by full Xpath
		String xpathinput = "/html/body/main/div/div[2]/div[3]/div[3]/form/div[1]/button";
		WebElement searchbox = driver.findElement(By.xpath(xpathinput));
		
		Thread.sleep(3000);
		System.out.println(searchbox.getText());

		driver.quit();

	}

}
