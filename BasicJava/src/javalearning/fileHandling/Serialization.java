 package javalearning.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//write
public class Serialization {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(101,"Arjun",25000.0);
		File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\serialiazedFile.txt");
		OutputStream out = new FileOutputStream(file);
       ObjectOutputStream outputStream = new ObjectOutputStream(out);
	   outputStream.writeObject(emp);
	   outputStream.close();
	   System.out.println("Object serialiazed successfully");
	
	}

}
