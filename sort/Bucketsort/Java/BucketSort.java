package Java;

public class BucketSort {

    private BucketSort() { }

    private static int[] bucketSort(int maxInt, int arrayToSort[]){
        int buckets[] = new int[maxInt];

        for (int i = 0; i < arrayToSort.length-1; i++) {
            buckets[arrayToSort[i]] = arrayToSort[i];
        }

        return buckets;
    }

    private static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int maxInt = 100;

        int sortedArr[] = bucketSort(maxInt, arr[]);

        System.out.println("Sorted array: ");
        printArray(sortedArr);
    }
}
