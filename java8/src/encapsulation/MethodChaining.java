package encapsulation;

public class MethodChaining {
	public void m1 () {
		m2();
		System.out.println("m1");
		
	}
	public void m2() {
		m3();
	System.out.println("m2");
	}
	public void m3() {
		m4();
		System.out.println("m3");
	}
	public void m4() {
		System.out.println("m4");
		m1();
	}
	 public static void main(String[] args) {
		 MethodChaining mc= new MethodChaining();
		 mc.m1();
		 System.out.println("main");
		
	}
}
