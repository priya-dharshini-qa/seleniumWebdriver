package ch08.checkbox_dropdown_radiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webdropdown1 {

	static WebDriver driver;
	private static WebElement dropdown;
	private static WebElement dropdown1;

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
		searchbox.sendKeys("fruits" + Keys.ENTER);
		// (//div[@class='nutrition-section__filter-list'])[1]
		System.out.println("search completed");
		// SelectElementUsingSendKeys();
		// SelectElementUsingTagOption();
		SelectElementUsingSelectOption();
	}

	private static void SelectElementUsingSendKeys() {
		// TODO Auto-generated method stub
		dropdown = driver.findElement(By.xpath("//select[@name='Category']"));
		dropdown.sendKeys("Drinks (254)");
	}

	private static void SelectElementUsingTagOption() {
		// TODO Auto-generated method stub
		dropdown = driver.findElement(By.xpath("//select[@name='Category']"));
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		int i = options.size();
		for (int j = 0; j < i; j++) {
			System.out.println(options.get(j).getText());
			System.out.println(options.get(j).getAttribute("value"));
			if (options.get(j).getText().contains("Drinks")) {
				options.get(j).click();
				System.out.println("Drinks option selected");
			}
		}
	}

	private static void SelectElementUsingSelectOption() {
		// TODO Auto-generated method stub
		dropdown = driver.findElement(By.xpath("//select[@name='Category']"));
		Select category = new Select(dropdown);
		category.selectByIndex(5);

		category.selectByVisibleText("Drinks (254)");

		dropdown1 = driver.findElement(By.xpath("//select[@name='Brand']"));
		Select category1 = new Select(dropdown1);
		category1.selectByValue("product_brand:ASDA");

		System.out.println("Dropdown selected");
	}
}
