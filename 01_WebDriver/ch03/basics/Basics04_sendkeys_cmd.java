package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics04_sendkeys_cmd {
	static By searchpath = By.xpath("/html/body/div[1]/div/header/div/form/input");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		// driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

		// method1-->send inputs directly
		driver.findElement(searchpath).sendKeys("Chocolates");
		Thread.sleep(5000);

		// method2--> send inputs through a variable reference
		WebElement searchbox = driver.findElement(searchpath);
		searchbox.clear();
		searchbox.sendKeys("Fruits");
		Thread.sleep(5000);
		searchbox.clear();
		// method3--> send inputs using keyboard behavior

		searchbox.sendKeys(Keys.chord(Keys.SHIFT, "t", Keys.SHIFT, "OYS"));
		searchbox.sendKeys(Keys.ENTER);
		// searchbox.sendKeys(Keys.chord(Keys., "t", Keys.SHIFT, "OYS"));
		Thread.sleep(8000);
		// Keys.chord(Keys.CONTROL,keys.)
		driver.close();

	}

}
