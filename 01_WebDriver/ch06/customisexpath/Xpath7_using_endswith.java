package ch06.customisexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath7_using_endswith {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		// placing full xpath
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/ul/li[4]/a")).click();
		System.out.println("clicked signin");
		//tagname[starts-with(@attr1,'valofattr1')]
		//xpath_endswith_attr();
		xpath_endswith_text();
		
	}
	//both not working because of xpath version support issue 
	public static void xpath_endswith_attr() {
		// TODO Auto-generated method stub
		//class=basic back-shop//back-shop
		driver.findElement(By.xpath("//button[ends-with(@id,'-shop')]")).click();
		System.out.println("back to homepage");
		driver.close();
	}
	public static void xpath_endswith_text() {
		// TODO Auto-generated method stub
		// Forgotten password
		//class="reset-pwd right" 
		driver.findElement(By.xpath("//button[ends-with(.,'en password')]")).click();
		System.out.println("clicked the link");
		driver.close();
	}
	
}
