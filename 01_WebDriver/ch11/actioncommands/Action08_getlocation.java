package ch11.actioncommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action08_getlocation {

	static WebDriver driver = new ChromeDriver();
	static Actions builder = new Actions(driver);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//getlocationdata();
	//	getlocationdata2();
		googleImg();

	}

	private static void googleImg() {
		// TODO Auto-generated method stub
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		//search fruits
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		System.out.println("search completed");
		List<WebElement> img_list=driver.findElements(By.xpath("(//picture[@class='asda-image picture'])"));
		System.out.println(img_list.size());
		for (int i = 0; i < img_list.size(); i++) {
			String nameDetails= img_list.get(i).getAttribute("value");
			//String nameDetails= img_list.get(i).getText();
			System.out.println(nameDetails);
			System.out.println("The x coordinate: " + img_list.get(i).getLocation().getX());
			System.out.println("The Y coordinate: " + img_list.get(i).getLocation().getY());
		}
	}

	private static void getlocationdata2() {
		// TODO Auto-generated method stub
		driver.get("https://www.asda.co.uk/");
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");

		WebElement demo = driver.findElement(By.xpath("//div[@class='useful-links']"));			

		List<WebElement> listcount = demo.findElements(By.tagName("li"));
		System.out.println(listcount.size());
		for (int i = 0; i < listcount.size(); i++) {
			String name = listcount.get(i).getText();
			System.out.println(name);
			System.out.println("The x coordinate: " + listcount.get(i).getLocation().getX());
			System.out.println("The Y coordinate: " + listcount.get(i).getLocation().getY());
		}
	}

	private static void getlocationdata() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\UI_Selectable_demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement demo = driver.findElement(By.id("selectable"));

		List<WebElement> listcount = driver.findElements(By.tagName("li"));
		System.out.println(listcount.size());
		for (int i = 0; i < listcount.size(); i++) {
			String name = listcount.get(i).getAttribute("name");
			System.out.println(name);
			System.out.println("The x coordinate: " + listcount.get(i).getLocation().getX());
			System.out.println("The Y coordinate: " + listcount.get(i).getLocation().getY());
		}
	}

}
