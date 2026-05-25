package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics01_ClearCmd {
	static By searchpath = By.xpath("/html/body/div[1]/div/header/div/form/input");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.asda.com/");
		 * driver.findElement(By.linkText("Sign in")).click();
		 * System.out.println("clicked signin"); Thread.sleep(5000); String css =
		 * "html body div#app main.theme-ghs div.app div.container-wrapper div.main-container.login div.login-container form div.username-box div.input-box div.input-box__wrapper.false input.email-phone-input"
		 * ; WebElement abc = driver.findElement(By.cssSelector(css));
		 * abc.sendKeys("abc@gmail.com"); abc.clear(); Thread.sleep(3000);
		 * abc.sendKeys("qwerty@gmail.com"); Thread.sleep(3000);
		 */
		
		driver.get("https://account.sainsburys.co.uk/gol/login?login_challenge=60d161f5f3014f7fa1380c1baf1b03bc");
		WebElement abc = driver.findElement(By.id("username"));
		abc.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		abc.click();
		abc.clear();
		abc.sendKeys(Keys.chord(Keys.CONTROL, "A",Keys.DELETE));
		Thread.sleep(3000);
		abc.sendKeys("qwerty@gmail.com");
		Thread.sleep(3000);
		//driver.close();

		// driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

		/*
		 * WebElement searchbox = driver.findElement(searchpath);
		 * searchbox.sendKeys("Fruits"); Thread.sleep(5000); searchbox.clear();
		 * driver.findElement(searchpath).sendKeys("chocolates"); Thread.sleep(2000);
		 * driver.close();
		 * 
		 */	}

}
