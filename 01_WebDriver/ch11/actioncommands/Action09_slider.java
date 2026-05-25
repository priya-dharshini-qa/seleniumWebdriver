package ch11.actioncommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action09_slider {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// sliderDemo();
		sliderDemoAldi();
	}

	private static void sliderDemoAldi() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://www.aldi.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "//button[@id='onetrust-accept-btn-handler']";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='typeahead']"));
		searchbox.sendKeys("toys" + Keys.ENTER);
		System.out.println("search completed");

		WebElement pointer = driver.findElement(By.xpath("//div[@class='noUi-touch-area']"));
		WebElement slider = driver.findElement(By.xpath("//div[@class='noUi-connect']"));

		int pointerWidth = pointer.getSize().getWidth();
		int sliderWidth = slider.getSize().getWidth();
		System.out.println("Pointer width: " + pointerWidth);
		System.out.println("Slider width: " + sliderWidth);
		Actions builder1 = new Actions(driver);
		int desiredPositionInPercent = 25;
		int xoffset = (int) ((sliderWidth - pointerWidth) * (desiredPositionInPercent / 100.0));
		Action movePointer = builder1.clickAndHold(pointer).moveByOffset(xoffset, 0).release().build();
		movePointer.perform();
		WebElement value1 = driver
				.findElement(By.xpath("//span[@class='category-facets__item--price price-min js-price-min']"));
		System.out.println(value1.getText());
		System.out.println("done1");

		Thread.sleep(5000);
		WebElement currentPointer = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']"));

		Actions builder2 = new Actions(driver);
		Thread.sleep(5000);
		int desiredPositionInPercent2 = 50;
		int xoffset2 = (int) ((sliderWidth) * (desiredPositionInPercent2 / 100.0));
		builder1.clickAndHold(currentPointer).moveByOffset(xoffset2, 0).release().build().perform();
		Thread.sleep(2000);
		WebElement value2 = driver
				.findElement(By.xpath("//span[@class='category-facets__item--price price-min js-price-min']"));
		System.out.println(value2.getText());
		System.out.println("done2");
	}

	private static void sliderDemo() {
		// TODO Auto-generated method stub
		driver.get("https://demo.automationtesting.in/Slider.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div[2]/button[2]/p")).click();

		WebElement pointer = driver
				.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));

		int pointerWidth = pointer.getSize().getWidth();
		int sliderWidth = slider.getSize().getWidth();
		System.out.println("Slider width: " + sliderWidth);
		System.out.println("Pointer width: " + pointerWidth);

		Actions builder = new Actions(driver);
		int desiredPositionInPercent = 50;
		int xoffset = (int) ((sliderWidth - pointerWidth) * (desiredPositionInPercent / 100.0));
		System.out.println("Xoffset value : " + xoffset);
		/*
		 * Action movePointer = builder.clickAndHold(pointer).moveByOffset(xoffset,
		 * 0).release().build(); movePointer.perform();
		 */
		Action dragAndDrop = builder.clickAndHold(pointer).moveByOffset(xoffset, 0).release().build();
		// Action dragAndDrop = builder.dragAndDropBy(pointer,xoffset,
		// 0).release().build();
		dragAndDrop.perform();
		System.out.println("done");
	}

}
