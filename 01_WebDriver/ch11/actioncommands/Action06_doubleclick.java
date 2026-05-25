package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action06_doubleclick {

	static WebDriver driver = new ChromeDriver();
	static Actions builder = new Actions(driver);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\DoubleClick.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		//doubleClick();
		doubleClickUsingMoveToElement();

	}

	

	private static void doubleClick() {
		// TODO Auto-generated method stub
		WebElement btn = driver.findElement(By.name("dblClick"));
		builder.doubleClick(btn).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
	private static void doubleClickUsingMoveToElement() {
		// TODO Auto-generated method stub
		WebElement btn = driver.findElement(By.name("dblClick"));
		builder.moveToElement(btn).doubleClick().perform();
		
	}
}
