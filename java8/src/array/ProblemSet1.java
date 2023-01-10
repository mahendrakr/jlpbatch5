package array;

public class ProblemSet1 {
//find max value from the given arr={60,20,90,89,210,150,30}
	public static void main(String[] args) {
		int[] arr={60,20,90,89,210,150,30};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		int min=arr[0];
		for(int j=1;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
		}
		System.out.println(min);
		int secondMax=arr[0];
		for(int k=1;k<arr.length;k++) {
			if(secondMax<arr[k] && arr[k]<max) {
				secondMax=arr[k];
			}
		}
		System.out.println(secondMax);
		int maximum=arr[0];
		int second=arr[0];
		
		for(int l=1;l<arr.length;l++) {
			if(maximum<arr[l]) {
				second=maximum;
				maximum=arr[l];
			}
			else if(second<arr[l] && arr[l]<maximum) {
				second=arr[l];
			}
		}
		System.out.println(second);
	}

}
