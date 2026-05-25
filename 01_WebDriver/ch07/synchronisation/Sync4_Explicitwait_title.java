package ch07.synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync4_Explicitwait_title {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();


		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");

		//title_is();
		title_contains();
		
		
	}
	private static void title_is() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		//not working--> WebDriverWait wait = new WebDriverWait(driver, null);
		//Providing correct title
		wait.until(ExpectedConditions.titleIs("Asda.com - Online Food Shopping, George, & more"));
		//Providing incorrect title throws error
		//wait.until(ExpectedConditions.titleIs("Asda"));
		System.out.println(driver.getTitle());

		driver.close();
	}
	private static void title_contains() {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		//not working--> WebDriverWait wait = new WebDriverWait(driver, null);
		//Providing correct title
		//wait.until(ExpectedConditions.titleIs("Asda.com - Online Food Shopping, George, & more"));
		wait.until(ExpectedConditions.titleContains("Asda"));
		//Providing incorrect title throws error
		//wait.until(ExpectedConditions.titleIs("Asda"));
		System.out.println(driver.getTitle());

		driver.close();
	}

	

}
