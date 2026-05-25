package ch06.customisexpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath8_using_child {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// selecting the first child of a particular list
		 //xpath_with_firstchild();
		//xpath_with_childlist();
		 xpath_with_nthchild();

	}

	public static void xpath_with_firstchild() {
		// TODO Auto-generated method stub
		// class="ul-nav"
		// WebElement about = driver.findElement(By.xpath("//ul[@class,'ul-nav']
		// //child::li"));
		WebElement about = driver
				.findElement(By.xpath("//html/body/div[1]/div/div/div[11]/div/div/div/div[2]/div[2]/ul //child::li"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = about.getText();
		System.out.println(text);
		driver.close();
	}

	public static void xpath_with_childlist() {
		// TODO Auto-generated method stub
		// class="ul-nav"
		// WebElement about = driver.findElement(By.xpath("//ul[@class,'ul-nav']
		// //child::li"));
		List<WebElement> about = driver
				.findElements(By.xpath("//html/body/div[1]/div/div/div[11]/div/div/div/div[2]/div[2]/ul //child::li"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Number of elements " + about.size());
		for (int i = 0; i < about.size(); i++) {
			System.out.println(+i + ": " + about.get(i).getText());

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
	}

	public static void xpath_with_nthchild() {
		// TODO Auto-generated method stub
		// class="ul-nav"
		// WebElement about = driver.findElement(By.xpath("//ul[@class,'ul-nav']
		// //child::li"));
		WebElement about = driver.findElement(
				By.xpath("//html/body/div[1]/div/div/div[11]/div/div/div/div[2]/div[2]/ul //child::li[5]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String text = about.getText();
		System.out.println(text);
		driver.close();
	}
}
