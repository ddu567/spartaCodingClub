package codingTest;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 입력받을 줄의 개수

        for (int i = 0; i < num; i++) {
            int repeat = sc.nextInt(); // 반복할 숫자
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
