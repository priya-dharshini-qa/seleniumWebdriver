package ch04.headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxInHeadlessMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxOptions browsermode = new FirefoxOptions();
		browsermode.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(browsermode);
		driver.get("https://www.asda.com/");
		System.out.println("The title of webpage is " + driver.getTitle());
		driver.close();
	}

}
