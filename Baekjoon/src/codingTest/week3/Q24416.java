package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24416 {
    static int code1;
    static int code2;
    static int n;
    static int[] f = new int[n];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        f = new int[n];

        code1 = 0;
        code2 = 0;

        fib(n);
        fibonacci(n);

        System.out.println(code1 + " " + code2);
    }

    // 코드1
    static int fib(int n) {
        if (n == 1 || n == 2) {
            code1++;
            return 1;
        } else {
            return (fib(n-1) + fib(n-2));
        }
    }

    // 코드2
    static int fibonacci(int n) {
        f[0]=1;
        f[1]=1;
        for (int i = 2; i < n; i++) {
            code2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1];

    }

}
