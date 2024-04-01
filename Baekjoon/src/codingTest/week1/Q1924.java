package codingTest;

import java.util.Scanner;

public class Q1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();
        int totalDays = day;

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        for (int i = 0; i < month - 1; ++i) {
            totalDays += months[i];
        }

        System.out.println(days[totalDays % 7]);
    }
}
