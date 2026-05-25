package ch08.checkbox_dropdown_radiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1_localfile {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:\\Workspace\\Selenium\\Docs\\HTML\\Checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		identify_cbox_selected_by_default();
		select_unchecked_cbox();

	}

	private static void identify_cbox_selected_by_default() {
		// TODO Auto-generated method stub
		List<WebElement> checked = driver.findElements(By.cssSelector("input:checked[type='checkbox']"));
		int i = checked.size();
		System.out.println("Number of checkboxes checked " + i);
		for (int j = 0; j < i; j++) {
			// comment to verify if else condition
			checked.get(j).click();
			if (checked.get(j).isSelected()) {
				System.out.println("The checkbox selected by default is " + checked.get(j).getAttribute("value"));
			} else {
				System.out.println("No checkbox is selected by default");
			}
		}
		driver.close();

	}

	private static void select_unchecked_cbox() {
		// TODO Auto-generated method stub
		List<WebElement> unchecked = driver.findElements(By.cssSelector("input:not(:checked)[type='checkbox']"));
		int i = unchecked.size();
		System.out.println("Number of checkboxes not checked " + i);
		for (int j = 0; j < i; j++) {
			// comment to verify if else condition
			unchecked.get(j).click();
			if (unchecked.get(j).isSelected()) {
				System.out.println("The checkbox selected is " + unchecked.get(j).getAttribute("value"));
			}
		}
		// driver.close();
	}
}
