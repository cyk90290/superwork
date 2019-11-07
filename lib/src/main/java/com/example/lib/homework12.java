package com.example.lib;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.print("(1~100): ");
        int n;
        int i, j, k, m;
        n = sc.nextInt();
        m = n;
        if (n <= 100) {
            for (k = 1; k <= m; k++) {
                for (j = n; j < m; j++) {
                    System.out.print(" ");
                }
                for (i = 1; i <= n; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                n--;
            }

        }
    }
}
