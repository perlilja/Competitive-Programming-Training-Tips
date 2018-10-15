package Java;

public class QuickSort {

	private QuickSort() {

	}

	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int leftBound, int rightBound) {
		int pivotValue = array[leftBound];
		int leftPointer = leftBound;
		int rightPointer = rightBound;
		if (leftBound < rightBound) {
			while (leftPointer < rightPointer) {
				if (array[leftPointer] > array[rightPointer]) {
					swap(array, leftPointer, rightPointer);
				}

				if (array[rightPointer] == pivotValue)
					leftPointer++;
				else if (array[leftPointer] == pivotValue)
					rightPointer--;
			}

			quickSort(array, leftBound, leftPointer - 1);
			quickSort(array, leftBound + 1, rightBound);
		}

	}

	private static void swap(int[] array, int elementOne, int elementTwo) {
		array[elementOne] = array[elementOne] + array[elementTwo];
		array[elementTwo] = array[elementOne] - array[elementTwo];
		array[elementOne] = array[elementOne] - array[elementTwo];
	}



}
