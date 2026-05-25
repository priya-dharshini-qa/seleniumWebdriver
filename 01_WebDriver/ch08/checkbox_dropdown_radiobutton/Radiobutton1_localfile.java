package ch08.checkbox_dropdown_radiobutton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton1_localfile {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:\\Workspace\\Selenium\\Docs\\HTML\\RadioButton.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement radiobtn=driver.findElement(By.xpath("/html/body/input[8]"));
		if(!radiobtn.isSelected()) {
			radiobtn.click();
			System.out.println("The radiobutton selected is "+radiobtn.getAttribute("value"));
		}


	}

}
