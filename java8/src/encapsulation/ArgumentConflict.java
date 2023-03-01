package encapsulation;

public class ArgumentConflict {
	//public void m1(int[] arr) {
		//System.out.println("array");
		
	//}
	public void m1 (String a) {
		System.out.println("String");
	}
	public void m1 (Object b) {
		System.out.println("Object");
	}
	public void m1(int a, long b) {
		System.out.println("int,long");
	}
	public void m1(float a,int b) {
		System.out.println("long,int");
	}
	public static void main(String[] args) {
		ArgumentConflict a= new ArgumentConflict();
//		a.m1(null);
		a.m1(10,20);
	}
	

}
