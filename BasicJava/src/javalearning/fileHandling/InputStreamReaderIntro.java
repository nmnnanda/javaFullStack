 package javalearning.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderIntro {

	public static void main(String[] args) {
		char[] array = new char[50];
		File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\file1.txt");
		InputStream inputStream;
		try {
			
			inputStream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(inputStream);
			reader.read(array);
			System.out.println(array);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	   
	}

}
