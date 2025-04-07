package fhtw.javaExercises.lesson5_03042025;

import java.util.Arrays;
import java.util.Scanner;

public class ZooManager {
    public static void main(String[] args) {

    }


    public static void read(float[] values) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("v: ");
            float value = sc.nextFloat();
            if (value == 0) {
                break;
            }
            values[i] = value;
        }
    }

    public static void print(float[] values) {
        System.out.print("{ ");
        for (float v : values) {
            System.out.printf("%.2f ", v);
        }
        System.out.println("}");
    }

    public static int count(float[] values) {
        int count = 0;
        for (float v : values) {
            if (v == 0) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void clear(float[] values) {
        Arrays.fill(values, 0);
    }

    public static float avg(float[] values) {
        float sum = 0;
        int count = 0;
        for (float v : values) {
            if (v == 0) {
                break;
            }
            sum += v;
            count++;
        }
        return sum / count;
    }

    public static float b_of_max_a(float[] a, float[] b) {
        if (a.length == 0 || b.length == 0) {
            return -1;
        }

        int maxA = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxA) {
                maxA = i;
            }
        }
        return b[maxA];
    }
}
