package operator;

public class Comparison {
 public static void main(String[] args) {
	int a=10;
	if(a++>5 | ++a>10) {
		System.out.println(a);
	}
		else {
			System.out.println("else");
			System.out.println(a);
		}
	
}
}
