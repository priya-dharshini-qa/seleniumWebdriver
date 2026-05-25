package ch12.multipletabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab03_tabsbysendkeys {
	static WebDriver driver;
	static String baseUrl = "https://www.asda.co.uk/";
	static String selectlink = Keys.chord(Keys.CONTROL, Keys.RETURN);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		openNewTabFromMenu();
		SwitchBtwnMultiTabs();
	}

	

	

	private static void setUp() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println(driver.getTitle());

	}
	private static void openNewTabFromMenu() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[normalize-space()='Find a store']")).sendKeys(selectlink);
		driver.findElement(By.xpath("//a[@class='asda-btn asda-btn--primary asda-btn--secondary profile-link']")).sendKeys(selectlink);
		
	}

	private static void SwitchBtwnMultiTabs() throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		
		driver.switchTo().window(tabs.get(1));
		String tabA=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(2));
		String tabB=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(tabs.get(0));
		driver.switchTo().window(tabA);
		driver.switchTo().window(tabB);
	}
	}
