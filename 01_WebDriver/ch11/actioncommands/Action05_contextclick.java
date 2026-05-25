package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action05_contextclick {

	static WebDriver driver = new ChromeDriver();
	static Actions builder = new Actions(driver);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// context click is right click
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\ContextClick.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.id("div-context"));
		builder.moveToElement(menu).contextClick().perform();
		builder.click(driver.findElement(By.id("ui-id-6"))).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent()).accept();

		//driver.close();
	}

}
