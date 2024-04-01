package codingTest;

import java.util.Scanner;

public class Q2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = num - 1; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 상하반전
        for (int i = 0; i < num - 1; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = num - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
