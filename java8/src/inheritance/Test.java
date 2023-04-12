package inheritance;

public class Test {

	public static void main(String[] args) {
		Father f=new Father();
		f.m1();
		//f.m5();
      Son s=(Son)f;
      s.m4();
	}

}
