
import java.util.Arrays;
import java.util.Scanner;

public class burble {

    private static void method1(int[] pArray) {
        // int iterations = 0;

        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray.length; j++) {
                if (pArray[i] < pArray[j]) {
                    int temp = pArray[i];
                    pArray[i] = pArray[j];
                    pArray[j] = temp;
                }
                // iterations++;
            }
        }

        System.out.println(Arrays.toString(pArray));
        // System.out.println(iterations);
    }

    private static void method2(int[] pArray) {
        // int iterations = 0;

        for (int i = 1; i < pArray.length; i++) {
            for (int j = 0; j < pArray.length - 1; j++) {
                if (pArray[i] < pArray[j]) {
                    int temp = pArray[i];
                    pArray[i] = pArray[j];
                    pArray[j] = temp;
                }
                // iterations++;
            }
        }

        System.out.println(Arrays.toString(pArray));
        // System.out.println(iterations);
    }

    private static void method3(int[] pArray) {
        // int iterations = 0;

        for (int i = 0; i < pArray.length - 1; i++) {
            for (int j = i + 1; j < pArray.length; j++) {
                if (pArray[i] > pArray[j]) {
                    int temp = pArray[i];
                    pArray[i] = pArray[j];
                    pArray[j] = temp;
                }
                // iterations++;
            }
        }

        System.out.println(Arrays.toString(pArray));
        // System.out.println(iterations);
    }

    private static void method4(int[] pArray) {
        // int iterations = 0;

        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (pArray[i] < pArray[j]) {
                    int temp = pArray[i];
                    pArray[i] = pArray[j];
                    pArray[j] = temp;
                }
                // iterations++;
            }
        }

        System.out.println(Arrays.toString(pArray));
        // System.out.println(iterations);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        int iteration = 0;

        while (iteration != cases) {
            iteration++;

            int length = scanner.nextInt();

            int[] array = new int[length];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            method1(array);
            method2(array);
            method3(array);
            method4(array);
        }
    }

}
