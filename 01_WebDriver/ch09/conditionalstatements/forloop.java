package ch09.conditionalstatements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class forloop {

	static WebDriver driver;
	private static WebElement dropdown;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("Toys" + Keys.ENTER);
		// (//div[@class='nutrition-section__filter-list'])[1]
		System.out.println("search completed");
		forLoop();
		//forEachLoop();

	}

	private static void forLoop() {
		// TODO Auto-generated method stub
		dropdown = driver.findElement(By.xpath("//select[@name='Brand']"));
		Select option = new Select(dropdown);
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		int i = options.size();
		for (int j = 0; j < i; j++) {
			System.out.println(options.get(j).getAttribute("value"));	
		} 
	}

	private static void forEachLoop() {
		// TODO Auto-generated method stub
		dropdown = driver.findElement(By.xpath("//select[@name='Brand']"));
		Select option = new Select(dropdown);
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		int i = options.size();
		for (WebElement webElement : options) {
			System.out.println(webElement.getAttribute("value"));
			
		}

	}
}
