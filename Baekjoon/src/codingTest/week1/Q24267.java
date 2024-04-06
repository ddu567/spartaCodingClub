package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 못 풀었음
public class Q24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // algorithm
        int sum = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    sum += sum;
                }
            }
        }

    }
}
