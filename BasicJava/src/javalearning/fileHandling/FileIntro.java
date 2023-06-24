 package javalearning.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro {

	public static void main(String[] args) {
		//create a file
		
		//check whether file created or not
		try {
			File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\file1.txt");
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
	}

}
