/**1)Is java 100% object oriented programming language?
 * Ans=No
 * note=1. because java  supports primitive data type
 * 2.What is auto-boxing?
 * ans=process of converting from primitive to wrapper automatically
 * 3.what is auto-unboxing?
 * ans=process of converting from wrapper to primitive automatically/
 * 
 * 
 * 
 */
package Datatype;

public class Wrapper {

public static void main(String[] args) {
	int c=10;	
	Integer i=c;//Integer i=Integer.valueOf(10);
	Integer a=new Integer(20);
	int b=a;
	Integer k=new Integer(20);
	System.out.println(a==k);
	Integer p=130;
	Integer q=130;
	System.out.println(p==q);//== operator compares addresses
	Double d1=55D;
	Double d2=55D;
	System.out.println(d1==d2);
	
}
}
