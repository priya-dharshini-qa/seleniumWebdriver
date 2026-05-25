package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action01_sendkeys {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		selectUsingSendKeys();

	}

	private static void selectUsingSendKeys() throws InterruptedException {
		// TODO Auto-generated method stub
		Actions action = new Actions(driver);
		// action.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);

		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[10]/div/a[3]/span")).click();
		System.out.println("The element clicked");
		// driver.close();
	}

}
