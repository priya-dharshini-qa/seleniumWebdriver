package ch05.customcss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector7_Match_a_suffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// printing one list from the locators defined with suffix
		// By.cssSelector("Tagname[attribute$=suffix_value of attribute]")
		//class="ul-nav"
		//List<WebElement> classlist = driver.findElements(By.cssSelector("ul[class^=nav]"));
		WebElement uniquelist = driver.findElement(By.cssSelector("div[class$=link-icons]"));
		System.out.println(uniquelist.getText());

		
		  // Iterating and printing all the multiple elements under the locator defined with suffix 
		//List<WebElement> classlist =driver.findElements(By.cssSelector("ul[class^=ul-n]")); 
		 
			
			  List<WebElement> classlist =
			  driver.findElements(By.cssSelector("div[class$=_item]"));
			  System.out.println("Number of elements " + classlist.size()); for (int i = 0;
			  i < classlist.size(); i++) { System.out.println(+i + ": "
			  +classlist.get(i).getText());
			  
			  }
			 
		 

	}


}
