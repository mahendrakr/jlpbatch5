package array;

public class Test {
	public static void main(String[] args) {
		FindMax max=new FindMax();
		int[] arr= {10,9,8,90,15,20,95,30};
		int max2 = max.getMax(arr);
		System.out.println(max2);
		System.out.println(max.getSecondMax(arr));
		SecondMin min=new SecondMin();
		System.out.println(min.getSecondMin(arr));
	}

}
