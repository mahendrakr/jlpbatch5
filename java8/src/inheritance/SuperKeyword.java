package inheritance;
/**
 * super keyword access immediate parent.
 * if local variable name and instance variable name are same,and by default local variable
 * has age over instance variable.and if you want access to parent instance variable then you
 * have to use super keyword.below is the reference
 * 
 * you can not use super keyword from static context(static block,static method)
 * you can only use super keyword from instance context(instance block,instance method,constructor)
 * @author prtks
 *
 */
public class SuperKeyword extends Parent1 {
	public int a=30;
public void m1(int a) {
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	System.out.println(super.m2());
	  super.a=a;
	  System.out.println(super.a);
}
public static void main(String[] args) {
	SuperKeyword s=new SuperKeyword();
	  s.m1(40);
}
}
