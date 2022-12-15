package operator;

public class Typecast {
	public static void main(String[] args) {
		byte b=10;
		int i=130;
		byte b1=(byte)i;
		System.out.println(b1);
		//10000010
		int k=144;
		byte b2=(byte)k;
		System.out.println(b2);
		//10001100
	}

}
