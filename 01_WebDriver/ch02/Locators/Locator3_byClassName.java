package ch02.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3_byClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// create new ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://www.tesco.com/store-locator/");

		// Search by className
		/*
		 * WebElement searchicon=driver.findElement(By.
		 * className("styled__SVG-xxa4wh-1 LaUBK beans-desktop-search__icon beans-icon__svg"
		 * )); searchicon.click();
		 */

		/*
		 * WebElement Titlewrap=
		 * driver.findElement(By.className("Locator-titleWrapper"));
		 * System.out.println(Titlewrap.getText());
		 */

		// not working with compound class name error-->
		WebElement searchtext = driver.findElement(By.className("search-input Locator-input js-locator-input"));
		// searchtext.click();
		Thread.sleep(2000);
		searchtext.getText();
		// driver.quit();

	}

}
