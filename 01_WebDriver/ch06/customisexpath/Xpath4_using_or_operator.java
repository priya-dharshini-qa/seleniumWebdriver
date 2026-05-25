package ch06.customisexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4_using_or_operator {

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
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/ul/li[4]/a")).click();
		System.out.println("clicked signin");
		System.out.println(driver.getTitle());
		//customise xpath using OR--> //tagname[@attr1='valofattr1' or @attr2='valofattr2']
		driver.findElement(By.xpath("//button[@id='back-shop' or @class='basic back-shop']")).click();
		System.out.println(driver.getTitle());
	}

}
