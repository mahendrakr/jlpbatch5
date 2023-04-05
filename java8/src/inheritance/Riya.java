package inheritance;
/**
 * this() is used to call other constructors of same class.
 * below example is of constructor chaining
 * recursive call of constructor is not allowed.if we do you will get compile time error.
 * this() and super() must be called from constructor only.and this() or super() should be
 * first statement. 
 * @author prtks
 *
 */
public class Riya extends Surbhi {
      public Riya() { 
    	  super(10);//it must be first statement.
    	  System.out.println("no argument constructor");
      }
      public Riya(int a) {
    	  this(20,30);
    	  System.out.println("one argument constructor");
      }
      public Riya(int a,int b) {
    	  this(40,50,60);
    	  System.out.println("two argument constructor");
      }
      public Riya(int a,int b,int c) {
    	 // this();
    	  System.out.println("three argument constructor");
      }
      public void m1() {
    	  //super();
      }
}
