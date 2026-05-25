package ch06.customisexpath;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath9_using_relativelocator {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// above_an_element_locator();
		// below_an_element_locator();
		// right_of_element_locator();
		// left_of_element_locator();
		near_element_locator();
		// chaining_relative_locators();
	}

	private static void above_an_element_locator() {
		// TODO Auto-generated method stub
		// above--> corporate & press link
		WebElement above = driver.findElement(with(By.tagName("a"))
				.above(By.xpath("/html/body/div[1]/div/div/div[11]/div/div/div/div[2]/div[1]/ul/li[5]/a")));
		System.out.println(above.getText());
		above.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		// driver.close();
	}

	public static void below_an_element_locator() {
		// TODO Auto-generated method stub
		// below store locator link
		WebElement below = driver.findElement(with(By.tagName("span")).below(By.id("store-loc")));
		below.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

	private static void right_of_element_locator() {
		// TODO Auto-generated method stub
		// Right of first icon
		WebElement Rightoffirstlogo = driver
				.findElement(with(By.tagName("div")).toRightOf(By.xpath("//div[@class='icon twitter']")));
		System.out.println("Right of first element: " + Rightoffirstlogo.getAttribute("class"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Rightoffirstlogo.click();

		// driver.close();
	}

	private static void left_of_element_locator() {
		// TODO Auto-generated method stub
		// Left of last icon
		WebElement leftoflastlogo = driver
				.findElement(with(By.tagName("div")).toLeftOf(By.xpath("//div[@class='icon pinterest']")));
		System.out.println("Left of last element: " + leftoflastlogo.getAttribute("class"));

		// leftoflastlogo.click();
		// 2nd to the left
		WebElement secondleftoflastlogo = driver.findElement(with(By.tagName("div")).toLeftOf(leftoflastlogo));
		System.out.println("second Left of last element: " + secondleftoflastlogo.getAttribute("class"));

		// secondleftoflastlogo.click();
		// driver.close();
	}

	private static void near_element_locator() {
		// TODO Auto-generated method stub
		//WebElement nearelement = driver.findElement(with(By.tagName("div")).near(By.xpath("//div[@class='icon facebook']")));
		//WebElement nearelement = driver.findElement(with(By.tagName("a")).near(By.xpath("//a[@href='https://www.instagram.com/asda/']")));
		WebElement nearelement = driver.findElement(with(By.tagName("a")).near(By.xpath("//a[@href='https://twitter.com/asda/']")));
		//System.out.println("Nearby element: " + nearelement.getAttribute("class"));
		System.out.println("Nearby element: " + nearelement.getAttribute("href"));

		/*
		 * driver.get(
		 * "https://www.asda.com/login?request_origin=asda&redirect_uri=https%3A%2F%2Fwww.asda.com%2F&referrer=signin_btn"
		 * );
		 * 
		 * WebElement nearelement = driver
		 * .findElement(with(By.tagName("button")).near(By.xpath(
		 * "//button[@id='back-shop']"))); System.out.println("Near element: " +
		 * nearelement.getAttribute("class"));
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //
		 * leftoflastlogo.click(); driver.close();
		 */
	}

	/*
	 * private static void chaining_relative_locators() { // TODO Auto-generated
	 * method stub driver.get(
	 * "https://www.asda.com/login?request_origin=asda&redirect_uri=https%3A%2F%2Fwww.asda.com%2F&referrer=signin_btn"
	 * ); String belowthis="/html/body/div[1]/main/div/div/div/div/form/label";
	 * String
	 * abovethis="/html/body/div[1]/main/div/div/div/div/form/div[2]/div/label";
	 * WebElement nearelement = driver
	 * .findElement(with(By.tagName("label")).below(By.xpath(belowthis)).above(By.
	 * xpath(abovethis))); System.out.println("the actual element: " +
	 * nearelement.getAttribute("class"));
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //
	 * leftoflastlogo.click(); driver.close(); }
	 */
}
