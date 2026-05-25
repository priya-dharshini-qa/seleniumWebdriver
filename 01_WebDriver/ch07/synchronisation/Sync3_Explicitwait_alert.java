package ch07.synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync3_Explicitwait_alert {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

	//	alertIsPresentAccept();
	//	alertIsPresentDismiss();
		alertIsPresentWIthEnterText();
		

	}

	private static void alertIsPresentWIthEnterText() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent()).sendKeys(Keys.chord(Keys.BACK_SPACE)+"test");
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		System.out.println("Entered text and cancelled alert");
	}

	private static void alertIsPresentDismiss() {
		// TODO Auto-generated method stub
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		System.out.println("Alert cancelled");
	}

	private static void alertIsPresentAccept() {
		// TODO Auto-generated method stub
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert clicked");

		
		// decision alert is present
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button")).click
		 * (); WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		 * System.out.println("Alert cancelled"); //driver.close();
		 */
		// alert with textbox
	}

	

}
