package ch12.multipletabs;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab02_getwindowhandlejs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String WindowAsda,WindowAldi;
		
		driver.get("https://www.asda.co.uk/");
		WindowAsda=driver.getWindowHandle();
		System.out.println("First window "+WindowAsda);
		
		jse.executeScript("window.open('https://www.aldi.co.uk/');");
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		WindowAldi=driver.getWindowHandle();
		System.out.println("Second window "+WindowAldi);
		
		System.out.println("Number of windows: "+driver.getWindowHandles().size());
		driver.switchTo().window(WindowAsda);
		System.out.println(driver.getTitle());
		driver.switchTo().window(WindowAldi);
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
