package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector2_Class_attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//// Customize css selector using class--> tagname.<value of class attribute>
		WebElement search = driver.findElement(By.cssSelector("input.search-input"));
		search.sendKeys("fruits");
		System.out.println("search completed");
		driver.close();	
		
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.matalan.co.uk/"); String loginlink =
		 * "#__next > div.sc-ciicml.evuSIq > header > div > div.sc-gLTcDU.kvriei > div > div > div > button > div > svg"
		 * ; String loginbtn =
		 * "#__next > div.sc-ciicml.evuSIq > header > div > div.sc-gLTcDU.kvriei > div > div.sc-jSMfEi.dzMqmt > div > div > div > section > nav > ul > li:nth-child(1) > div > a"
		 * ;
		 * 
		 * WebElement login = driver.findElement(By.cssSelector(loginlink));
		 * login.click(); System.out.println("Clicked login icon"); Thread.sleep(5000);
		 * WebElement login1 = driver.findElement(By.cssSelector(loginbtn));
		 * login1.click(); System.out.println("Clicked login button");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); WebElement
		 * email = driver.findElement(By.cssSelector("input.sc-eTtvFv jKIVyy"));
		 * email.sendKeys("abc@gmail.com"); WebElement pwd =
		 * driver.findElement(By.cssSelector("input.sc-eTtvFv jKIVyy"));
		 * pwd.sendKeys("abc"); WebElement submitbtn =
		 * driver.findElement(By.cssSelector("button.sc-jfmDQi kPtVnU"));
		 * submitbtn.submit();
		 */
	}

}
