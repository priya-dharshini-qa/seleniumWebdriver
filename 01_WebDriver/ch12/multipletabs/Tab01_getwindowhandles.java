package ch12.multipletabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab01_getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseUrl1="https://www.asda.co.uk/";
		String baseUrl2="https://www.aldi.co.uk/";
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl1);
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		driver.findElement(By.xpath("//a[normalize-space()='Privacy Centre']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(driver.getWindowHandles());
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.get(baseUrl2);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
