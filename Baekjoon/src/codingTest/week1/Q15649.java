package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 못 풀었음
public class Q15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 백트래킹
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        br.close();

        /*
        int[][] arry = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arry[i][j] = 0;
            }
        }
        */


        int[] arryN = new int[N];
        int[] arryM = new int[M];
        for (int i = 1; i <= M; i++) {
            arryM[i-1] = i;

            for (int j = 1; j <= N; j++) {
                arryN[j-1] = j;
                System.out.println(arryN[i-1] + " " + arryM[j-1]);
            }

        }

    }
}
