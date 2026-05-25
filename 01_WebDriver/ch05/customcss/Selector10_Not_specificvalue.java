package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector10_Not_specificvalue {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		
		//cssselector_using_not();
	//	cssselector_using_not_fb();
		
	}
	
	private static void cssselector_using_not() {
		// TODO Auto-generated method stub
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#root > div > header > div > form > select")).click();
		WebElement selecttype=driver.findElement(By.cssSelector("option:not([value='groceries']):not([value='george'])"));
		selecttype.click();
		System.out.println("The option selected is '"+selecttype.getText()+"'");
		driver.close();
	}
	private static void cssselector_using_not_fb() {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement selecttype=driver.findElement(By.cssSelector("input:not([value='1']):not([value='-1'])[name='sex']"));
		selecttype.click();
		driver.close();
	
//System.out.println("The option selected is "+selecttype.getText());
	}
}
