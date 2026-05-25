package ch07.synchronisation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync6_Explicitwait_presenceofelement {

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

		//presence_of_element_located();
		presence_of_all_elements_locatedBy();
	}

	private static void presence_of_element_located() {
		// TODO Auto-generated method stub
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);

		System.out.println("search completed");
		// error may occur due to element not available to click within time
		// driver.findElement(By.xpath(pagepath)).click();
		// String pagepath = "/html/body/div[1]/div[2]/footer/div[1]/button";
		String pagepath = "//div[@class='footer__back-to-top-container']";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pagesearch = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pagepath)));
		System.out.println(pagesearch.getText());
		if (pagesearch.getText().equals("Back to top")) {
			System.out.println("The element is present");
		} else {
			System.out.println("The element is not present");
		}
		// driver.getTitle();
		// driver.close();
	}

	private static void presence_of_all_elements_locatedBy() {
		// TODO Auto-generated method stub
		String terms = "(//span[contains(text(),'Terms and Conditions')])";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> linksearch = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(terms)));
		System.out.println("Number of elements present in webpage with provided locator " + linksearch.size());
		for (int i = 0; i < linksearch.size(); i++) {
			System.out.println(+i + ": " + linksearch.get(i).getText());
						}
		}
		// driver.close();
	

}
