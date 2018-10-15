package Java;

public class MergeSort {

	private static int[] tempPropagated;

	private MergeSort() {
	}

	public static void mergeSort(int[] array) {
		tempPropagated = new int[array.length];
		mergeSort(array, 0, array.length - 1);
	}

	private static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}

	}

	private static void merge(int[] array, int left, int middle, int right) {

		int leftStart = left;
		int index = leftStart;
		int rightStart = middle + 1;

		while (leftStart <= middle && rightStart <= right) {
			if (array[leftStart] <= array[rightStart]) {
				tempPropagated[index] = array[leftStart];
				leftStart++;
			} else {
				tempPropagated[index] = array[rightStart];
				rightStart++;
			}
			index++;
		}

		System.arraycopy(array, leftStart, tempPropagated, index, middle - leftStart + 1);
		System.arraycopy(array, rightStart, tempPropagated, index, right - rightStart + 1);
		System.arraycopy(tempPropagated, left, array, left, right - left + 1);

	}



}
