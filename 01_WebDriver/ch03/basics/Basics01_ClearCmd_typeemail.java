package ch03.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics01_ClearCmd_typeemail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://www.matalan.co.uk/");
		String loginlink = "#__next > div.sc-ciicml.evuSIq > header > div > div.sc-gLTcDU.kvriei > div > div > div > button > div > svg";

		String loginbtn = "#__next > div.sc-ciicml.evuSIq > header > div > div.sc-gLTcDU.kvriei > div > div.sc-jSMfEi.dzMqmt > div > div > div > section > nav > ul > li:nth-child(1) > div > a";
		String emailpath = "Email address";
		String pwdpath = "Password";

		WebElement login = driver.findElement(By.cssSelector(loginlink));
		login.click();
		System.out.println("Clicked login icon");
		Thread.sleep(5000);
		WebElement login1 = driver.findElement(By.cssSelector(loginbtn));
		login1.click();
		System.out.println("Clicked login button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement email = driver.findElement(By.name(emailpath));
		email.sendKeys("abc@gmail.com");
		email.clear();
		WebElement email1 = driver.findElement(By.name(emailpath));
		email1.sendKeys("qwerty@gmail.com");
		WebElement pwd = driver.findElement(By.name(pwdpath));
		pwd.sendKeys("abc");
		WebElement submitbtn = driver.findElement(By.xpath("/html/body/div[1]/div[5]/main/div/div[1]/section/div/div[1]/div/form/div[5]/div/button"));
		submitbtn.submit();
		Thread.sleep(3000);

	}
}
