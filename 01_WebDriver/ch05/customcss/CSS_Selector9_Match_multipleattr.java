package ch05.customcss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector9_Match_multipleattr {

	public static void main(String[] args) {
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
		WebElement store = driver.findElement(By.cssSelector("#root > div > header > div > div.top-nav > ul > li:nth-child(2) > a"));
		store.click();
		// Customize css selector using multiple attr--> tagname[attr1=value of attr1][attr2=value of attr2]
		String locpath="input[id='q'][name='qp']";
		WebElement location = driver.findElement(By.cssSelector(locpath));
		location.sendKeys("london");
		String searchpath="button[class='search-button Locator-button Locator-button--search'][type='submit']";
		WebElement search = driver.findElement(By.cssSelector(searchpath));
		search.click()	;
		System.out.println("Search completed");
		
		
		
		driver.close();
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.tesco.co.uk/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); String
		 * xpath =
		 * "/html/body/div/div/div/div/div[1]/header/div/div[1]/div/nav/div/div/div/ul/li[1]/a/span";
		 * // click signin WebElement signin = driver.findElement(By.xpath(xpath));
		 * signin.click(); System.out.println("clicked signin");
		 * 
		 * 
		 * // Customize css selector using multiple attr--> tagname[attr1=value of
		 * attr1][attr2=value of attr2] String
		 * emailpath="input[id='email'][class^='base-components__RootElement-sc-1mosoyj-1 styled__StyledInput']"
		 * ; //String
		 * emailpath="input[id='email'][class='base-components__RootElement-sc-1mosoyj-1 styled__StyledInput-sc-1jd5f57-0 component__StyledAsInput-sc-1kpmik-4 htTYER kdxKNp beans-input']"
		 * ; WebElement email = driver.findElement(By.cssSelector(emailpath));
		 * email.sendKeys("abc@gmail.com"); String
		 * pswdpath="input[id='password'][name='password']"; WebElement pswd =
		 * driver.findElement(By.cssSelector(pswdpath)); pswd.sendKeys("abc@gmail.com");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); String
		 * signinbtn
		 * ="button[id^='signin'][class='styled__BaseButton-rsekm1-0 styled__PrimaryButton-rsekm1-2 iYTkxR jsdKQs sc-fnGiBr eFriuu beans-button__container']"
		 * ; WebElement submit = driver.findElement(By.cssSelector(signinbtn));
		 * submit.click(); //driver.close();
		 */
	}

}
