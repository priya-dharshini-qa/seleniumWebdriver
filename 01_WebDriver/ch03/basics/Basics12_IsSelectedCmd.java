package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics12_IsSelectedCmd {

	static By searchpath = By.xpath("/html/body/div[1]/div/header/div/form/input");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		// Thread.sleep(1000);
		WebElement searchtext = driver.findElement(searchpath);
		searchtext.sendKeys("Milk");
		searchtext.sendKeys(Keys.ENTER);

		Thread.sleep(5000);
		//sort the results element
		WebElement sortby = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/section/main/div[2]/div/div[4]/div/div[1]/div[1]/button/div/div/div[1]"));
		sortby.click();
		//sort by price element
		String sortbyprice = ".asda-radio-button:nth-child(2) > .asda-radio-button__label";
		WebElement sortoption = driver.findElement(By.cssSelector(sortbyprice));
		// to verify radio button selection
		//sortoption.click();
		Thread.sleep(5000);
		if (sortoption.isSelected()) {
			System.out.println("Sortby price is selected " + sortoption.isSelected());
		} else {
			System.out.println("Sortby price is not selected " + sortoption.isSelected());
		}
		//driver.close();
	}

}
