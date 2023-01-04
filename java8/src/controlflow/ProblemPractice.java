package controlflow;

public class ProblemPractice {
	public static void main(String[] args) {
		int n=123;
		int r=0;
		while(n>0) {
			//r=n%10;
			r=r*10+n%10;
			//System.out.print(r);
			n=n/10;
		}
		System.out.println(r);
	}

}
