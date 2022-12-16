package operator;

public class AssignmentOperator {
	static int k;
	public static void main(String[] args) {
		int a,b,c;
		//a=b=c=30;
		  a=10;
		  b=20;
		  c=30;
		//int x=y=z=40; (invalid)
		//compound assignment operator
		int x=10;
		a+=10;
		System.out.println(a);
		x*=4;
		System.out.println(x);
        int y=50;
        y/=5;
        System.out.println(y);
       // int z+=10; (invalid)
        int p;
      //  p+=10;
        k+=10;
        System.out.println(k);
	}

}
