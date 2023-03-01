 package array;

public class EnhanceForLoop {
	public static void main(String[] args) {
		int[] arr1={10,20,30,40,50,60,70,80,90,100};
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		String[] arr2= {"sharad","nikita","riya","ritika"};
		for(String k:arr2) {
			System.out.print(k+" ");
		}
		System.out.println();
		int[][] arr3= {
				{4,5},{7},{8,9}
		};
		for(int[] i:arr3) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		int[][][] arr= {
				{
					{1,2,3},{4},{5,6}
				},
				{
					{7},{8,9}
				}
		};
		for(int[][] i:arr) {
			for(int[] j:i) {
				for(int k:j) {
					System.out.print(k+" ");
				}
			}
		}
	}

}
