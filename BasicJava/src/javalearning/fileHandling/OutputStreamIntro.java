package javalearning.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamIntro {

	public static void main(String[] args) {
        String str ="This is writer class";
       
		try {
			File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\newFile.txt");
			OutputStream out = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(out);
		    writer.write(str);
		    System.out.println("Writing done successfully");
		    writer.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
