package ch07.synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync5_Explicitwait_elementtobe {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		//not working
		elementToBeClickable();
		//todo
		elementToBeSelected();
		elementSelectionStateToBe();
			}

	

	private static void elementToBeClickable() {
		// TODO Auto-generated method stub
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		System.out.println("search completed");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement pagesearch =wait.until(ExpectedConditions.elementToBeClickable( By.cssSelector("button[aria-label='back to top']")));
		System.out.println("clicked -back to top");
		
		
		// error due to element not available to click within time
		// driver.findElement(By.xpath(pagepath)).click();
		// try1--> element not clickable error
		// String pagepath = "//div[@class='footer__back-to-top-container']";
		// String pagepath = "/html/body/div[1]/div[2]/footer/div[1]/button";
		// WebElement pagesearch =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pagepath)));
		// try2-->element not clickable error
		// String pagepath = "#root > div.layout > footer >
		// div.footer__back-to-top-container > button";
		// WebElement pagesearch =
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(pagepath)));
		// try3-->timeout error
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //driver.findElement(By.xpath("//button[normalize-space()='Back to top']")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//WebElement pagesearch =wait.until(ExpectedConditions.elementToBeClickable( By.cssSelector("button[aria-label='back to top']")));
		//driver.findElement(By.xpath("//button[contains(.,'Back to top')]")).click();
		// WebElement pagesearch =
		// wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Back to
		// top")));
		/*
		 * if (pagesearch.isDisplayed() && pagesearch.isEnabled()) {
		 * System.out.println("the button is dispalyed and enabled"); } else {
		 * System.out.println("the button is not dispalyed and not enabled"); }
		 */
		// try4 using IDE css--> element not clickable error
		// WebElement pagesearch =
		// wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".asda-btn--light-outline")));
		// try5 using IDE xpath--> element not clickable error
		// WebElement pagesearch =
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Back
		// to top')]")));
		// pagesearch.click();
		// try5--implicitwait-->timeout error
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("//button[contains(.,'Back to top')]")).click();
	//	System.out.println("clicked -back to top");
		/*
		 * WebElement searchbox1 =
		 * driver.findElement(By.xpath("//input[@class='search-input']"));
		 * searchbox1.sendKeys("chocolates" + Keys.ENTER);
		 * System.out.println("search completed");
		 */
		// driver.close();

	}
	private static void elementSelectionStateToBe() {
		// TODO Auto-generated method stub
		
	}

	private static void elementToBeSelected() {
		// TODO Auto-generated method stub
		
	}
}
