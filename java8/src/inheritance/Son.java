package inheritance;

public class Son extends Father {
	public void m1() {
		System.out.println("son");
	}
	@Override
  protected int m2(int a,String b) {
	   return 40;
   }
}
