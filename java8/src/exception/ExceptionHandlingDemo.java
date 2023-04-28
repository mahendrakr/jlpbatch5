package exception;

public class ExceptionHandlingDemo {
	public static double division(int a,int b) {
		double result=0;
	//	try{
			 result=a/b;
	//	}
	//	catch(ArithmeticException e) {
		//	System.out.println("wrong input\n denominator cannot be zero");
	//	}
		return result;
		
	}
	  
	public static void main(String[] args) {
		System.out.println("before division");
		  double output = division(10,0);
		  System.out.println(output);
		  System.out.println("after division");
	}

}
