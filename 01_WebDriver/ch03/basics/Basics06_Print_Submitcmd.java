package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics06_Print_Submitcmd {
	static By searchtext = By.xpath("/html/body/div[1]/div/header/div/form/input");
	static By btn= By.cssSelector("#root > div > header > div > form > button > span > svg");
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		driver.manage().window().maximize();
		// search text and send submit command 
		WebElement searchbox = driver.findElement(searchtext);
		searchbox.sendKeys("Fruits");
		//searchbox.submit();
		
		//submit by locating the submit button
		driver.findElement(btn).submit();
		
		Thread.sleep(3000);
		driver.close();
	}

}
