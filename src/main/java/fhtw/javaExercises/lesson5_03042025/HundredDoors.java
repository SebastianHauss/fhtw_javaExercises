package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class HundredDoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] doors = new boolean[n];

        for (int person = 1; person <= n; person++) {
            for (int door = person - 1; door < n; door += person) {
                doors[door] = !doors[door];
            }
        }

        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
