package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        int max = 0; // 최댓값
        int row = 0; // 행
        int column = 0; // 열
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
