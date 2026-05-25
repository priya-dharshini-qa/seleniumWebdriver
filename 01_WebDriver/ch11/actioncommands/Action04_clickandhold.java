package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action04_clickandhold {

	static WebDriver driver=new ChromeDriver();
	static Actions builder=new Actions(driver);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		driver.get("file:///C:\\Workspace\\Selenium\\Docs\\HTML\\Sortable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		ClickAndHoldUsingWebElemntWithoutRelease();
		//not working
		//ClickAndHoldUsingMoveByOffset();
		//ClickAndHoldUsingWebElemntWithRelease();
	}

	

	private static void ClickAndHoldUsingWebElemntWithRelease() throws InterruptedException {
		// TODO Auto-generated method stub
		//move tile5 to tile11
				WebElement tile5=driver.findElement(By.name("five"));
				WebElement tile11=driver.findElement(By.name("eleven"));
				System.out.println(tile5.getLocation());//(8, 110)
				System.out.println(tile11.getLocation());//(220, 209)
				builder.clickAndHold(tile5).perform();
				Thread.sleep(4000);
				builder.release(tile11).perform();
	}

	private static void ClickAndHoldUsingMoveByOffset() {
		// TODO Auto-generated method stub
		//move tile5 to tile11
		WebElement tile5=driver.findElement(By.name("five"));
		WebElement tile11=driver.findElement(By.name("eleven"));
		System.out.println(tile5.getLocation());//(8, 110)
		System.out.println(tile11.getLocation());//(220, 209)
		builder.moveByOffset(8, 209)
		.clickAndHold()
		.moveByOffset(220, 209)
		.release()
		.perform();
	}
	private static void ClickAndHoldUsingWebElemntWithoutRelease() {
		// TODO Auto-generated method stub
		//move tile7 to tile9
				WebElement tile7=driver.findElement(By.name("seven"));
				WebElement tile9=driver.findElement(By.name("nine"));
				System.out.println(tile7.getLocation());//(220, 110)
				System.out.println(tile9.getLocation());//(8, 209)
				builder.click(tile7)
				//not working below loc
				//builder.moveByOffset(220, 110)
				.clickAndHold()
				.moveByOffset(8, 209)
				.perform();
	}

}
