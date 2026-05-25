package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector3_Match_firstchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// selecting the first child of a particular list

		// customise css using child-->Tagname:first-child
		// class="ul-nav"
		WebElement about = driver.findElement(By.cssSelector(".ul-nav li:first-child"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = about.getText();
		System.out.println(text);

	}

}
