package ch04.headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeInHeadlessMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions browsermode = new ChromeOptions();
		//browsermode.addArguments("--headless");
		browsermode.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(browsermode);
		driver.get("https://www.asda.com/");
		System.out.println("The title of webpage is " + driver.getTitle());
		driver.close();
	}

}
