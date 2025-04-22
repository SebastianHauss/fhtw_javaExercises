package fhtw.javaExercises.lesson5_03042025;

import java.util.Arrays;
import java.util.Scanner;

public class GreaterLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        int[] leftGreater = new int[size];

        int biggest = 0;
        for (int i = 0; i < leftGreater.length; i++) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    num++;
                }
            }
            biggest = Math.max(biggest, num);
            leftGreater[i] = biggest;
            biggest = 0;
        }

        System.out.println(Arrays.toString(leftGreater));
        System.out.println(Arrays.toString(arr));
    }
}
