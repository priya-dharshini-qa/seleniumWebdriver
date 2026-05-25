package ch03.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics03_navigate_Cmd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Navigate to the URL
		driver.navigate().to("https://www.tesco.com/");
		System.out.println("The current URL is " + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().to("https://www.aldi.co.uk");
		System.out.println("The current URL is " + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("The current URL is " + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("The current URL is " + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println("The current URL is " + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
	}

}
