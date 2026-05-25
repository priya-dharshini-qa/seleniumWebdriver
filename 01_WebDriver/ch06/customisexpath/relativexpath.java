package ch06.customisexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

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
		
		
		//customise xpath--> //tagname[@attribute='value of attribute]
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		//WebElement searchbox = driver.findElement(By.xpath("//*[@class='search-input']"));
		searchbox.sendKeys("fruits");
		searchbox.click();
		System.out.println("search completed");
		driver.close();
		
	}

}
