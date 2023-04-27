package javalearning.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
//readObject
//read
public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\serialiazedFile.txt");
	  InputStream inputStream = new FileInputStream(file);
      ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
	  Employee obj = (Employee)objectInputStream.readObject();
	  System.out.println(obj.empid);
	  System.out.println(obj.empName);
	  System.out.println(obj.empSalary);
	
	}

}
