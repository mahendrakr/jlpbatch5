package array;

public class ArrayInitilization {
	public static void main(String[] args) {
		System.out.println(args.length);
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//better way
		int[] arr2={10,20,30,40,50,60,70,80,90,100};
		System.out.println();
		System.out.println(arr2.length);
		//System.out.println(arr2[6]);
	//	System.out.println(arr2[2]);
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+" ");
		}
	}

}
