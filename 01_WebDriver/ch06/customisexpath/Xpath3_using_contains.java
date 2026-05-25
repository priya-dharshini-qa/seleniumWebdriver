package ch06.customisexpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3_using_contains {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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

		// xpath_contains_fulltext();
		// xpath_contains_partialtext();
		// xpath_contains_attr();
		xpath_contains_multiple_attr();

	}

	public static void xpath_contains_fulltext() {
		// TODO Auto-generated method stub
		// text=Asda Group of Companies
		// customise xpath using contains: //tagname[contains(text(),'value of text')]
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Asda Group of Companies')]")).click();
		System.out.println(driver.getTitle());
		// driver.close();
	}

	public static void xpath_contains_partialtext() {
		// TODO Auto-generated method stub
		// text=Asda Group of Companies
		// customise xpath using contains: //tagname[contains(text(),'partial
		// valoftext')]
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Asda Group of')]")).click();
		System.out.println(driver.getTitle());
		// driver.close();
	}

	public static void xpath_contains_attr() throws InterruptedException {
		// TODO Auto-generated method stub
		// text=Asda Group of Companies
		// customise xpath using contains: //tagname[contains(@attribute,'valofattr')]
		System.out.println(driver.getTitle());
		// href="https://www.asda.com/help/company-details?"
		driver.findElement(By.xpath("//a[contains(@href,'company-details?\')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.close();
	}

	
	public static void xpath_contains_multiple_attr() {
		// TODO Auto-generated method stub

		// customise xpath using contains:
		// //tagname[contains(@attr1,'valofattr1')and/or contains(@attr2,'valofattr2')]
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Find a store')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// class=Locator-toDirectory
		// text=browse our directory.
		// href=directory
		// not working both-->
		//driver.findElement(By.xpath("//a[contains(@class,'-toDirectory')and contains(@href,'directory')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'browse our directory')and contains(@href,'directory')]")).click();
		System.out.println(driver.getTitle());
		// driver.close();
	}
}
