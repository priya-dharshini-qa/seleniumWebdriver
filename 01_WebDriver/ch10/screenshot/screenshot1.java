package ch10.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		// search fruits
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		System.out.println("search completed");

		// take screenshot
		String screenshot = "C:\\Workspace\\Selenium\\Screenshot\\" + "Errormessage" + ".jpeg";
		// C:\Workspace\Selenium\Screenshot
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File(screenshot));
		
		System.out.println("execution completed");

	}

}
