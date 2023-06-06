package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionPropogation {
	public void m1() throws IOException {
		System.out.println("from m1");
		Path path = null;
		BufferedReader br = null;
		path = Paths.get("E:\\JAVA\\path1.txt");
		br = Files.newBufferedReader(path);
		while (br.ready()) {
			String line = br.readLine();
			System.out.println(line);
		}
		br.close();
		System.out.println("from try block");
   System.out.println("end of m1");
	}

	public int m2() throws IOException {
		System.out.println("from m2");
		m1();
		System.out.println("end of m2");
		return 10;
	}

	public void m3() throws IOException {
		System.out.println("from m3");
		m2();
		System.out.println("end of m3");
	}

	public static void main(String[] args) {
       ExceptionPropogation e =new ExceptionPropogation();
       try {
		e.m3();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       System.out.println("end of main");
	}

}
