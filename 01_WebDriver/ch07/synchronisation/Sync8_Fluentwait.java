package ch07.synchronisation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Sync8_Fluentwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		Thread.sleep(1000);
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		Thread.sleep(1000);
		/*
		 * WebElement searchbox =
		 * driver.findElement(By.xpath("//input[@class='search-input']"));
		 * searchbox.sendKeys("fruits"+Keys.ENTER);
		 * System.out.println("search completed");
		 */

		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		fw.withTimeout(Duration.ofSeconds(30));
		fw.pollingEvery(Duration.ofSeconds(10));
		fw.ignoring(NoSuchElementException.class);
		fw.withMessage("user defined 30seconds timelimit exceeded");
		// fw.until(ExpectedConditions.elementToBeClickable(By.xpath(searchpage))).click();
		fw.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[10]/div/a[8]/span")))
				.click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
