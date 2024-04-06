package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 잘 모름
public class Q1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        int row = 0;
        int col = 0;

        // 입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        br.close();

//        x로 자르고 + ".." 포함으로 생각
        /*
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

            }
        }
         */
        for(int i = 0; i < N; i++) {
            for (int j = 0 ; j < N; j++) {
                // 열
                if(i + 1 < N) {
                    if (arr[i][j] == '.' && arr[i+1][j] == '.' && (i + 2 >= N || arr[i+2][j] == 'X')) {
                        col += 1;
                    }
                }

                // 행
                if(j + 1 < N) {
                    if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= N || arr[i][j + 2] == 'X')) {
                        row += 1;
                    }
                }
            }
        }

        System.out.println(row + " " + col);
    }
}