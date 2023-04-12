package inheritance;

public class Son extends Father {
	public void m1() {
		System.out.println("son");
	}
	//@Override
  protected final int m5(int a,String b) {
	   return 40;
   }
  //@Override
  public final String m4() {
	  return null;
  }
}
