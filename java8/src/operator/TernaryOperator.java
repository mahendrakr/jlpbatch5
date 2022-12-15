package operator;

public class TernaryOperator {
	public static void main(String[] args) {
	boolean r=10>5?true:false;
	System.out.println(r);
	int a=10;
	String s=a++==10?"nikita":"riya";
	System.out.println(s);
	int marks=68;
	int twelth=50;
	String r2=marks>=60?(twelth>=60?"eligible":"not eligible"):"not eligible because tenth";
	System.out.println(r2);
	
	}

}
