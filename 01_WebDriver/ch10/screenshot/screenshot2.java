package ch10.screenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot2 {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.asda.co.uk/");
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");

		//StoreInProjectFolder();
		//ScreenshotOfElement();
		//ScreenshotOfMilliSecond();
		ScreenCaptureWithCustomDateTime();

	}

	private static void StoreInProjectFolder() throws IOException {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		String path = "/Resource/Screenshot";
		String extension = ".jpeg";

		// search fruits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits");
		System.out.println("search completed");
		File srcfile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File(currentDir + path + "Screenshot1" + extension));
	}

	private static void ScreenshotOfElement() throws IOException {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		String path = "/Resource/Screenshot";
		String extension = ".jpeg";

		// search fruits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits");
		System.out.println("search completed");
		File srcfile1 = searchbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File(currentDir + path + "Screenshot2" + extension));
	}

	private static void ScreenshotOfMilliSecond() throws IOException {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		String path = "/Resource/Screenshot";
		String extension = ".jpeg";

		// search fruits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits");
		System.out.println("search completed");
		File srcfile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1, new File(currentDir + path + System.currentTimeMillis() + extension));
	}

	private static void ScreenCaptureWithCustomDateTime() {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		String path = "/Resource/Screenshot/";
		String extension = ".jpg";
		String dateTime = getDateTime();

		try {
			File srcfile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			System.out.println(currentDir+path + dateTime + extension);
			FileUtils.copyFile(srcfile1, new File(currentDir+path + dateTime + extension));
			System.out.println("screenshot captured");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to capture screenshot");
		}
	}

	private static String getDateTime() {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("dd_MMM_YYYY_h_M_s_sss");
		Date date = new Date();
		String dateAndTimeOfError = dateFormat.format(date);
		System.out.println("date and time captured "+dateAndTimeOfError);
		return dateAndTimeOfError;
	}

}
