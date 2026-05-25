package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics11_IsEnabledCmd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/forms/");
		// Thread.sleep(1000);

		WebElement cbox1 = driver.findElement(By.id("defaultCheck1"));
		// verify checkbox1 is enabled or not
		if (cbox1.isEnabled()) {
			System.out.println("Checkbox1 is enabled " + cbox1.isEnabled());
		} else {
			System.out.println("Checkbox1 is disabled " + cbox1.isEnabled());
		}
		// select checkbox1
		cbox1.click();
		//	verify checkbox1 is selected or not
		if (cbox1.isSelected()) {
			System.out.println("Checkbox1 is selected after clicking " + cbox1.isSelected());
		} else {
			System.out.println("Checkbox1 is not seleceted " + cbox1.isSelected());
		}
		WebElement cbox2 = driver.findElement(By.id("defaultCheck2"));

		Thread.sleep(5000);
		if (cbox2.isEnabled()) {
			System.out.println("Checkbox2 is enabled " + cbox2.isSelected());
		} else {
			System.out.println("checkbox2 is disabled " + cbox2.isSelected());
		}
		//driver.close();

	}

}
