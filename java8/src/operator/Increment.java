package operator;

public class Increment {
	public static void main(String[] args) {
		int a=10;
		//a++;
		//++a;
		//System.out.println(++a);
		System.out.println(a++ + a++ + ++a + a++);
		int b=10;
		System.out.println(++b +b+ b++ + ++b + b);
		int c=10;
		System.out.println(c-- + c + c++ - c + ++c);
	}

}
