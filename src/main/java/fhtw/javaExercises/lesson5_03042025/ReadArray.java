package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class ReadArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d. number: ", (i + 1));
            int n = sc.nextInt();
            numbers[i] = n;
        }
        System.out.println("Input finished.");

        int[] reverse = new int[10];
        int i = 1;
        for (int n : numbers) {
            reverse[10 - i] = n;
            i++;
        }
        i = 9;
        for (int n : reverse) {
            System.out.printf("[%d]: %d", (i--), n);
            System.out.println();
        }
        System.out.println("Output finished.");
    }
}
