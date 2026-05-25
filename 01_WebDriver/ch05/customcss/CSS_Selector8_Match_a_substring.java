package ch05.customcss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector8_Match_a_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// printing one list from the locators defined with substring
		// By.cssSelector("Tagname[attribute*=substring_value of attribute]")
		//class name=ul-nav
		WebElement uniquelist = driver.findElement(By.cssSelector("ul[class*=l-na]"));
		System.out.println(uniquelist.getText());

		// Iterating and printing all the multiple elements under the locator defined
		// with substring
		// List<WebElement> classlist =
		// driver.findElements(By.cssSelector("ul[class^=ul-n]"));
		
		
		// class name: useful-links
		//WebElement classlist=driver.findElement(By.cssSelector("div[class*=ful-link] ul li:nth-child(3)"));
		//System.out.println(classlist.getText());
		List<WebElement> classlist = driver.findElements(By.cssSelector("div[class*=ful-link] ul li"));
		
		  System.out.println("Number of elements " + classlist.size()); 
		  for (int i = 0;	  i < classlist.size(); i++) {
			  System.out.println(+i + ": " + classlist.get(i).getText());
		  
		  }
		 
		//class name: main-nav-section
		List<WebElement> classlist1 = driver.findElements(By.cssSelector("div[class*=-nav-secti]"));
		System.out.println("Number of elements " + classlist1.size());
		for (int i = 0; i < classlist1.size(); i++) {
			System.out.println(+i + ": " + classlist1.get(i).getText());
			

		}
	}

}
