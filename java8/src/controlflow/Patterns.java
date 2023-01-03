package controlflow;

public class Patterns {
	public static void main(String[] args) {
		int rc=5;
		int sc=1;
		for(int i=0;i<rc;i++) {
			for(int j=0;j<sc;j++) {
				System.out.print("*");
			}
			sc++;
			System.out.println( );
		}
	}

}
