package array;

public class GeneralConcept {
	public static void main(String[] args) {
		int[] arr=new int[5];
		byte[] arr2=new byte[10];
		//arr2=arr; error
		//arr=arr2; error
		int[] arr3=new int[3];
		arr3=arr;
		int[][] arr4=new int[4][5];
		//arr=arr4; error
		Object obj=arr;
		Object[] obj2=arr4;
		//int[] (array of ints) also known as object in java.
		//int[][] means array of array of ints.
		//array of(object)
		//Object[] 
	}

}
