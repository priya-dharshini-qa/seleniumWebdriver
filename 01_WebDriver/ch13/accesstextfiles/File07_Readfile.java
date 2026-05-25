package ch13.accesstextfiles;

import java.io.File;
import java.util.Scanner;

public class File07_Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("C:\\Workspace\\Selenium\\Docs\\Radiobutton1.txt");

			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error occurred");
			e.printStackTrace();
		}
	}

}
