package codingTest.week1;

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        int sum;
        int num = 0;
        if (num1 == num2 && num2 == num3) {
            sum = 10000 + num1 * 1000;
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            if (num1 == num2 || num1 == num3) {
                num = num1;
            } else {
                num = num2;
            }
            sum = 1000 + num * 100;
        } else {
            if (num1 > num2 && num1 > num3) {
                num = num1;
            } else if (num2 > num1 && num2 > num3) {
                num = num2;
            } else {
                num = num3;
            }
            sum = num * 100;
        }
        System.out.println(sum);
    }
}
