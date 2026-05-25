package ch06.customisexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2_using_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//placing full xpath
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/ul/li[4]/a")).click();
		//customise xpath using text()--> //tagname[text()='value of text']
		driver.findElement(By.xpath("//button[text()='Need help?']")).click();
		System.out.println("clicked the Need help button");
				//driver.quit();
	}

}
