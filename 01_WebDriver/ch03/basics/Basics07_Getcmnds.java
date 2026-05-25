package ch03.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics07_Getcmnds {
	static By searchtext = By.xpath("/html/body/div[1]/div/header/div/form/input");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.asda.com/");
		WebElement searchbox = driver.findElement(searchtext);
		searchbox.sendKeys("toys");
		Thread.sleep(5000);
		// get attribute

		System.out.println("searchbox name is " + searchbox.getAttribute("name"));
		System.out.println("searchbox id is " + searchbox.getAttribute("id"));
		System.out.println("searchbox class is " + searchbox.getAttribute("class"));
		System.out.println("searchbox type is " + searchbox.getAttribute("type"));
		//this one is wrong-->System.out.println("searchbox Tagname is " + searchbox.getAttribute("Tagname"));
		System.out.println("searchbox Tagname is " + searchbox.getTagName());
		System.out.println("searchbox value " + searchbox.getAttribute("value"));

		// get location

		System.out.println("searchbox location " + searchbox.getLocation());
		System.out.println("searchbox location Xaxis " + searchbox.getLocation().getX());
		System.out.println("searchbox location Yaxis " + searchbox.getLocation().getY());
		System.out.println("searchbox class " + searchbox.getLocation().getClass());

		// get css value

		System.out.println("searchbox fontsize " + searchbox.getCssValue("font-size"));
		System.out.println("searchbox fontfamily " + searchbox.getCssValue("font-family"));
		System.out.println("searchbox color " + searchbox.getCssValue("color"));
		System.out.println("searchbox background color " + searchbox.getCssValue("background-color"));

		// get size
		System.out.println("searchbox size " + searchbox.getSize());

		driver.close();
	}

}
