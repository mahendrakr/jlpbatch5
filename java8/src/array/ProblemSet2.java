package array;

public class ProblemSet2 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int rc=3;
		int sc=3;
		int c=0;
		for(int i=0;i<rc;i++) {
			for(int j=0;j<sc;j++) {
				System.out.print(arr[c++]+" ");
			}
			System.out.println();		
		}
	}

}
