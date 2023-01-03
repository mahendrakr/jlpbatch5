package controlflow;

public class Triangle {
	public static void main(String[] args) {
		int rc=5;
		int sc=1;
		int bc=4;
		for(int i=0;i<rc;i++) {
			for(int j=0;j<bc;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<sc;k++) {
				System.out.print("*");
			}
			bc--;
			sc++;
			System.out.println( );
		}
	}

}
