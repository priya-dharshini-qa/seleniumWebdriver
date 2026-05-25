package ch13.accesstextfiles;

import java.io.File;

public class File06_getfileinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File myObj = new File("C:\\Workspace\\Selenium\\Docs\\getFileInfo.txt");
		//html file???
		File myObj = new File("C:\\Workspace\\Selenium\\Docs\\Radiobutton1.txt");
		if (myObj.exists()) {
			System.out.println("File name " + myObj.getName());
			System.out.println("Absolute path " + myObj.getAbsolutePath());
			System.out.println(" Readable " + myObj.canRead());
			System.out.println(" Writeable " + myObj.canWrite());
			System.out.println(" File size " + myObj.length());
			System.out.println(" Writable changed " + myObj.setWritable(true));

		} else {
			System.out.println("recheck path");
		}
	}

}
