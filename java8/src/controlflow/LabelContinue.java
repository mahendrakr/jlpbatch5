package controlflow;

public class LabelContinue {
	public static void main(String[] args) {
		out:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2;j++) {
				if(i%2==0)
					continue out;
				System.out.println("j: "+j);
			}
			System.out.println("i: "+i);
		}
	System.out.println("end");
	}

}
