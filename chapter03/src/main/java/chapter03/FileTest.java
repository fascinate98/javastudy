package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");	
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("errror : " + e);
		} catch(IOException e) {  //얘가 부모라 얘가 위로가면 에러남 ㅎ
			System.out.println("error : " + e);
		} finally {
			try {
				fis.close();
			}catch(IOException e) {
				
			}
			
		}
		
	}
}
