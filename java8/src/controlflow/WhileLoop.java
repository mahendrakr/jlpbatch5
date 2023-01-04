package controlflow;

public class WhileLoop {
	public static void main(String[] args) {
		int j=0;
		while(j++<3) {
			System.out.println("sharad");
			
		}
		int i=0;
		do {
			System.out.println("i am sharad");
			//i++;
		}
		while(i++<3);
	
		//scope
		int k=0;
		do {
			//int k=0;
			System.out.println(k);
		}
		while(k++<3);
	}

}
