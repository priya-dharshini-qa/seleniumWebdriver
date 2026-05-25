package ch13.accesstextfiles;

import java.io.File;

public class File03_deletefolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File myobj = new File("C:\\Workspace\\Selenium\\Docs\\DelFolderwithFiles");
		File myobj = new File("C:\\Workspace\\Selenium\\Docs\\DelFolderwithFiles\\");
		//File myobj = new File("C:\\Workspace\\Selenium\\Docs\\DelFolderWoFile\\");
		if (myobj.delete()) {
			System.out.println("File deleted succesfully " + myobj.getName());
		} else {
			System.out.println("failed to delete");
		}
	}

}
