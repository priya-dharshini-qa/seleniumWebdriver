package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector4_Match_lastchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// selecting the last child of a particular list
		// customise css using child-->Tagname:last-child
		//class="ul-nav"
		WebElement about = driver.findElement(By.cssSelector(".ul-nav li:last-child"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = about.getText();
		System.out.println(text);
		driver.close();
	}

}
