package ch13.accesstextfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File11_WriteDatatoTextFile {
	public static String search = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.asda.co.uk/");
		WriteInTxtFile("Website opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/button[1]";
		// accept cookies
		WebElement acceptcookies = driver.findElement(By.xpath(xpath));
		acceptcookies.click();
		WriteInTxtFile("accepted the cookies");
		System.out.println("accepted the cookies");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='search-input']"));
		ReadFromTextFile();
		searchbox.sendKeys(search);
		System.out.println("search completed");
		WriteInTxtFile("Entered the input " +search);
		System.out.println("Write to file completed");
	}

	private static void ReadFromTextFile() {
		// TODO Auto-generated method stub
		File file = new File("./Resource/Testdata/Testinput.txt");
		try (FileReader fr =new FileReader(file)){
			BufferedReader br= new BufferedReader(fr);
			search = br.readLine();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	private static void WriteInTxtFile(String information) {
		// TODO Auto-generated method stub
		File OutputFile = new File("./Resource/output.txt");
		Date date = new Date();
		try (FileWriter fw=new FileWriter(OutputFile, true)){
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write(date.toString()+": "+ information);
			bw.newLine();
			bw.close();
			System.out.println("Info is logged");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
