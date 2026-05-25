package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector1_ID_attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.findElement(By.cssSelector("#root > div > header > div > div.top-nav > ul > li:nth-child(3) > a"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Customize css selector using id--> By.cssSelector(#<value of id attribute>)
		// WebElement email = driver.findElement(By.cssSelector("input#email"));
		WebElement email = driver.findElement(By.cssSelector("#register-email"));
		email.sendKeys("abc@gmail.com");
		System.out.println("entered email");
		// driver.close();

	}

}
