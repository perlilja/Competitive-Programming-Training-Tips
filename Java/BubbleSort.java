package Java;

public class BubbleSort {
	private BubbleSort() {

	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					swap(array, j - 1, j);
				}
			}
		}

	}

	private static void swap(int[] array, int elementOne, int elementTwo) {
		array[elementOne] = array[elementOne] + array[elementTwo];
		array[elementTwo] = array[elementOne] - array[elementTwo];
		array[elementOne] = array[elementOne] - array[elementTwo];
	}

}
