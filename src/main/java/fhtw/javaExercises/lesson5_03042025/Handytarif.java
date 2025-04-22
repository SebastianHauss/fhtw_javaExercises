package fhtw.javaExercises.lesson5_03042025;

import java.util.Scanner;

public class Handytarif {
    static final double GRUNDTARIF = 5.99;
    static final double TELEFONIE = 0.99;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("min: ");
        int min = sc.nextInt();
        System.out.print("SMS: ");
        int sms = sc.nextInt();

        double telCost = 0;
        if (min < 0) {
            System.out.println("ungueltig.");
            return;
        }
        if (min > 100) {
            telCost = (min - 100) * Handytarif.TELEFONIE;
        }

        double smsCost = 0;
        if (sms < 0) {
            System.out.println("ungueltig.");
            return;
        }
        if (sms <= 10) {
            smsCost = sms * 0.05;
        }
        if (sms >= 11 && sms <= 20) {
            smsCost = 0.5 + (sms - 10) * 0.04;
        }
        if (sms >= 21 && sms <= 50) {
            smsCost = 0.9 + (sms - 20) * 0.03;
        }
        if (sms >= 51 && sms <= 100) {
            smsCost = 1.8 + (sms - 50) * 0.02;
        }
        if (sms >= 101 && sms <= 1000) {
            smsCost = 2.8 + (sms - 100) * 0.01;
        }

        double sum = 0;
        sum = Handytarif.GRUNDTARIF + telCost + smsCost;

        System.out.printf("zu bezahlen: %.2f + %.2f + %.2f = %.2f\n",
                Handytarif.GRUNDTARIF,
                telCost,
                smsCost,
                sum);
    }
}
