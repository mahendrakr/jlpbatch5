package array;

public class FindMax {
	public int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public int getSecondMax(int[] arr) {
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
		return second;
	}

}
