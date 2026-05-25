package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action07_draganddrop {
	static WebDriver driver = new ChromeDriver();
	static Actions builder = new Actions(driver);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// dragAndDrop();
		 dragAndDropBy();//not working
		//dragAndDropBy2();
	}

	private static void dragAndDrop() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\DragAndDrop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		builder.dragAndDrop(src, target).perform();
	}

	private static void dragAndDropBy() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\Draggable_demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement src = driver.findElement(By.id("draggableContainer"));
		// builder.clickAndHold(src).perform();

		builder.dragAndDropBy(src, 500, 300).perform();
		System.out.println("done");
	}

	private static void dragAndDropBy2() {
		// TODO Auto-generated method stub
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\DragMe.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement src = driver.findElement(By.id("draggable"));
		// builder.clickAndHold(src).perform();

		builder.dragAndDropBy(src, 200, 300).perform();
		System.out.println("done");
	}

}
