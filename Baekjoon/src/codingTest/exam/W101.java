package codingTest.exam;

import java.util.Scanner;
// 못 풀었음
public class W101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 스위치 개수
        int N = sc.nextInt();
        // 스위치 상태
        int[] state = new int[N];
        for (int i = 0; i < N; i++) {
            state[i] = sc.nextInt();
        }

        // 학생 수
        int student = sc.nextInt();

        for (int i = 0; i < student; i++) {
            int gen = sc.nextInt(); // 성별
            int num = sc.nextInt(); // 개수

            // 남학생
            if (gen == 1) {
                for (int j = 0; j < N; j++) {
                    if ((j-1)%num == 0) {
                        if (state[j] == 0) {
                            state[j] = 1;
                        } else {
                            state[j] = 0;
                        }
                    }
                }
            }

            // 여학생




        }


        sc.close();


    }
}
