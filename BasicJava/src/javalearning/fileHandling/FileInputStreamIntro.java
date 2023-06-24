 package javalearning.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//Read data from file :Using FileInputStream
public class FileInputStreamIntro {

	public static void main(String[] args) {
		byte[] array = new byte[10];
		
		File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\file1.txt");
//		if(file.exists()){
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				fileInputStream.read(array);
				for(byte b:array){
					System.out.print(b+" ");
				}
				System.out.println();
				String data = new String(array);
				System.out.println(data);
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}else{
//			System.out.println("File not found");
//		}

	}

}
