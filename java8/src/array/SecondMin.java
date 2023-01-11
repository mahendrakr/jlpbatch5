package array;

public class SecondMin {
	public int getSecondMin(int[] arr) {
		int minValue = arr[0];
		int secondMin = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				secondMin = minValue;
				minValue = arr[i];
			} else if (secondMin > arr[i] && arr[i] > minValue) {
				secondMin = arr[i];
			}

		}
		return secondMin;
	}

}
