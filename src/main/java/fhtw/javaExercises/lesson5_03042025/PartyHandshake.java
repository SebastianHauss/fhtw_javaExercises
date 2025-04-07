package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class PartyHandshake {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.printf(": ");
        int n = sc.nextInt();
        String[] names = readNames(n);
        String[] handshakes = handShakes(names);
        print(handshakes);
        sc.close();
    }

    public static String[] readNames(int n) {
        String[] names = new String[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        return names;
    }

    public static String[] handShakes(String[] names) {
        int totalHandshakes = names.length * (names.length - 1) / 2;
        String[] handshakes = new String[totalHandshakes];

        int index = 0;
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                handshakes[index] = names[i] + " -> " + names[j];
                index++;
            }
        }
        return handshakes;
    }

    public static void print(String[] stra) {
        for (String s : stra) {
            System.out.println(s);
        }
    }
}
