package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action02_selectusingkeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\SelectableEx.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		 //selectUsingShiftKeys();
		//selectUsingCtrlKeys();
		//not working
	selectARowUsingOffset();

	}

	private static void selectARowUsingOffset() {
		// TODO Auto-generated method stub
		WebElement element01 = driver.findElement(By.name("gala apples"));
		WebElement element02 = driver.findElement(By.name("granny smith"));
		WebElement element03 = driver.findElement(By.name("green apple"));

		
		  WebElement element04 = driver.findElement(By.name("braeburn apples"));
		  System.out.println(element04.getLocation());// (255, 72)
		  System.out.println(element04.getLocation().getX());//
		  System.out.println(element04.getLocation().getY());//
		  
			/*
			 * WebElement element05 = driver.findElement(By.name("red delicious"));
			 * System.out.println(element05.getLocation());// (255, 174)
			 * 
			 * WebElement element06 = driver.findElement(By.name("jazz"));
			 * System.out.println(element06.getLocation());// (255, 275)
			 */		 
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.clickAndHold(element01)
		.moveByOffset(255, 72)
		.keyUp(Keys.CONTROL)
		.release().build().perform();

	}

	private static void selectUsingShiftKeys() {
		// TODO Auto-generated method stub
		WebElement element01 = driver.findElement(By.name("granny smith"));
		WebElement element02 = driver.findElement(By.name("red delicious"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.SHIFT)
		.click(element01)
		.click(element02)
		.keyUp(Keys.SHIFT)
		.build().perform();

		//driver.close();
	}

	private static void selectUsingCtrlKeys() {
		// TODO Auto-generated method stub
		WebElement element01 = driver.findElement(By.name("granny smith"));
		WebElement element02 = driver.findElement(By.name("red delicious"));
		WebElement element03 = driver.findElement(By.name("jazz"));
		WebElement element04 = driver.findElement(By.name("golden delicious"));
		WebElement element05 = driver.findElement(By.name("green apple"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(element01).click(element02).click(element03).click(element04)
				.click(element05).keyUp(Keys.CONTROL).build().perform();

		// driver.close();
	}

}
