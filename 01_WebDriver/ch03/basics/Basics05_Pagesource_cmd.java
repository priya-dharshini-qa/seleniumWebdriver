package ch03.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics05_Pagesource_cmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		String pagesrc = driver.getPageSource();

		if (pagesrc.contains("Register")) {
			System.out.println("Match found");
		} else {
			System.out.println("No match");
		}
		driver.close();
	}

}
