package array;

public class ThreeDimensionArray {
	public static void main(String[] args) {
		int[][][] arr= {
				{
					{1,2,3},{4},{5,6}
				},
				{
					{7},{8,9}
				}
		};
		System.out.println(arr[0][0][1]);
		System.out.println(arr[0][2][1]);
		System.out.println(arr[1][1][0]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
	}

}
