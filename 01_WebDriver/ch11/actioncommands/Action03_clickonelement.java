package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action03_clickonelement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\SelectableEx.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//clickOnWebElement01();
		clickOnWebElement02();
	}

		private static void clickOnWebElement01() {
		// TODO Auto-generated method stub
		WebElement gala = driver.findElement(By.name("gala apples"));
		WebElement smith = driver.findElement(By.name("granny smith"));
		WebElement green = driver.findElement(By.name("green apple"));
		Actions builder = new Actions(driver);
		builder.click(gala)
		.click(smith)
		.click(green);
		builder.perform();
	}
		private static void clickOnWebElement02() throws InterruptedException {
			// TODO Auto-generated method stub
			WebElement gala = driver.findElement(By.name("gala apples"));
			WebElement smith = driver.findElement(By.name("granny smith"));
			WebElement green = driver.findElement(By.name("green apple"));
			Actions builder = new Actions(driver);
			builder.click(gala).perform();
			Thread.sleep(3000);
			builder.click(smith).perform();
			Thread.sleep(3000);
			builder.click(green).perform();
			
		}

}
