package ch13.accesstextfiles;

import java.io.FileWriter;
import java.io.IOException;

public class File08_WriteTofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileWriter myWriter = new FileWriter("C:\\Workspace\\Selenium\\Docs\\writeFile.txt");
			
			myWriter.write("added this text 1");
			myWriter.append("\n this text2 is added to file");
			myWriter.close();
			System.out.println("File written successfully");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error occured");
			e.printStackTrace();
		}
				
	}

}
