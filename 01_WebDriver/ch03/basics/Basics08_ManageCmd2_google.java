package ch03.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics08_ManageCmd2_google {
	static By searchtext = By.id("q");
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		/*
		 * Duration gettimeout1= driver.manage().timeouts().getPageLoadTimeout();
		 * System.out.println(gettimeout1);
		 */
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/search/howsearchworks/how-search-works/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().to("organizing-information/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		/*
		 * Duration gettimeout2=driver.manage().timeouts().getImplicitWaitTimeout();
		 * System.out.println(gettimeout2);
		 */
		Thread.sleep(5000);
		System.out.println("The current URL is "+driver.getCurrentUrl());
		driver.close();
	}

	
}
