package ch13.accesstextfiles;

import java.io.File;

public class File01_createfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//File myobj = new File("C:\\Workspace\\Selenium\\Docs\\Testfile.txt");
			File myobj = new File("C:\\Workspace\\Selenium\\Docs\\Testfile.jpeg");
			if (myobj.createNewFile()) {
				System.out.println("File created succesfully " + myobj.getName());
			} else {
				System.out.println("file already exists");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error occured");
			e.printStackTrace();
		}
	}

}
