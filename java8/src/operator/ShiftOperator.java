package operator;

public class ShiftOperator {
	public static void main(String[] args) {
		int a=4;
		System.out.println(a>>2);
		int b=-4;
		System.out.println(b>>2);
		int c=-4;
		System.out.println(c<<2);
		int x=-1;
		System.out.println(x>>>2);
		//1073741823
		int y=1;
		System.out.println(y<<4);
		System.out.println(~4);
	}

}
