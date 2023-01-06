package controlflow;

public class LabelBreak {
	public static void main(String[] args) {
		out:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				if(i==3)
					break out;
				System.out.println("innerloop");
			}
			System.out.println("outerloop");
		}
	System.out.println("end");
	}

}
