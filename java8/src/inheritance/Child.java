package inheritance;
//you(child class) can not inherit (extends) more than one class
public class Child extends Parent {
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.name);
		c.m1();
	//	c.m2();
		c.m3();
	}

}
