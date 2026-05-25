package ch12.multipletabs;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab04_Sv4_openNewWindowOrTab {

	static WebDriver driver;
	static String baseUrl = "https://www.asda.co.uk/";
	static String selectlink = Keys.chord(Keys.CONTROL, Keys.RETURN);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		OpenNewWindow();
		openNewTab();
		
	}

	private static void setUp() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.println(driver.getTitle());
	}

	private static void OpenNewWindow() {
		// TODO Auto-generated method stub
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get("https://www.aldi.co.uk/");
		System.out.println("Running Open new window method: " + driver.getTitle());
	}

	private static void openNewTab() {
		// TODO Auto-generated method stub
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
		newWindow.get("https://www.tesco.co.uk/");
		System.out.println("Running Open new tab method: " + driver.getTitle());
	}
}
