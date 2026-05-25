package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics10_IsDisplayedCmd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		//Thread.sleep(1000);
		WebElement searchbtn=driver.findElement(By.linkText("Sign in"));
		
		if(searchbtn.isDisplayed()) {
			System.out.println("the sign in button is visible "+searchbtn.isDisplayed());
		}else {
			System.out.println("the sign in button is not visible "+searchbtn.isDisplayed());
		}
		driver.close();
	}

}
