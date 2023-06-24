 package javalearning.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamIntro {

	public static void main(String[] args) {
		String data = "This is  writing operation";
		File file = new File("C:\\Users\\Atul\\Desktop\\JavaFiles\\file2.txt");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			byte[] arr = new byte[100];
			for(int i=0;i<data.length();i++){
				arr[i] =(byte)data.charAt(i);
			}
			
//			for(byte ch:arr){
//				System.out.println(ch);
//			}
			
			fileOutputStream.write(arr);
			System.out.println("Write operation done successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
