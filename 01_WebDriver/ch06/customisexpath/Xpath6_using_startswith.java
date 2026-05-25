package ch06.customisexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6_using_startswith {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// placing full xpath
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		//tagname[starts-with(@attr1,'valofattr1')]
		//xpath_startswith_attr();
		//xpath_startswith_text();
		xpath_startswith_dot();
	}
	
	public static void xpath_startswith_attr() {
		// TODO Auto-generated method stub
		//class=search-input
		driver.findElement(By.xpath("//input[starts-with(@class,'search-')]")).sendKeys("fruits");
		System.out.println("search completed");
		driver.close();
	}
	public static void xpath_startswith_text() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[starts-with(text(),'Sign ')]")).click();
		System.out.println(driver.getTitle());
	}
	public static void xpath_startswith_dot() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[starts-with(.,'Sign ')]")).click();
		System.out.println(driver.getTitle());
	}
}
