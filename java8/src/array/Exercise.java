package array;

import Datatype.Student;

public class Exercise {
	public static void main(String[] args) {
		long[] arr4=new long[5];
		String[] arr5=new String[4];
		double[] arr6=new double[7];
		Student[] arr7=new Student[11];
		arr7[0]=new Student();
		arr7[7]=new Student();
		for(int i=0;i<11;i++) {
			System.out.println(arr7[i]);
		}
	}

}
