package inheritance;

public class ThisKeyword {
	int a=20;
	public void m1(int a) {
		this.a=a;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword();
		t.m1(30);
	}

}
