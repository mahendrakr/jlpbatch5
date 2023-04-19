package typecasting;

public class K {
	public void m1(F f) {
		if(f instanceof F) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
