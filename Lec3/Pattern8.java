package Lec3;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int n = scn.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an number.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        scn.close();
    }
}
