package inheritance;
/**
 * this keyword represents always current object(TBD after overriding).
 * if local variable name and instance variable name are same,and by default local variable
 * has age over instance variable.and if you want access to instance variable then you
 * have to use this keyword.below is the reference
 * 
 * you can not use this keyword from static context(static block,static method)
 * you can only use this keyword from instance context(instance block,instance method,constructor)
 * @author prtks
 *
 */
public class ThisKeyword {
	int a=20;
	  public ThisKeyword() {
		  System.out.println(this.a);
	}
	public void m1(int a) {
		this.a=a;
		System.out.println(this.a);
	}
	   {
		  System.out.println(this.a);
	  }
	
	  static {
		  System.out.println(this.a);
	  }
	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword();
		t.m1(30);
		System.out.println(this.a);
	}

}
