package ch08.checkbox_dropdown_radiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		// (//div[@class='nutrition-section__filter-list'])[1]
		System.out.println("search completed");
		// PrintListOfCheckboxes();

		// not working
		select_a_checkbox();
		// select_all_checkboxes();
		//select_multiple_checkboxes();
	}

	private static void select_a_checkbox() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[@class='asda-filter__caption']")).click();
		// WebElement checkbox =
		// driver.findElement(By.xpath("//span[normalize-space()='No Lupin']"));
		// WebElement checkbox =
		// driver.findElement(By.xpath("//span[contains(.,'Vegan')]"));
		WebElement cboxlist = driver.findElement(By.xpath("//div[@class='nutrition-section__filter-list']"));
		cboxlist.click();
		WebElement checkbox = cboxlist.findElement(
				By.xpath("//input[@type='checkbox' and @class='asda-checkbox-new__input' and @id='Vegan']"));
		checkbox.click();
		System.out.println("The selected checkbox is " + checkbox.getText());
	}

	private static void PrintListOfCheckboxes() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[@class='asda-filter__caption']")).click();
		WebElement cboxlist = driver.findElement(By.xpath("//div[@class='nutrition-section__filter-list']"));
		// List<WebElement> cbox = driver.findElements(By.tagName("input"));
		// cboxlist.click();
		// List<WebElement> cbox =
		// cboxlist.findElements(By.xpath("//input[@type='checkbox' and
		// @class='asda-checkbox-new__input']"));
		List<WebElement> cbox = driver
				.findElements(By.xpath("//div[@class='asda-checkbox-new filter-item__checkbox']"));
		int i = cbox.size();
		System.out.println("Number of checkboxes " + i);
		System.out.println("***Printing all checkboxes***");
		for (int j = 0; j < i; j++) {
			System.out.println(cbox.get(j).getAttribute("id"));
			// System.out.println(cbox.get(j).getText());
		}
	}

	private static void select_multiple_checkboxes() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[@class='asda-filter__caption']")).click();
		WebElement cboxlist = driver.findElement(By.xpath("//div[@class='nutrition-section__filter-list']"));
		List<WebElement> cbox = driver.findElements(By.xpath("//div[@class='asda-checkbox-new filter-item__checkbox']"));
		int i = cbox.size();
		System.out.println("Number of checkboxes " + i);
		for (int j = 0; j < i; j++) {
			//System.out.println(cbox.get(j).getText());
			if (cbox.get(j).getText().equals("No Fish")) {
				cbox.get(j).click();
				System.out.println("The checkbox enabled and selected is " + cbox.get(j).getText());
			} 
			if (cbox.get(j).getText().equals("No Soya")) {
				cbox.get(j).click();
				System.out.println("The checkbox enabled and selected is " + cbox.get(j).getText());
			} 
		}
			
		/*
		 * WebElement checkbox1 =
		 * driver.findElement(By.xpath("//label[@for='NoLupin']")); checkbox1.click();
		 * System.out.println("The selected checkbox is " + checkbox1.getText());
		 * WebElement checkbox2 =
		 * driver.findElement(By.xpath("//label[@for='NoFish']")); checkbox2.click();
		 * System.out.println("The selected checkbox is " + checkbox2.getText());
		 */
		
		/*String csspath = "button[class='asda-btn asda-btn--primary asda-btn--fluid asda-btn--disabled']";
		WebElement applybtn = driver.findElement(By.cssSelector(csspath));

		System.out.println("The selected checkbox is " + applybtn.getText());
		applybtn.click();*/
	}

	private static void select_all_checkboxes() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[@class='asda-filter__caption']")).click();
		// div[@class='nutrition-section__filter-list']
		WebElement cboxlist = driver.findElement(By.xpath("//div[@class='nutrition-section__filter-list']"));
		List<WebElement> cbox = driver
				.findElements(By.xpath("//div[@class='asda-checkbox-new filter-item__checkbox']"));
		int i = cbox.size();
		System.out.println("Number of checkboxes " + i);
		for (int j = 0; j < i; j++) {

			if (cbox.get(j).isEnabled()) {
				cbox.get(j).click();
				System.out.println("The checkbox enabled and selected is " + cbox.get(j).getText());
			} else {
				System.out.println("The checkbox disabled is " + cbox.get(j).getText());
			}
		}
	}

}
