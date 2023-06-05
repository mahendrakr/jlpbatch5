package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionHandlingDemo {
	public static double division(int a,int b) {
		double result=0;
		try{
			 result=a/b;
		}
		
		catch(ArithmeticException e) {
		System.out.println("wrong input\n denominator cannot be zero");
		}
		return result;
		
	}
	public static void m1() {
		Path path = null;
		BufferedReader br =null;
		try {
			path= Paths.get("E:\\JAVA\\path1.txt");
			 br = Files.newBufferedReader(path);
			while(br.ready()) {
				String line = br.readLine();
				System.out.println(line);
			}
			System.out.println("from try block");
		} catch (IOException|NullPointerException e) {
			e.printStackTrace();
		}
	//	catch(NullPointerException e) {
		//	e.printStackTrace();
		//}
		
		finally {
			try {
				System.out.println("from finally block");
				br.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  
	public static void main(String[] args) {
		System.out.println("before division");
		  double output = division(10,0);
		  System.out.println(output);
		  System.out.println("after division");
		  m1();
	}

}
