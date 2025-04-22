package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class Getrimmtesmittel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] betraege = new double[10];

        eingabe(betraege);

        System.out.print("Untergrenze: ");
        double min = sc.nextDouble();
        System.out.print("Obergrenze: ");
        double max = sc.nextDouble();

        double untrimmed = sum(betraege) / 10;
        System.out.printf("Mittel ungetrimmt: %.2f\n", untrimmed);

        double trimCount = trim(betraege, min, max);

        double trimmed = sum(betraege) / trimCount;
        System.out.printf("Mittel getrimmt: %.2f\n", trimmed);
    }

    public static int trim(double[] betraege, double min, double max) {
        int count = 0;

        for (int i = 0; i < betraege.length; i++) {
            if (betraege[i] < min) {
                betraege[i] = 0;
                count++;
            }
            if (betraege[i] > max) {
                betraege[i] = 0;
                count++;
            }
        }
        return count;
    }

    public static void eingabe(double[] betraege) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < betraege.length; i++) {
            System.out.printf("Zahl %d: ", (i + 1));
            betraege[i] = sc.nextDouble();
        }
    }

    public static double sum(double[] betraege) {
        double sum = 0;
        for (double betrag : betraege) {
            sum += betrag;
        }
        return sum;
    }
}
