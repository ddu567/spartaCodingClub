package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class Q1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        str = str.toUpperCase();

        int[] count = new int[26];
        int max = 0;
        char result = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 65]++;
            if (max < count[str.charAt(i) - 65]) {
                max = count[str.charAt(i) - 65];
            }
        }
        br.close();

        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                num++;
                if (num > 1) {
                    result = '?';
                } else {
                    result = (char) (i + 65);
                }
            }

        }

        System.out.println(result);
    }
}
