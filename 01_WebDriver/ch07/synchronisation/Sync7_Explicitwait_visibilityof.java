package ch07.synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync7_Explicitwait_visibilityof {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

		// visibilityOf();
		// visibilityOfElementLocated();
		invisibilityOfElementLocated();
	}

	private static void invisibilityOfElementLocated() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\Exceptiondemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement element01 = driver.findElement(By.xpath("/html/body/div[2]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("hiddenDiv"), "I'm hidden!"));
		// System.out.println(element01.getAttribute("value"));
		// driver.close();
	}

	private static void visibilityOf() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\Exceptiondemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement element01 = driver.findElement(By.xpath("//div[@id='hiddenDiv']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element01));
		System.out.println(element01.getText());
		// driver.close();

	}

	private static void visibilityOfElementLocated() {
		// TODO Auto-generated method stub
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");

		WebElement element01 = driver.findElement(By.cssSelector(
				"#root > div > div > div:nth-child(11) > div > div > div > div.useful-links > ul > li:nth-child(1) > a"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"#root > div > div > div:nth-child(11) > div > div > div > div.useful-links > ul > li:nth-child(1) > a")));
		System.out.println(element01.getText());
	}
}
