package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics02_getTextCmd {
	static By searchtext = By.xpath("/html/body/div[1]/div/header/div/form/select");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		// driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		WebElement text = driver.findElement(searchtext);
		System.out.println(text.getText());
		driver.close();
	}

}
