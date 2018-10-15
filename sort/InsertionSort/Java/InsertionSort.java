package Java;

import java.util.Arrays;

public class InsertionSort {

    static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int insertionValue = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > insertionValue) {
                array[j] = array[j - 1];
                j = j - 1;
                array[j] = insertionValue;
            }
        }
        return array;
    }

    static void executeAndPrint(int array[]) {
        System.out.println(
                "Array before InsertionSort: "
                        + Arrays.toString(array)
                        + " Array after InsertionSort: "
                        + Arrays.toString(insertionSort(array))
        );
    }

    public static void main(String args[]) {
        int sortingArray[] = {99, 1, 42, 12, 84, 2, 94, 53, 927, 111, 999};
        executeAndPrint(sortingArray);
    }

}