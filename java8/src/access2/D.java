package access2;

import access1.A;

public class D extends A {
	public static void main(String[] args) {
		D d=new D();
		System.out.println(d.a);
	//	System.out.println(d.b);
		System.out.println(d.c);
		d.m2();
		d.m1();
		d.m2();
	//	d.m3();
		A a=new A();
		System.out.println(a.c);
		A a1=new D();
		System.out.println(a1.c);
	}

}
