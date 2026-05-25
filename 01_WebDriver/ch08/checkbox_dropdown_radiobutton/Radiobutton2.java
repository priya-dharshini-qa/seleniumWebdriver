package ch08.checkbox_dropdown_radiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton2 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		System.out.println("accepted the cookies");
		// search fruits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		searchbox.sendKeys("fruits" + Keys.ENTER);
		System.out.println("search completed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select_a_radiobutton();
		//PrintAllRadioButtons();
		 select_a_radiobutton_fromlist();

	}
	private static void select_a_radiobutton_fromlist() {

		driver.findElement(By.xpath("//div[@class='facet-button__content']")).click();
		WebElement Radiobtnlist = driver.findElement(By.xpath("//div[@class='sort-by-select__option-list']"));
		//WebElement radiobtn=driver.findElement(By.cssSelector("div[data-auto-id='radio-button-carbohydrate']"));
		WebElement radiobtn=driver.findElement(By.cssSelector("label[for='carbohydrate']"));
		
		if(!radiobtn.isSelected()) {
			radiobtn.click();
			System.out.println("The radiobutton selected is "+radiobtn.getAttribute("value"));
		}
	}
	private static void select_a_radiobutton() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='facet-button__description']")).click();
		WebElement selectbtn = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/section/main/div[2]/div/div[4]/div/div[1]/div[1]/div/div[2]/form/div[2]/div[2]/label"));
		selectbtn.click();
		System.out.println("the radio button selected is " + selectbtn.getText());
		driver.close();
	}

	private static void PrintAllRadioButtons() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='facet-button__description']")).click();
		WebElement Radiobtn = driver.findElement(By.xpath("//div[@class='sort-by-select__option-list']"));
		List<WebElement> options = Radiobtn.findElements(By.tagName("div"));
		int i = options.size();
		System.out.println("Number of elements in the radiobutton list " + i);
		System.out.println("***Printing all radiobutton values***");
		for (int j = 0; j < i; j++) {
			System.out.println(options.get(j).getText());
		}
	}

	
			
			
		//}
		/*
		 * WebElement Radiobtn =
		 * driver.findElement(By.xpath("//div[@class='sort-by-select__option-list']"));
		 * List<WebElement> options = Radiobtn.findElements(By.tagName("div")); int i =
		 * options.size();
		 * System.out.println("Number of elements in the radiobutton list " + i);
		 * 
		 * for (int j = 0; j < i; j++) {
		 * 
		 * if (options.get(j).getText().equals("Fibre")) { options.get(j).click();
		 * System.out.println("The radio button is selected " +
		 * options.get(j).getText()); } }
		 */
		
		/*
		 * WebElement selectbtn =
		 * driver.findElement(By.cssSelector("label[for='protein']")); // WebElement
		 * selectbtn = // driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/section/main/div[2]/div/div[4]/div/div[1]/div[1]/div/div[2]/form/div[2]/div[7]/label"
		 * )); //WebElement selectbtn = driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/section/main/div[2]/div/div[4]/div/div[1]/div[1]/div/div[2]/form/div[2]/div[6]/label"
		 * )); selectbtn.click(); System.out.println("selected radio button is " +
		 * selectbtn.getText());
		 */

		// TODO Auto-generated method stub
		/*
		 * driver.findElement(By.xpath("//div[@class='facet-button__description']")).
		 * click(); //WebElement selectbtn = driver.findElement(By.
		 * xpath("//div[@class='sort-by-select__option-list'] //child::li[5]"));
		 * WebElement selectbtn = driver.findElement(By.
		 * xpath("/html/body/div[1]/div[2]/section/main/div[2]/div/div[4]/div/div[1]/div[1]/div/div[2]/form/div[2] //child::li[5]"
		 * )); selectbtn.click();
		 * System.out.println("selected radio button is "+selectbtn.getText());
		 */
	
}
