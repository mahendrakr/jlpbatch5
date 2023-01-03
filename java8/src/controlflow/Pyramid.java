package controlflow;

public class Pyramid {
	public static void main(String[] args) {
		int rc=4;
		int bc=3;
		int sc=1;
		for(int i=0;i<rc;i++) {
			for(int j=0;j<bc;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<sc;k++) {
				System.out.print("*");
			}
			bc--;
			sc=sc+2;
			System.out.println( );
		}
	}

}
