package array;

import Datatype.Student;

public class Introduction {
	public static void main(String[] args) {
		//declaration of arrays(1D)
		int [] arr;
		int[] arr1;
		int []arr2;	
		//create array object
		int[] arr3=new int[5];
		long[] arr4=new long[5];
		String[] arr5=new String[4];
		double[] arr6=new double[7];
		Student[] arr7=new Student[11];
		//access array elements
		System.out.println(arr3[3]);
		System.out.println(arr3[2]);
		//System.out.println(arr3[-1]);
		System.out.println(arr5[2]);
		System.out.println(arr7[6]);
		//array initialization
		arr3[0]=10;
		arr3[1]=20;
		arr3[2]=30;
		arr3[3]=40;
		arr3[4]=50;
		System.out.println(arr3[3]);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[4]);
		System.out.println("*******");
		for(int i=0;i<5;i++) {
			System.out.println(arr3[i]);
		}
		
	}

}
