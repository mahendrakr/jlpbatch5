package operator;
/**
 * byte<short<char<int<long<float<double
 * max(int,type of a,type of b)
 * e.g. type of a is float,type of b is long
 *     max(int,float,long)=>float
 *     so,float f= a+b
 *     N/D if N or D or both value is 0.0 then result will be NaN(not a number)
 * @author prtks
 *
 */
public class ArithmeticOperator {
	static float f1;
	static float f2;
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(a+b);
	byte b1=10;
	byte b2=20;
	int b3=b1+b2;
	float f=10;
	double d=20;
	double s=f+d;
	long x=0;
	long y=0;
	//System.out.println(x/y);
	double d1=-10.0;
	double d2=0;
	System.out.println(d1/d2);
	System.out.println(10.0/0);
	System.out.println(10.0/0.0);
	System.out.println(0/0.0);
	System.out.println(0.0/0);
	System.out.println(-0/0.0);
	System.out.println(-0.0/0);
	System.out.println(0.0/0.0);
	System.out.println(-0.0/0.0);
	System.out.println("****************");
	System.out.println(f1/f2);
}
}
