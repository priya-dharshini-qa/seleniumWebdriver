package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics09_Close_QuitCmd {
	static By searchtext = By.xpath("/html/body/div[1]/div/header/div/form/input");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://groceries.asda.com/?cmpid=ahc-_-ghs-_-asdacom-_-nav-_-ghs");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		// close current active session
		driver.close();
		// close the whole browser
		// driver.quit();
	}

}
