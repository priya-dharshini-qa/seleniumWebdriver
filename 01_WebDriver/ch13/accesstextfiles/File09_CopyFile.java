package ch13.accesstextfiles;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class File09_CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//copies all files from src to destined loc
		FileHandler.copy(new File("C:\\Workspace\\Selenium\\Docs\\SrcFolder"), new File("C:\\Workspace\\Selenium\\Docs\\DestFolder"));
		System.out.println("copy file completed");
		
	}

}
