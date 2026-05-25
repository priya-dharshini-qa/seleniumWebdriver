package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector5_Match_nthchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// selecting the nth child of a particular list
		//// customise css using nth child-->tagname:nth-child(n));

		// class="ul-nav"
		/*
		 * WebElement about =
		 * driver.findElement(By.cssSelector(".ul-nav li:nth-child(2)"));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); String
		 * text = about.getText(); System.out.println(text); driver.close();
		 */
		
		//WebElement about = driver.findElement(By.cssSelector(
			//	"#root > div > div > div:nth-child(11) > div > div > div > div.footer_flex > div:nth-child(2) > ul li:nth-child(5)"));
		WebElement about = driver.findElement(By.cssSelector(".footer_item:nth-child(2) li:nth-child(5) > a"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = about.getText();
		System.out.println(text);
		driver.close();
	}

}
