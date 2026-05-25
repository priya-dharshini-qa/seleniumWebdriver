package ch07.synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync7_Explicitwait_texttobe {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		
		// textToBePresentInElement();
		textToBePresentInElementValue();

	}

	private static void textToBePresentInElement() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\Exceptiondemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement element01 = driver.findElement(By.xpath("//button[@id='clickableButton']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(element01, "Click Me!"));
		System.out.println(element01.getText());
		// driver.close();
	}

	private static void textToBePresentInElementValue() {
		// TODO Auto-generated method stub
		
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		// search fruits
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits");
		System.out.println("search text entered");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(searchbox, "fruits"));
		System.out.println(searchbox.getAttribute("value"));
		// driver.close();
	}

}
