package access1;

public class A {
	public int a=10;
	       int b=20;
	protected int c=30;
	private int d=40;
      public void m1() {
    	  System.out.println("m1");
      }
      protected void m2() {
    	  System.out.println("m2");
      }
       void m3() {
    	  System.out.println("m3");
      }
       private void m4() {
     	  System.out.println("m4");
       }
       public static void main(String[] args) {
    		A a=new A();
    		 a.m1();
    		 a.m2();
    		 a.m3();
    		a.m4();
    		 System.out.println(a.a);
    		 System.out.println(a.b);
    		 System.out.println(a.c);
    		System.out.println(a.d);
    	}
}
